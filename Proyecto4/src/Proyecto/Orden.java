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
    
    
    
}
