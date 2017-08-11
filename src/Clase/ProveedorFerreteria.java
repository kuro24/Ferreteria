
package Clase;

/**
 *
 * @author manuel
 */
public class ProveedorFerreteria {
    
    private int idProveedorFerreteria;
    private Proveedor proveedor;
    private ProductoFerreteria productoFerreteria;

    public ProveedorFerreteria() {}

    public ProveedorFerreteria(int idProveedorFerreteria) {
        this.idProveedorFerreteria = idProveedorFerreteria;
    }

    public int getIdProveedorFerreteria() {
        return idProveedorFerreteria;
    }

    public void setIdProveedorFerreteria(int idProveedorFerreteria) {
        this.idProveedorFerreteria = idProveedorFerreteria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
    }
}
