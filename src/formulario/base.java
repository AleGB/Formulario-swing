package formulario;

import java.sql.*;

public class base {

    private static Connection conexion = null;
    private static Statement state = null;

    public static Connection traer() throws SQLException, ClassNotFoundException {
        data objdata = new data();
        String nombre = objdata.getNombre();
        String paterno = objdata.getPat();
        String materno = objdata.getMat();
        String escuela = objdata.getSkl();

        if (conexion == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/Registro", "root", "n0m3l0");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
            try {
                
                state.executeUpdate("INSERT INTO datos Values('" + nombre + "','" + paterno + "','" + materno + "','" + escuela + "');");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            }

        }
        return conexion;
    }

    public static void terminar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
