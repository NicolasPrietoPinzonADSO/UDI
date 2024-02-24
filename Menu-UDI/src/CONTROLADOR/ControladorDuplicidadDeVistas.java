package CONTROLADOR;

import VISTA.AddCategoriaView;
import VISTA.AddDocenteView;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author SISTEMAS
 */
public class ControladorDuplicidadDeVistas {

    private static boolean addCategoriaAbierta = false;
    private static boolean addDocenteAbierta = false;

    public void DuplicidadCategoria(JFrame menu) {
        if (!addCategoriaAbierta) {
            AddCategoriaView categoria = new AddCategoriaView(menu, true);
            categoria.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            categoria.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    addCategoriaAbierta = false;
                }
            });
            categoria.setLocationRelativeTo(menu);

            addCategoriaAbierta = true;
            categoria.setVisible(true);
        }

    }

    public void DuplicidadDocente(JFrame menu) {
        if (!addDocenteAbierta) {
            AddDocenteView addDocente = new AddDocenteView(menu, true);
            addDocente.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            addDocente.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    addDocenteAbierta = false;
                }
            });
            addDocente.setLocationRelativeTo(menu);
            addDocenteAbierta = true;
            addDocente.setVisible(true);
        }
    }

}
