/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Image;

/**
 *
 * @author Alejo
 */
public class Imagen {
    Image imagen;
    String nombre;
 
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public Image getImagen() {
        return imagen;
    }
 
    public String getNombre() {
        return nombre;
    }



}
