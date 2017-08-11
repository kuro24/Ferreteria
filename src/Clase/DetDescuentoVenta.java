
package Clase;

/**
 *
 * @author manuel
 */
public class DetDescuentoVenta {
    
    private int idDetDescuentoVenta;
    private Descuento descuento;
    private Venta venta;

    public DetDescuentoVenta() {}

    public DetDescuentoVenta(int idDetDescuentoVenta) {
        this.idDetDescuentoVenta = idDetDescuentoVenta;
    }

    public int getIdDetDescuentoVenta() {
        return idDetDescuentoVenta;
    }

    public void setIdDetDescuentoVenta(int idDetDescuentoVenta) {
        this.idDetDescuentoVenta = idDetDescuentoVenta;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
