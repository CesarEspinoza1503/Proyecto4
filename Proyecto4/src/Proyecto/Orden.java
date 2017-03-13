package Proyecto;

import java.util.Date;

/**
 *
 * @author CESAR
 * 
 * Clase de ordenes de clientes
 * 
 */
public class Orden {
    //TDAvsList...
    int codigo;
    String producto;
    double total;

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    public Orden(int codigo, String producto, double total) {
        this.codigo = codigo;
        this.producto = producto;
        this.total = total;
    }
    
    
}
