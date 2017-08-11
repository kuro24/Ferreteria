
package Clase;

/**
 *
 * @author manuel
 */
public class InventarioFerreteria extends Inventario {
    
    private int idInventarioFerreteria;
    private ProductoFerreteria productoFerreteria;

    public InventarioFerreteria() {}

    public InventarioFerreteria(int idInventarioFerreteria) {
        this.idInventarioFerreteria = idInventarioFerreteria;
    }

    public int getIdInventarioFerreteria() {
        return idInventarioFerreteria;
    }

    public void setIdInventarioFerreteria(int idInventarioFerreteria) {
        this.idInventarioFerreteria = idInventarioFerreteria;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
    }
}
