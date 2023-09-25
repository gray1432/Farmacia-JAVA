
package Interfaces;

import java.util.ArrayList;

public interface CRUD <T>{
    public boolean agregar(T c);
    public boolean eliminar(String codigo);
    public boolean modificar(T c);
    public ArrayList<T> listarTodo();
    public String codigo();
  
}

