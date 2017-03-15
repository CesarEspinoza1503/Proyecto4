package Proyecto;

import TDA.TDAQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CESAR
 * 
 *
 * 
 */
public class Orden {
    String codigo;
    String producto;
    double total;

    public Orden() {
    }
    
    public Orden(String producto, double total) {
        this.producto = producto;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int pizzaCost(int pizza_selection){
        int costo_pizza = 0;
        if (pizza_selection == 0) {
            costo_pizza = 290;
        }
        if (pizza_selection == 1) {
            costo_pizza = 280;
        }
        if (pizza_selection == 2) {
            costo_pizza = 318;
        }
        if (pizza_selection == 3) {
            costo_pizza = 280;
        }
        if (pizza_selection == 4) {
            costo_pizza = 263;
        }
        if (pizza_selection == 5) {
            costo_pizza = 263;
        }
        return costo_pizza;
    }
    
    public Orden(String codigo, String producto, double total) {
        this.codigo = codigo;
        this.producto = producto;
        this.total = total;
    }

    @Override
    public String toString() {
        return codigo;
    }
    
    public void salvarOrdenes(Orden Orden_aSalvar){
        File archivo = new File("Ordenes.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,true);
            bw = new BufferedWriter(fw);
            Orden temp;
            temp = Orden_aSalvar;
            bw.write(temp.getCodigo() + ",");
            bw.write(temp.getProducto() + ",");
            bw.write(Double.toString(temp.getTotal()));
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public TDAQueue cargarOrdenes(){
        TDAQueue ordenes = new TDAQueue();
        File archivo = new File("Ordenes.txt");
        FileReader fr = null;
        BufferedReader br = null;
        String texto;
        try {
            fr = new  FileReader(archivo);
            br = new BufferedReader(fr);
            while((texto=br.readLine())!=null){
                String[] tokens = texto.split(",");
                Orden orden_temp = new Orden(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
                System.out.println(tokens[0] + tokens[1] + tokens[2]);
                ordenes.Queue(orden_temp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ordenes;
    }
    
}
