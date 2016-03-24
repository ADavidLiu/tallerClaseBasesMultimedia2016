/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behind;

/**
 *
 * @author Alejo
 */
public class Profesiones {
    
    private String titulo;
    private String idprofesor;

    public Profesiones() {
    }

    public Profesiones(String titulo, String idprofesor) {
        this.titulo = titulo;
        this.idprofesor = idprofesor;
    }

    /**
     * Get the value of idprofesor
     *
     * @return the value of idprofesor
     */
    public String getIdprofesor() {
        return idprofesor;
    }

    /**
     * Set the value of idprofesor
     *
     * @param idprofesor new value of idprofesor
     */
    public void setIdprofesor(String idprofesor) {
        this.idprofesor = idprofesor;
    }


    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Profesiones{" + "titulo=" + titulo + ", idprofesor=" + idprofesor + '}';
    }

}
