package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import MODELO.UsuarioDao;
import VISTA.Login;
import VISTA.Menu;

/**
 *
 * @author Andresito.vip
 */

public class ControladorUsuario implements ActionListener {
    UsuarioDao dao = new UsuarioDao();
    Login frame = new Login();
    Menu menu = new Menu();

    private Menu vista;

    public ControladorUsuario(Login frame) {
        this.frame = frame;
        this.frame.botton_entrar.addActionListener(this);
    }

    public void Ingresar() {
        String us = frame.txt_usuario.getText(); 
        String pw = frame.txt_contrasena.getText(); 

        if (UsuarioDao.authenticate(us, pw)) {
            JOptionPane.showMessageDialog(null, "Logeo Correcto");


            Menu menu = new Menu();
            menu.setVisible(true);

            frame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Logeo incorrecto");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.botton_entrar) {
            Ingresar();
        }
    }

}
