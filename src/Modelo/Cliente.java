
package Modelo;

public class Cliente {
    private String codigo;
    private String dni;
    private String nombres;
    private String apellidos;
    private String numtelf;

    public Cliente(String codigo, String dni, String nombres, String apellidos, String numtelf) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numtelf = numtelf;
    }

    public Cliente() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumtelf() {
        return numtelf;
    }

    public void setNumtelf(String numtelf) {
        this.numtelf = numtelf;
    }

   
}
