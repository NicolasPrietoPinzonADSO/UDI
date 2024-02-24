package DAO;

import CONFIG.Conexion;
import MODELO.ModelDocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class DocenteDao {

    public static boolean validarDocente(ModelDocente modelo) {
        try (Connection cn = Conexion.conectar(); PreparedStatement ps = cn.prepareStatement("SELECT cedula FROM tb_docente WHERE cedula = ?")) {
            setParameters(ps, modelo.getCedula());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return false;
                } else {
                    return insertarDocente(modelo);
                }

            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean insertarDocente(ModelDocente modelo) {
        try (Connection cn = Conexion.conectar(); PreparedStatement ps = cn.prepareStatement("INSERT INTO tb_docente(nombreDocente,apellidoDocente,cedula,estado) VALUES (?,?,?,?)")) {

            setParameters(ps, modelo.getNombreDocente(), modelo.getApellidoDocente(), modelo.getCedula(), 1);

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return false;
    }

    public static DefaultTableModel cargarTabla() {
        // Instanciamos el DefaultTableModel para generar la tabla 
        DefaultTableModel tabla = new DefaultTableModel();
        // Le damos los títulos a las columnas
        String[] titulosColumnas = {"ID", "Nombre", "Apellido", "Cedula", "Estado"};
        // Seteamos los identificadores de las columnas
        tabla.setColumnIdentifiers(titulosColumnas);

        try (Connection cn = CONFIG.Conexion.conectar(); PreparedStatement ps = cn.prepareStatement("SELECT idDocente, nombreDocente, apellidoDocente, cedula, CASE WHEN estado = 1 THEN 'Activo' ELSE 'No valido' END AS estado FROM tb_Docente"); ResultSet rs = ps.executeQuery()) {

            int numColumns = tabla.getColumnCount();

            while (rs.next()) {
                Object[] rowData = new Object[numColumns];
                for (int i = 0; i < numColumns; i++) {
                    rowData[i] = rs.getString(i + 1); // El índice de columna es 1-based
                }
                tabla.addRow(rowData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            // Manejo básico de excepciones: muestra un mensaje de error con la excepción.
        }

        return tabla;
    }

    private static void setParameters(PreparedStatement ps, Object... params) throws SQLException {
        // Iterar sobre los valores proporcionados como parámetros
        for (int i = 0; i < params.length; i++) {
            // Configurar el i-ésimo parámetro de la consulta preparada con el valor correspondiente
            ps.setObject(i + 1, params[i]);
        }
    }
}
