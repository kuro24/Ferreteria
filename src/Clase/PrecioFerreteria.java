
package Clase;

/**
 *
 * @author manuel
 */
public class PrecioFerreteria extends Precio {
    
    private int idPrecioFerreteria;
    private ProductoFerreteria productoFerreteria;
    private boolean activo;

    public PrecioFerreteria() {}

    public PrecioFerreteria(int idPrecioFerreteria) {
        this.idPrecioFerreteria = idPrecioFerreteria;
    }

    public int getIdPrecioFerreteria() {
        return idPrecioFerreteria;
    }

    public void setIdPrecioFerreteria(int idPrecioFerreteria) {
        this.idPrecioFerreteria = idPrecioFerreteria;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getActivo() {
        return activo == true ? 1 : 0;
    }

    public void setActivo(int estado) {
        this.activo = ( estado == 1 );
    }
}
