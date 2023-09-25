
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
import Interfaces.DetalleVentaInterface;
import Modelo.DetalleVenta;
import Modelo.Ventas;
import java.util.ArrayList;

public class DetalleVentaDAO implements DetalleVentaInterface{
    Connection conn;
    Conexion con = new Conexion();
    DetalleVenta d;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    @Override
    public boolean agregar(DetalleVenta d) {
         try {
            String sql = "insert into detalleventa (nombreProduc, idVenta, cantidad, preciou, subTotal)"
                    + "values(?,?,?,?,?)";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setString(1, d.getNombreProduc());
            ps.setInt(2, d.getIdventa());
            ps.setInt(3, d.getCantidad());
            ps.setDouble(4, d.getPrecio());
            ps.setDouble(5, d.getSubtotal());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(DetalleVenta c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<DetalleVenta> listarTodo() {
        ArrayList<DetalleVenta> lista = new ArrayList<>();
        
        try {
            String sql = "select * from detalleventa ";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            rs = ps.executeQuery();
            while(rs.next()){
                DetalleVenta v = new DetalleVenta();
                v.setIdventa(rs.getInt("idVenta "));
                v.setDetalleV(rs.getInt("idDetalleV"));
                v.setCantidad(rs.getInt("cantidad"));
                v.setNombreProduc(rs.getString("nombreProduc"));
                v.setPrecio(rs.getDouble("preciou"));
                v.setSubtotal(rs.getDouble("subTotal"));
   
                lista.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public String codigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
