/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behind;

import basedatos.BaseDatos;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Alejo
 */
public class Estudiante {
    
    private String idestudiantes;
    private String codigoestudiante;
    private String nombreestudiante;
    private String apellidoestudiante;
    private String telefonoestudiante;
    private String direccionestudiante;
    private String correoestudiante;
    private String rutaImagenestudiante;

    public Estudiante() {
    }

    public Estudiante(String idestudiantes, String codigoestudiante, String nombreestudiante, String apellidoestudiante, String telefonoestudiante, String direccionestudiante, String correoestudiante,String imagenestudiante) {
        this.idestudiantes = idestudiantes;
        this.codigoestudiante = codigoestudiante;
        this.nombreestudiante = nombreestudiante;
        this.apellidoestudiante = apellidoestudiante;
        this.telefonoestudiante = telefonoestudiante;
        this.direccionestudiante = direccionestudiante;
        this.correoestudiante=correoestudiante;
        this.rutaImagenestudiante=imagenestudiante;
    }

    /**
     * Get the value of correoestudiante
     *
     * @return the value of correoestudiante
     */
    public String getCorreoestudiante() {
        return correoestudiante;
    }

    public String getRutaImagenestudiante() {
        return rutaImagenestudiante;
    }

    public void setRutaImagenestudiante(String rutaImagenestudiante) {
        this.rutaImagenestudiante = rutaImagenestudiante;
    }


    /**
     * Set the value of correoestudiante
     *
     * @param correoestudiante new value of correoestudiante
     */
    public void setCorreoestudiante(String correoestudiante) {
        this.correoestudiante = correoestudiante;
    }


    /**
     * Get the value of direccionestudiante
     *
     * @return the value of direccionestudiante
     */
    public String getDireccionestudiante() {
        return direccionestudiante;
    }

    /**
     * Set the value of direccionestudiante
     *
     * @param direccionestudiante new value of direccionestudiante
     */
    public void setDireccionestudiante(String direccionestudiante) {
        this.direccionestudiante = direccionestudiante;
    }


    /**
     * Get the value of telefonoestudiante
     *
     * @return the value of telefonoestudiante
     */
    public String getTelefonoestudiante() {
        return telefonoestudiante;
    }

    /**
     * Set the value of telefonoestudiante
     *
     * @param telefonoestudiante new value of telefonoestudiante
     */
    public void setTelefonoestudiante(String telefonoestudiante) {
        this.telefonoestudiante = telefonoestudiante;
    }


    /**
     * Get the value of apellidoestudiante
     *
     * @return the value of apellidoestudiante
     */
    public String getApellidoestudiante() {
        return apellidoestudiante;
    }

    /**
     * Set the value of apellidoestudiante
     *
     * @param apellidoestudiante new value of apellidoestudiante
     */
    public void setApellidoestudiante(String apellidoestudiante) {
        this.apellidoestudiante = apellidoestudiante;
    }


    /**
     * Get the value of nombreestudiante
     *
     * @return the value of nombreestudiante
     */
    public String getNombreestudiante() {
        return nombreestudiante;
    }

    /**
     * Set the value of nombreestudiante
     *
     * @param nombreestudiante new value of nombreestudiante
     */
    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }


    /**
     * Get the value of codigoestudiante
     *
     * @return the value of codigoestudiante
     */
    public String getCodigoestudiante() {
        return codigoestudiante;
    }

    /**
     * Set the value of codigoestudiante
     *
     * @param codigoestudiante new value of codigoestudiante
     */
    public void setCodigoestudiante(String codigoestudiante) {
        this.codigoestudiante = codigoestudiante;
    }


    /**
     * Get the value of idestudiantes
     *
     * @return the value of idestudiantes
     */
    public String getIdestudiantes() {
        return idestudiantes;
    }

    /**
     * Set the value of idestudiantes
     *
     * @param idestudiantes new value of idestudiantes
     */
    public void setIdestudiantes(String idestudiantes) {
        this.idestudiantes = idestudiantes;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idestudiantes=" + idestudiantes + ", codigoestudiante=" + codigoestudiante + ", nombreestudiante=" + nombreestudiante + ", apellidoestudiante=" + apellidoestudiante + ", telefonoestudiante=" + telefonoestudiante + ", direccionestudiante=" + direccionestudiante + ", correoestudiante=" + correoestudiante + '}';
    }

    public boolean insertarEstudiante(ArrayList<Estudiante> arrEst){
        String sql="";
        BaseDatos objBases=new BaseDatos();
        boolean conexion=false;
        boolean insertar=false;
        
        sql="INSERT INTO ESTUDIANTES (idestudiantes,codigoestudiante,nombreestudiante,apellidoestudiante,telefonoestudiante,direccionestudiante,correoestudiante,imagenestudiante) VALUES(?,?,?,?,?,?,?,?)";
        
        for (Estudiante arrEst1 : arrEst) {
            conexion=objBases.crearConexion();
            if (conexion) {
                insertar = objBases.sqlInsertWithImageEstudiante(arrEst1.getRutaImagenestudiante(), sql, 
                        arrEst1.getIdestudiantes(), arrEst1.getCodigoestudiante(), arrEst1.getNombreestudiante(), 
                        arrEst1.getApellidoestudiante(), arrEst1.getTelefonoestudiante(), arrEst1.getDireccionestudiante(), 
                        arrEst1.getCorreoestudiante());
            }
        }
        return insertar;
    }
    
    
    
}
