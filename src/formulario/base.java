package formulario;

import java.sql.*;

public class base {
//variables para la coneccion a la base
    private static Connection conexion = null;
    private static Statement sta = null;
//metodo que conecta con la base de datos
    public static Connection obtener() throws SQLException, ClassNotFoundException {
        data objdata = new data(); //objeto de la clase data para que tariga los datos
        String nombre = objdata.getNombre();
        String paterno = objdata.getPat();
        String materno = objdata.getMat();
        String escuela = objdata.getSkl();
//conecta con la base 
        if (conexion == null) {
            try {
                //trata de conectar con la base pero si no la encuentra, envia un error 
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/Registro", "root", "n0m3l0");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
            try {
                //guarda los datos en la base de datos
                sta.executeUpdate("INSERT INTO datos Values('" + nombre + "','" + paterno + "','" + materno + "','" + escuela + "');");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            }

        }
        return conexion;
    }
 //cierra el metodo
    public static void cerrar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}