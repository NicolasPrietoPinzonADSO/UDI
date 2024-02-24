package CONTROLADOR;

import DAO.DocenteDao;
import VISTA.Menu;
import VISTA.AddDocenteView;
import MODELO.ModelDocente;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author SISTEMAS
 */
public class ControladorDocente {

    private Menu menu;
    private AddDocenteView viewDocente;
    private ModelDocente docenteModel;

    public ControladorDocente(AddDocenteView viewDocente) {

        this.menu = menu;
        this.viewDocente = viewDocente;

        configurarListernis();
    }

    public void configurarListernis() {
        viewDocente.closeDocente.addActionListener((evt) -> closeDocente());
        viewDocente.addDocente.addActionListener((evt) -> guardarDocente());
    }
    
    
    private void closeDocente() {
        viewDocente.dispose();
    }

    public void guardarDocente() {

        ModelDocente docenteModel = new ModelDocente();

        String nombre = viewDocente.nombreDocente.getText().trim();
        String apellido = viewDocente.apellidoDocente.getText().trim();
        String cedula = viewDocente.cedulaDocente.getText().trim();

        docenteModel.setNombreDocente(nombre);
        docenteModel.setApellidoDocente(apellido);
        docenteModel.setCedula(cedula);

        if(DAO.DocenteDao.validarDocente(docenteModel)){
            JOptionPane.showMessageDialog(null, "Docente registrado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Docente existente");
        };
        
    }
     
    
}
