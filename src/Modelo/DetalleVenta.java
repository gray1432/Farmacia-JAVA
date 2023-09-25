
package Modelo;

public class DetalleVenta {
    private int detalleV;
    private int idventa;
    private String nombreProduc;
    private int cantidad;
    private double precio;
    private double subtotal;


    public DetalleVenta() {
    }

    public DetalleVenta(int detalleV, int idventa, String nombreProduc, int cantidad, double precio, double subtotal) {
        this.detalleV = detalleV;
        this.idventa = idventa;
        this.nombreProduc = nombreProduc;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;

    }
    
    
    
    public int getDetalleV() {
        return detalleV;
    }

    public void setDetalleV(int detalleV) {
        this.detalleV = detalleV;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getNombreProduc() {
        return nombreProduc;
    }

    public void setNombreProduc(String nombreProduc) {
        this.nombreProduc = nombreProduc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    
}
