package CONFIG;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prestamo", "root", "");
            //System.out.println("conectado = ");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        Conexion co = new Conexion();
//    }

}
