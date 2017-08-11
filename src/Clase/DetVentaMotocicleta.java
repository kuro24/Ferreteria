
package Clase;

/**
 *
 * @author manuel
 */
public class DetVentaMotocicleta {
    
    private int idDetVentaMotocicleta;
    private Venta venta;
    private ProductoFerreteria productoFerreteria;
    private PrecioFerreteria precioFerreteria;
    private UnidadMedida unidadMedida;
    private float cantidadPedida;
    private float cantidadVendida;

    public DetVentaMotocicleta() {}

    public DetVentaMotocicleta(int idDetVentaMotocicleta) {
        this.idDetVentaMotocicleta = idDetVentaMotocicleta;
    }

    public int getIdDetVentaMotocicleta() {
        return idDetVentaMotocicleta;
    }

    public void setIdDetVentaMotocicleta(int idDetVentaMotocicleta) {
        this.idDetVentaMotocicleta = idDetVentaMotocicleta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
    }

    public PrecioFerreteria getPrecioFerreteria() {
        return precioFerreteria;
    }

    public void setPrecioFerreteria(PrecioFerreteria precioFerreteria) {
        this.precioFerreteria = precioFerreteria;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public float getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(float cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public float getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(float cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}
