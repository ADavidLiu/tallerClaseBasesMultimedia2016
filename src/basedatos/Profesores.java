/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

/**
 *
 * @author Alejo
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private String identificacion;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    /**
     * Get the value of identificacion
     *
     * @return the value of identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Set the value of identificacion
     *
     * @param identificacion new value of identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
