
package Modelo;

public class Proveedor {
    private String idProveedor;
     private String nombreProv;
     private String numTelf;
     private String direccion;

    public Proveedor(String idProveedor, String nombreProv, String numTelf, String direccion) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.numTelf = numTelf;
        this.direccion = direccion;
    }

    public Proveedor() {
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombreProv=" + nombreProv + ", numTelf=" + numTelf + ", direccion=" + direccion + '}';
    }

    
    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int compareTo(Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
