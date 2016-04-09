/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behind;

import basedatos.BaseDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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


    public String getCorreoestudiante() {
        return correoestudiante;
    }

    public String getRutaImagenestudiante() {
        return rutaImagenestudiante;
    }

    public void setRutaImagenestudiante(String rutaImagenestudiante) {
        this.rutaImagenestudiante = rutaImagenestudiante;
    }


    public void setCorreoestudiante(String correoestudiante) {
        this.correoestudiante = correoestudiante;
    }


    public String getDireccionestudiante() {
        return direccionestudiante;
    }


    public void setDireccionestudiante(String direccionestudiante) {
        this.direccionestudiante = direccionestudiante;
    }


    public String getTelefonoestudiante() {
        return telefonoestudiante;
    }


    public void setTelefonoestudiante(String telefonoestudiante) {
        this.telefonoestudiante = telefonoestudiante;
    }


    public String getApellidoestudiante() {
        return apellidoestudiante;
    }

    public void setApellidoestudiante(String apellidoestudiante) {
        this.apellidoestudiante = apellidoestudiante;
    }


    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }


    public String getCodigoestudiante() {
        return codigoestudiante;
    }

    public void setCodigoestudiante(String codigoestudiante) {
        this.codigoestudiante = codigoestudiante;
    }

  
    public String getIdestudiantes() {
        return idestudiantes;
    }


    public void setIdestudiantes(String idestudiantes) {
        this.idestudiantes = idestudiantes;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idestudiantes=" + idestudiantes + ", codigoestudiante=" + codigoestudiante + ", nombreestudiante=" + nombreestudiante + ", apellidoestudiante=" + apellidoestudiante + ", telefonoestudiante=" + telefonoestudiante + ", direccionestudiante=" + direccionestudiante + ", correoestudiante=" + correoestudiante + '}';
    }
    
    public String updateEstudiante(String id, String code, String name, String lastnm, String tel, String address, String email) {
        String sql = "UPDATE estudiantes SET idestudiantes = '" + id + "', codigoestudiante = '" + code + 
                "', nombreestudiante = '" + name + "', apellidoestudiante = '" + lastnm + "', telefonoestudiante = '" +
                tel + "', direccionestudiante = '" + address + "', correoestudiante = '" + email + "' where codigoestudiante = '" + code + "'";
        JOptionPane.showMessageDialog(null, "Información actualizada");
        return sql;
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
