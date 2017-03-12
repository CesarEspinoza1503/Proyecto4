/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import TDA.TDAVSArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

public final class Graph {
    private final MultiGraph map;
    private final TDAVSArray colonias;
    private final TDAVSArray clientes;

    public Graph() {
        map = null;
        this.clientes = readFile();
        this.colonias = setColonias();
//        this.map = createGraph(this.colonias);
//        for(Node n:this.map.getEachNode()) {
//            n.addAttribute("ui.label", n.getId());
//        }
//        this.map.addAttribute("ui.stylesheet", "node { text-visibility-mode: normal; }");
//        for(Edge e:this.map.getEachEdge()) {
//             e.addAttribute("ui.label", e.getId());
//        }
//        this.map.addAttribute("ui.stylesheet", "node {\n" +
//            "	size: 2px;\n" +
//            "	fill-color: #777;\n" +
//            "	text-mode: hidden;\n" +
//            "	z-index: 0;\n" +
//            "}");
//        this.map.addAttribute("ui.stylesheet", "edge {\n" +
//        "	shape: line;\n" +
//        "	fill-color: #222;\n" +
//        "	arrow-size: 4px, 3px;\n" +
//        "}");
        
    }
    
    public MultiGraph getMap() {
        return map;
    }

    public TDAVSArray getClientes() {
        return clientes;
    }

    public TDAVSArray getColonias() {
        return colonias;
    }
    
    public TDAVSArray setColonias() {
        TDAVSArray temp = new TDAVSArray();
        for (int i = 0; i < this.clientes.size(); i++) {
            temp.insert(((Cliente)clientes.get(i)).getDireccion(), i);
        }
        return temp;
    }
    
    public ArrayList<Node> getNodes() {
        ArrayList<Node> temp = new ArrayList();
        for (Node node : map){
            temp.add(node);
        }
        return temp;
    }
    
    public TDAVSArray readFile(){
        TDAVSArray temp= new TDAVSArray();
     
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        file = new File("./clientes.txt");
        ArrayList<String> cliente = new ArrayList();
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String texto;
            String texto2;
            String name,adress;
            int phonenumber;
            while((texto=br.readLine())!=null){
                texto2 =texto;
                cliente.add(texto2);
            }
            String clients;
            for (int i = 0; i < cliente.size(); i++) {
                clients = cliente.get(i);
                System.out.println(clients);
                StringTokenizer st = new StringTokenizer(clients,",");
                name = st.nextToken();
                adress = st.nextToken();
                phonenumber = Integer.parseInt(st.nextToken());
                temp.insert(new Cliente(adress,name,phonenumber),i);
            }  
        }
        catch(IOException | NumberFormatException e){
                System.out.println("Error al leer");
        }
        return temp;
    }
    
    
}
