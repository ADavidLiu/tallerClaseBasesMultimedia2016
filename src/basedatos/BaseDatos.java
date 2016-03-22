package basedatos;

/**
 *
 * @author Alejo
 */
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {

    /**
     * Método utilizado para recuperar el valor del atributo conexion
     *
     * @return conexion contiene el estado de la conexión
     *     
*/
    Connection conexion;
    Statement st;

    public BaseDatos() {
        //conexion
    }

    public Connection getConexion() {
        return conexion;
    }

    /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/uao", "root", "root");
            st = conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     *
     * Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
     *
     * @param sql Cadena que contiene la instrucción SQL a ejecutar
     * @return estado regresa el estado de la ejecución, true(éxito) o
     * false(error)
     *     
*/
    public boolean ejecutarSQL(String sql) {
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     *
     * Método utilizado para realizar la instrucción SELECT
     *
     * @param sql Cadena que contiene la instrucción SQL a ejecutar
     * @return resultado regresa los registros generados por la consulta
     *     
*/
    public String ejecutarSQLSelect(String sql) {
        ResultSet rs;
        int id;
        String nom = "";
        String tel = "";
        String dir = "";
        String concatenar = "";

        try {
            Statement sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1);
                nom = rs.getNString("nombreusuario");
                tel = rs.getNString("cedulausuario");
                dir = rs.getNString("celusuario");

                concatenar = id + " " + nom + " " + tel + " " + dir;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return concatenar;
    }

    public void storeProcedious() {
        CallableStatement statemen;
        try {
            statemen = conexion.prepareCall("{call INSERT_USUARIO(?,?,?)}");
            statemen.setString(1, "Gloria");
            statemen.setString(2, "3344");
            statemen.setString(3, "CAlle Medellin 7345");
            if (statemen.execute()) {
                System.out.println("si se realizó ");
            }

        } catch (Exception ex) {

        }
    }

    public void dd() {
        //Blob 
    }

    public void storeProcediousImage(String ruta) {
        CallableStatement statemen;
        FileInputStream fis = null;

        try {
            statemen = conexion.prepareCall("{call INSERT_USUARIO_PICTURE(?,?,?,?)}");
            File file = new File(ruta);
            System.out.println("ruta " + ruta);
            fis = new FileInputStream(file);
            statemen.setString(1, "Maria");
            statemen.setString(2, "555");
            statemen.setString(3, "Itagui");
            statemen.setBinaryStream(4, fis, (long) file.length());
            if (!statemen.execute()) {
                System.out.println("si se realizó ");
            }

        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean guardarImagen(String ruta, String nombre, String insert) {
        // String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            conexion.setAutoCommit(false);
            File file = new File(ruta);
            fis = new FileInputStream(file);
            ps = conexion.prepareStatement(insert);
            ps.setBinaryStream(1, fis, (int) file.length());
            ps.setString(2, nombre);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

//    public ArrayList<Imagen> getImagenes() throws IOException {
//        ArrayList<Imagen> lista = new ArrayList();
//        try {
//            ResultSet rs = st.executeQuery("SELECT nombreusuario,imagenusuario FROM usuario WHERE idusuario=11");
//            while (rs.next()) {
//                Imagen imagen = new Imagen();
//                Blob blob = rs.getBlob("imagenusuario");
//                String nombre = rs.getObject("nombreusuario").toString();
//                byte[] data = blob.getBytes(1, (int) blob.length());
//                BufferedImage img = null;
//                try {
//                    img = ImageIO.read(new ByteArrayInputStream(data));
//                } catch (IOException ex) {
//                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//                imagen.setImagen(img);
//                imagen.setNombre(nombre);
//                lista.add(imagen);
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }

}
