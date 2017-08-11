
package Clase;

public class DetCompraMotocicleta {
    
    private int idDetCompraMotocicleta;
    private Compra compra;
    private RepuestoMotocicleta repuestoMotocicleta;
    private String fechaLote;
    private float cantidadPedida;
    private float cantidadRecibida;
    private float precioProducto;

    public DetCompraMotocicleta() {}

    public DetCompraMotocicleta(int idDetCompraMotocicleta) {
        this.idDetCompraMotocicleta = idDetCompraMotocicleta;
    }

    public int getIdDetCompraMotocicleta() {
        return idDetCompraMotocicleta;
    }

    public void setIdDetCompraMotocicleta(int idDetCompraMotocicleta) {
        this.idDetCompraMotocicleta = idDetCompraMotocicleta;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public RepuestoMotocicleta getRepuestoMotocicleta() {
        return repuestoMotocicleta;
    }

    public void setRepuestoMotocicleta(RepuestoMotocicleta repuestoMotocicleta) {
        this.repuestoMotocicleta = repuestoMotocicleta;
    }

    public String getFechaLote() {
        return fechaLote;
    }

    public void setFechaLote(String fechaLote) {
        this.fechaLote = fechaLote;
    }

    public float getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public float getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(int cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
}
