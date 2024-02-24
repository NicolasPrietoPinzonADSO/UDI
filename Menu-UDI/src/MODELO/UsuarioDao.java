package MODELO;

import VISTA.Login;

import CONFIG.Conexion;
import java.sql.*;
import javax.swing.JLabel;

/**
 *
 * @author Andresito.vip
 */
public class UsuarioDao {

    public static int usuarioIdActual;
    Login frame = new Login();

    public static boolean authenticate(String username, String password) {
        try (Connection cn = Conexion.conectar(); PreparedStatement ps = cn.prepareStatement("SELECT idUsuario FROM tb_Usuario WHERE BINARY usuario=? AND contrasena=? AND rol='ADMIN'")) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int userId = rs.getInt("idUsuario");
                    usuarioIdActual = userId;
                    return true;
                }
            }
        } catch (SQLException e) {
            // Registrar la excepción en el log de la aplicación.
            System.err.println("Error al autenticar como admin: " + e.getMessage());
        }

        return false;
    }

    public String obtenerNombreUsuarioActual() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String nombreUsuario = null;

        try {
            connection = Conexion.conectar();
            String sql = "SELECT usuario FROM usuario WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, usuarioIdActual); // usuarioIdActual debe ser un campo o propiedad en tu clase UsuarioDao

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                nombreUsuario = resultSet.getString("usuario");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el nombre de usuario actual: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

        return nombreUsuario;
    }

    public void setNombreUsuarioActual(JLabel userLabel) {
        String nombreUsuario = obtenerNombreUsuarioActual();
        if (nombreUsuario != null) {
            userLabel.setText("@" + nombreUsuario);
        }
    }
}
