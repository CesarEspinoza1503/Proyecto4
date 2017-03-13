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
    private final TDAVSArray restaurantes;
    private final TDAVSArray repartidores;
    

    public Graph() {
        map = null;
        this.colonias = readColonias();
        this.restaurantes = readRestaurantes();
        this.repartidores = readRepartidores();
        asignarRepartidores();
        
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
}
