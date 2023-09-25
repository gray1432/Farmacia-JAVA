
package Modelo;

public class Trabajador {
    
    private String idTrabajador;
    private String nombreTrab;
    private String apellidoTrab;
    private String contra;

    

    public Trabajador() {
    }

    public Trabajador(String idTrabajador, String nombreTrab, String apellidoTrab, String contra) {
        this.idTrabajador = idTrabajador;
        this.nombreTrab = nombreTrab;
        this.apellidoTrab = apellidoTrab;
        this.contra = contra;
    }
    
    

    public String getIdUser() {
        return idTrabajador;
    }

    public void setIdUser(String idUser) {
        this.idTrabajador = idUser;
    }

    public String getNombreTrab() {
        return nombreTrab;
    }

    public void setNombreTrab(String nombreTrab) {
        this.nombreTrab = nombreTrab;
    }

    public String getApellidoTrab() {
        return apellidoTrab;
    }

    public void setApellidoTrab(String apellidoTrab) {
        this.apellidoTrab = apellidoTrab;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
