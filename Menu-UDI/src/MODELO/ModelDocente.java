package MODELO;

/**
 *
 * @author SISTEMAS
 */
public class ModelDocente {
    
    private int idDocente;
    private String nombreDocente;
    private String apellidoDocente;
    private String cedula;
    private int estado;

    public ModelDocente(){
        this.idDocente = 0;
        this.nombreDocente = "";
        this.apellidoDocente = "";
        this.cedula = "";
        this.estado = 0;
    }

    public ModelDocente(int idDocente, String nombreDocente, String apellidoDocente, String cedula, int estado) {
        this.idDocente = idDocente;
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.cedula = cedula;
        this.estado = estado;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
