
package Clase;

/**
 *
 * @author manuel
 */
public class LoteInventarioMotocicleta {
    
    private int idLoteInventarioMotocicleta;
    private InventarioMotocicleta inventarioMotocicleta;
    private String codigoProducto;
    private String fechaEntrega;
    private float cantidadLote;

    public LoteInventarioMotocicleta() {}

    public LoteInventarioMotocicleta(int idLoteInventarioMotocicleta) {
        this.idLoteInventarioMotocicleta = idLoteInventarioMotocicleta;
    }

    public int getIdLoteInventarioMotocicleta() {
        return idLoteInventarioMotocicleta;
    }

    public void setIdLoteInventarioMotocicleta(int idLoteInventarioMotocicleta) {
        this.idLoteInventarioMotocicleta = idLoteInventarioMotocicleta;
    }

    public InventarioMotocicleta getInventarioMotocicleta() {
        return inventarioMotocicleta;
    }

    public void setInventarioMotocicleta(InventarioMotocicleta inventarioMotocicleta) {
        this.inventarioMotocicleta = inventarioMotocicleta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public float getCantidadLote() {
        return cantidadLote;
    }

    public void setCantidadLote(float cantidadLote) {
        this.cantidadLote = cantidadLote;
    }
}
