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
public class Matricula {
    
    private int codigocursom;
    private String codigoestudiantem;

    public Matricula() {
    }

    public Matricula(int codigocursom, String codigoestudiantem) {
        this.codigocursom = codigocursom;
        this.codigoestudiantem = codigoestudiantem;
    }

    /**
     * Get the value of codigoestudiantem
     *
     * @return the value of codigoestudiantem
     */
    public String getCodigoestudiantem() {
        return codigoestudiantem;
    }

    /**
     * Set the value of codigoestudiantem
     *
     * @param codigoestudiantem new value of codigoestudiantem
     */
    public void setCodigoestudiantem(String codigoestudiantem) {
        this.codigoestudiantem = codigoestudiantem;
    }


    /**
     * Get the value of codigocursom
     *
     * @return the value of codigocursom
     */
    public int getCodigocursom() {
        return codigocursom;
    }

    /**
     * Set the value of codigocursom
     *
     * @param codigocursom new value of codigocursom
     */
    public void setCodigocursom(int codigocursom) {
        this.codigocursom = codigocursom;
    }

    @Override
    public String toString() {
        return "Matricula{" + "codigocursom=" + codigocursom + ", codigoestudiantem=" + codigoestudiantem + '}';
    }

    
    
}
