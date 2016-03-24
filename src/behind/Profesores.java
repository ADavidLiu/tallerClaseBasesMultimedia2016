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
public class Profesores {

    private String nombrep;
    private String apellidop;
    private String identificacion;
    private String telefonop;
    private String direccionp;
    private String correop;
    private String tipovinculacionp;

    public Profesores() {
    }

    public Profesores(String nombrep, String apellidop, String identificacion, String telefonop, String direccionp, String correop, String tipovinculacionp) {
        this.nombrep = nombrep;
        this.apellidop = apellidop;
        this.identificacion = identificacion;
        this.telefonop = telefonop;
        this.direccionp = direccionp;
        this.correop = correop;
        this.tipovinculacionp = tipovinculacionp;
    }

    /**
     * Get the value of tipovinculacionp
     *
     * @return the value of tipovinculacionp
     */
    public String getTipovinculacionp() {
        return tipovinculacionp;
    }

    /**
     * Set the value of tipovinculacionp
     *
     * @param tipovinculacionp new value of tipovinculacionp
     */
    public void setTipovinculacionp(String tipovinculacionp) {
        this.tipovinculacionp = tipovinculacionp;
    }


    /**
     * Get the value of correop
     *
     * @return the value of correop
     */
    public String getCorreop() {
        return correop;
    }

    /**
     * Set the value of correop
     *
     * @param correop new value of correop
     */
    public void setCorreop(String correop) {
        this.correop = correop;
    }


    /**
     * Get the value of direccionp
     *
     * @return the value of direccionp
     */
    public String getDireccionp() {
        return direccionp;
    }

    /**
     * Set the value of direccionp
     *
     * @param direccionp new value of direccionp
     */
    public void setDireccionp(String direccionp) {
        this.direccionp = direccionp;
    }


    /**
     * Get the value of telefonop
     *
     * @return the value of telefonop
     */
    public String getTelefonop() {
        return telefonop;
    }

    /**
     * Set the value of telefonop
     *
     * @param telefonop new value of telefonop
     */
    public void setTelefonop(String telefonop) {
        this.telefonop = telefonop;
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
        return apellidop;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellidop = apellido;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombrep;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombrep = nombre;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombrep=" + nombrep + ", apellidop=" + apellidop + ", identificacion=" + identificacion + ", telefonop=" + telefonop + ", direccionp=" + direccionp + ", correop=" + correop + ", tipovinculacionp=" + tipovinculacionp + '}';
    }

}
