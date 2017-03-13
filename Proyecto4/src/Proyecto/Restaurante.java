/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

/**
 *
 * @author TFK
 */
public class Restaurante {
    String nombre;
    ArrayList<Repartidor> repartidores;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        repartidores = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Repartidor> getRepartidores() {
        return repartidores;
    }

    public void addRepartidores(Repartidor repartidor) {
        this.repartidores.add(repartidor);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
