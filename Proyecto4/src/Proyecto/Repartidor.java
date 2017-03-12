/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author TFK
 */
public class Repartidor extends Persona {
    boolean available;
    Orden ordenEntregar;
    public Repartidor(String nombre) {
        super(nombre);
        available = true;
    }

    public Orden getOrdenEntregar() {
        return ordenEntregar;
    }

    public void setOrdenEntregar(Orden ordenEntregar) {
        this.ordenEntregar = ordenEntregar;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "available=" + available + '}';
    }
    
    
}
