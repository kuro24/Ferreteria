
package Clase;

public class DetCompraFerreteria {
    
    private int idDetCompraFerreteria;
    private Compra compra;
    private ProductoFerreteria productoFerreteria;
    private String fechaLote;
    private float cantidadPedida;
    private float cantidadRecibida;
    private float precioProducto;

    public DetCompraFerreteria() {}

    public DetCompraFerreteria(int idDetCompraFerreteria) {
        this.idDetCompraFerreteria = idDetCompraFerreteria;
    }

    public int getIdDetCompraFerreteria() {
        return idDetCompraFerreteria;
    }

    public void setIdDetCompraFerreteria(int idDetCompraFerreteria) {
        this.idDetCompraFerreteria = idDetCompraFerreteria;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
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
