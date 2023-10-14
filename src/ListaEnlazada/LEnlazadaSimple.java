package ListaEnlazada;

import Modelo.Proveedor;
import javax.swing.table.DefaultTableModel;
import ListaEnlazada.Nodo;


public class LEnlazadaSimple {
    //definimos dos punteros
    private Nodo inicio, fin;
    
    //constructor
    public LEnlazadaSimple(){
        this.inicio= null;
        this.fin= null;
    }
    
    //métodos getters y setters

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    //método para insertar al medio del nodo de la lista enlazada
    public void insertarMedio (String idProveedor, String nombreProv, String direccion, String numTelf){
        Nodo nuevoNodo = new Nodo(idProveedor, nombreProv, numTelf, direccion);
        
        if (inicio == null){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else {
            Nodo rapido=inicio;
            Nodo lento=inicio;
            
            while (rapido != null && rapido.getSig() != null ){
                rapido = rapido.getSig().getSig();
                lento = lento.getSig();
            }
            nuevoNodo.setSig(lento.getSig());
            lento.setSig(nuevoNodo);
            
            if(rapido ==null){
                fin=nuevoNodo;
            }
        }
    }

    
    
    
    //método para insertar al final del nodo de la lista enlazada
    public void insertarFin(String idProveedor, String nombreProv, String direccion, String numTelf) {
        Nodo nuevoNodo = new Nodo(idProveedor, nombreProv, direccion, numTelf);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setSig(inicio);
            inicio = nuevoNodo;
        }
    }
    
    
    //método para insertar un nodo al inicio de la lista enlazada
    public void insertarInicio(String idProveedor, String nombreProv, String numTelf, String direccion) {
        Nodo nuevoNodo = new Nodo(idProveedor, nombreProv, numTelf, direccion);
        
        if (fin ==null){
            fin =inicio;
            fin=nuevoNodo;
        }else {
            nuevoNodo.setSig(inicio);
            inicio=nuevoNodo;
        }
    }
    

    
    
    //Método para recorrer los nodos
        public void llenarTabla(DefaultTableModel modeloTabla) {
        // Borra los datos existentes en la tabla
        modeloTabla.setRowCount(0);

        Nodo actual = inicio;
        while (actual != null) {
            // Agrega más columnas según sea necesario para reflejar la estructura de tus nodos
            modeloTabla.addRow(new Object[]{actual.getIdProveedor(), actual.getNombreProv(), actual.getDireccion(), actual.getNumTelf()});
            actual = actual.getSig(); // Avanza al siguiente nodo
        }
    }


    
    
    //Busqueda de un elemento
    public boolean busqueda(int datito) {
        Nodo bus = inicio;
        while (bus != null) {
            if (bus.getDato() == datito) {
                return true; // Devuelve true si encuentra el elemento
            }
            bus = bus.getSig();
        }
        return false; // Devuelve false si no encuentra el elemento
    }
    
    
}
