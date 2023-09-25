
package ModeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.TrabajadorInterface;
import Modelo.Trabajador;
import java.util.Set;

public class TrabajadorDAO implements TrabajadorInterface{
    Connection conn;
    Conexion con = new Conexion();
    Trabajador t;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
  
    
    public Trabajador listarUno(String codigo){
    
         try {
            String sql = "select * from trabajador where idUser = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new Trabajador();
                t.setIdUser(rs.getString("idUser"));
                t.setNombreTrab(rs.getString("nombreTrab"));
                t.setApellidoTrab(rs.getString("apellidoTrab"));
                t.setContra(rs.getString("contra"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return t;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean agregar(Trabajador t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Trabajador c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Trabajador> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    @Override
    public String codigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
