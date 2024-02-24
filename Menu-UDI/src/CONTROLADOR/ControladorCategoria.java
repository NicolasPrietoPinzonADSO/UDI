package CONTROLADOR;

import VISTA.Menu;
import VISTA.AddCategoriaView;

/**
 *
 * @author SISTEMAS
 */
public class ControladorCategoria {
    
    private Menu menu;
    private AddCategoriaView viewCategoria;

    public ControladorCategoria(AddCategoriaView viewCategoria) {
        this.menu = menu;
        this.viewCategoria = viewCategoria;
        configurarListernis();
    }
    
    public void configurarListernis(){
        viewCategoria.closeCategoria.addActionListener((evt) -> closeCategoria());
    }
    
    private void closeCategoria(){
        viewCategoria.dispose();
    }  
    
    
    
}
