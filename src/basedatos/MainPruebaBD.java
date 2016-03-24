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
public class MainPruebaBD {

    //Comentario 1
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        BaseDatos objBases= new BaseDatos();
        boolean conexion;
        String sql="";
        conexion=objBases.crearConexion();
        if(conexion){
            sql="insert into profesores (identificacion, nombre, apellido, telefono) values('4567','Pedro','Benavides', '12121')";
            objBases.ejecutarSQL(sql);
            System.out.println("conexión exitosa");
        }else{
            System.out.println("no se pudo realizar la conexión");
        }
    }
    
}
