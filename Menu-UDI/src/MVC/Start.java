
package MVC;

import CONTROLADOR.ControladorUsuario;
import VISTA.Login;
import javax.swing.SwingUtilities;

public class Start {
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            Login login = new Login();
            ControladorUsuario con = new ControladorUsuario(login);
            login.setVisible(true);
        });
    }
    
}
