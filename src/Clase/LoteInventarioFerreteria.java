
package Clase;

/**
 *
 * @author manuel
 */
public class LoteInventarioFerreteria {
    
    private int idLoteInventarioFerreteria;
    private InventarioFerreteria inventarioFerreteria;
    private String codigoProducto;
    private String fechaEntrega;
    private float cantidadLote;

    public LoteInventarioFerreteria() {
    }

    public LoteInventarioFerreteria(int idLoteInventarioFerreteria) {
        this.idLoteInventarioFerreteria = idLoteInventarioFerreteria;
    }

    public int getIdLoteInventarioFerreteria() {
        return idLoteInventarioFerreteria;
    }

    public void setIdLoteInventarioFerreteria(int idLoteInventarioFerreteria) {
        this.idLoteInventarioFerreteria = idLoteInventarioFerreteria;
    }

    public InventarioFerreteria getInventarioFerreteria() {
        return inventarioFerreteria;
    }

    public void setInventarioFerreteria(InventarioFerreteria inventarioFerreteria) {
        this.inventarioFerreteria = inventarioFerreteria;
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
