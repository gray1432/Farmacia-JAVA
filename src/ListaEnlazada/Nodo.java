package ListaEnlazada;

public class Nodo {

    

    private int dato;
    private Nodo sig;
    private Nodo ant;
    
    //Variable de nuestro proveedor
    private String idProveedor; 
    private String nombreProv; 
    private String direccion; 
    private String numTelf; 
    //Construtor para insertar al inicio un proveedor
    public Nodo(String idProveedor, String nombreProv, String numTelf, String direccion) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.numTelf = numTelf;
        this.direccion = direccion;
        this.sig = null;
    }
    
    
    // Constructor para insertar al final de la lista enlazada
    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    // Constructor para insertar al inicio de la lista enlazada
    public Nodo(int dato, Nodo sig, Nodo ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }

    // Métodos getters y setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    /********* **********/
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }

    public Nodo getEnlace() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEnlace(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

