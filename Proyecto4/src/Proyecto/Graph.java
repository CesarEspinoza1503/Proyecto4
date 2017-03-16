/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import TDA.TDAVSArray;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.ProxyPipe;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

public final class Graph {
    private final MultiGraph map;
    private final TDAVSArray colonias;
    private final TDAVSArray restaurantes;
    private final TDAVSArray repartidores;
    

    public Graph() {
        this.colonias = readColonias();
        this.restaurantes = readRestaurantes();
        this.repartidores = readRepartidores();
        map = createGraph();
        asignarRepartidores();
        for(Node n:this.map.getEachNode()) {
            n.addAttribute("ui.label", n.getId());
        }
        
//        this.map.addAttribute("ui.stylesheet", "node { text-visibility-mode: hidden; }");
//        for(Edge e:this.map.getEachEdge()) {
//             e.addAttribute("ui.label", e.getId());
//        }
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        map.addAttribute("ui.quality");
        map.addAttribute("ui.stylesheet", readCSS());
        putImages();
        
    }
    
    public MultiGraph getMap() {
        return map;
    }

    public TDAVSArray getRestaurantes() {
        return restaurantes;
    }

    public TDAVSArray getRepartidores() {
        return repartidores;
    }

    public TDAVSArray getColonias() {
        return colonias;
    }
    
    public ArrayList<Node> getNodes() {
        ArrayList<Node> temp = new ArrayList();
        for (Node node : map){
            temp.add(node);
        }
        return temp;
    }
    
    public TDAVSArray readColonias(){
        TDAVSArray temp= new TDAVSArray();
     
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        file = new File("./colonias.txt");
        ArrayList<String> colonia = new ArrayList();
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String texto;
            String texto2;
            while((texto=br.readLine())!=null){
                texto2 =texto;
                colonia.add(texto2);
            }
            for (int i = 0; i < colonia.size(); i++) {
                temp.insert(colonia.get(i),i);
            }  
        }
        catch(IOException | NumberFormatException e){
                System.out.println("Error al leer cool");
        }
        return temp;
    }
    
    public TDAVSArray readRestaurantes(){
        TDAVSArray temp= new TDAVSArray();
     
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        file = new File("./restaurantes.txt");
        ArrayList<String> listaRestaurantes = new ArrayList();
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String texto;
            String texto2;
            while((texto=br.readLine())!=null){
                texto2 =texto;
                listaRestaurantes.add(texto2);
            }
            for (int i = 0; i < listaRestaurantes.size(); i++) {
                temp.insert(new Restaurante(listaRestaurantes.get(i)),i);
            }  
        }
        catch(IOException | NumberFormatException e){
                System.out.println("Error al leer rest");
        }
        return temp;
    }
    
    public TDAVSArray readRepartidores(){
        TDAVSArray temp= new TDAVSArray();
     
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        file = new File("./repartidores.txt");
        ArrayList<String> listaRepartidores = new ArrayList();
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String texto;
            String texto2;
            while((texto=br.readLine())!=null){
                texto2 =texto;
                listaRepartidores.add(texto2);
            }
            String delivery;
            for (int i = 0; i < listaRepartidores.size(); i++) {
                delivery = listaRepartidores.get(i);
                StringTokenizer st = new StringTokenizer(delivery,",");
                temp.insert(new Repartidor(st.nextToken(),st.nextToken()),i);
            }  
        }
        catch(IOException | NumberFormatException e){
                System.out.println("Error al leer rep");
        }
        return temp;
    }
    public void asignarRepartidores(){
        for (int i = 0; i < restaurantes.size(); i++) {
            for (int j = 0; j < repartidores.size(); j++) {
                if(((Repartidor)repartidores.get(j)).getRestaurante().equals(((Restaurante)restaurantes.get(i)).getNombre())){
                    ((Restaurante)restaurantes.get(i)).addRepartidores((Repartidor)repartidores.get(j));
                }
            }
        }
    }
    
    public void writeRepartidores(TDAVSArray repartidores){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter("./repartidor.txt",false);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < repartidores.size(); i++){
                if(i!=repartidores.size()-1){
                    bw.write(((Repartidor)repartidores.get(i)).getNombre() + ",");
                    bw.write(((Repartidor)repartidores.get(i)).getRestaurante());
                    bw.newLine();
                }else{
                    bw.write(((Repartidor)repartidores.get(i)).getNombre() + ",");
                    bw.write(((Repartidor)repartidores.get(i)).getRestaurante());
                }
               
            }
        }catch(Exception ex){
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception ex){
                
            }
        }  
    }
    
    public MultiGraph createGraph(){
        MultiGraph temp =new MultiGraph("temp");
        temp.setStrict(false);
        temp.setAutoCreate( true );
        Random r= new Random();
        String id = "";
        int rand = 0;
        boolean existe;
        ArrayList<String> ids = new ArrayList();
        for (int i = 0; i < restaurantes.size(); i++) {
            for (int j = 0; j < colonias.size(); j++) {
                existe = false;
                while(!existe){
                    rand = r.nextInt(1000)+1;
                    id = "" + rand + " km";
                    existe = idExists(id,ids); 
                    if(existe){
                        ids.add(id);
                    }                  
                }
                temp.addEdge(id, ((Restaurante)restaurantes.get(i)).getNombre(), colonias.get(j).toString());
                temp.getEdge(id).addAttribute("distance", rand);
            }
        }
        return temp;
    }
    
    public void showGraph(double zoomValue,MultiGraph map){//Metodo para hacer el display del grafo
        Viewer CLAgraphViewer = new Viewer(map,Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        View view = CLAgraphViewer.addDefaultView(true);
        CLAgraphViewer.enableAutoLayout();
        ProxyPipe viewerPipe = CLAgraphViewer.newViewerPipe();
        viewerPipe.addAttributeSink(map);
//        view.getCamera().setViewCenter(1,1,-1);
//        view.getCamera().setViewPercent(zoomValue);//Zoom de la camara del grafo
        CLAgraphViewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);//metodo que ayuda a que el programa no se cierre cuando uno sale del grafo
    }
    
    public boolean idExists(String id,ArrayList<String> ids){
        for (String edge : ids) {
            if(edge.equals(id)){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Node> DijkstraDistance(Node source,Node destination){//metodo dijkstra para 
        ArrayList<Node> temp = new ArrayList();
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "distance");
        dijkstra.init(map);
        dijkstra.setSource(source);
	dijkstra.compute();
        for (Node node : dijkstra.getPathNodes(destination)){
            temp.add(0, node);
        }  
        return temp;
    }
    
    public String mejorRuta(Node colonia){
        String temp = "";
        ArrayList<Integer> distancias = new ArrayList(); 
        for (int i = 0; i < restaurantes.size(); i++) {
            Node restaurant = map.getNode(((Restaurante)restaurantes.get(i)).getNombre());
            DijkstraDistance(restaurant,colonia);
            for(Edge e:map.getEachEdge()) {
                if(e.getNode0() == restaurant && e.getNode1()==colonia){
                    System.out.println("lol");
                    distancias.add((int)e.getAttribute("distance"));
                    System.out.println((int)e.getAttribute("distance"));
                 }
            }
        }
        int mejorDistancia = 1000000,index = 0;
        for (int i = 0; i < distancias.size(); i++) {
            if(distancias.get(i) < mejorDistancia){
                mejorDistancia = distancias.get(i);
                index = i;
            }
        }
        temp = ((Restaurante)restaurantes.get(index)).getNombre();
        
        return temp;
    }
    
    public String readCSS() {//Metodo para leer el texto con el CSS(El css es para personalizar los nodos y aristas) 
        String css = "";
        try {
            FileReader fr = new FileReader("./css.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                css += line;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return css;
    }
    
    public void applyChanges(Node restaurante,boolean defaul){
        for (Edge edge : map.getEachEdge()) {
            edge.addAttribute("ui.style", "fill-color: blue;");
            edge.addAttribute("ui.label", "");
        }
        if(!defaul){
            for (Edge edge : map.getEachEdge()) {
                if(edge.getNode0() == restaurante){
                    edge.addAttribute("ui.style", "fill-color: white; text-color:black; shape: cubic-curve; size:3px;");
                    edge.addAttribute("ui.label", edge.getId());
                }
            }
        }
    }
    
    public void putImages(){
        for (Node node : map.getEachNode()) {
            node.addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('./house.png'); text-alignment:right; stroke-mode: none; size: 30px;");
        }
        for (Node node : map.getEachNode()) {
            for (int i = 0; i < restaurantes.size(); i++) {
                if(node.getId().equals(((Restaurante)restaurantes.get(i)).getNombre())){
                    node.addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('./pizza.png'); text-alignment:right; stroke-mode: none; size: 30px;");  
                }
            }
        }
    }
}
