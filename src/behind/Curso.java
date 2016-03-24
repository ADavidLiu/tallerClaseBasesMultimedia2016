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
public class Curso {
    
    //el codigo es auto generado
    private String nombrecurso;
    private String periodoacademico;
    private String idprofesorc;
    private String horarioc;

    public Curso() {
    }

    public Curso(String nombrecurso, String periodoacademico, String idprofesorc, String horarioc) {
        this.nombrecurso = nombrecurso;
        this.periodoacademico = periodoacademico;
        this.idprofesorc = idprofesorc;
        this.horarioc = horarioc;
    }

    /**
     * Get the value of horarioc
     *
     * @return the value of horarioc
     */
    public String getHorarioc() {
        return horarioc;
    }

    /**
     * Set the value of horarioc
     *
     * @param horarioc new value of horarioc
     */
    public void setHorarioc(String horarioc) {
        this.horarioc = horarioc;
    }


    /**
     * Get the value of idprofesorc
     *
     * @return the value of idprofesorc
     */
    public String getIdprofesorc() {
        return idprofesorc;
    }

    /**
     * Set the value of idprofesorc
     *
     * @param idprofesorc new value of idprofesorc
     */
    public void setIdprofesorc(String idprofesorc) {
        this.idprofesorc = idprofesorc;
    }


    /**
     * Get the value of periodoacademico
     *
     * @return the value of periodoacademico
     */
    public String getPeriodoacademico() {
        return periodoacademico;
    }

    /**
     * Set the value of periodoacademico
     *
     * @param periodoacademico new value of periodoacademico
     */
    public void setPeriodoacademico(String periodoacademico) {
        this.periodoacademico = periodoacademico;
    }


    /**
     * Get the value of nombrecurso
     *
     * @return the value of nombrecurso
     */
    public String getNombrecurso() {
        return nombrecurso;
    }

    /**
     * Set the value of nombrecurso
     *
     * @param nombrecurso new value of nombrecurso
     */
    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombrecurso=" + nombrecurso + ", periodoacademico=" + periodoacademico + ", idprofesorc=" + idprofesorc + ", horarioc=" + horarioc + '}';
    }

}
