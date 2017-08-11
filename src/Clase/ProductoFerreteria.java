
package Clase;

/**
 *
 * @author manuel
 */
public class ProductoFerreteria extends Producto {
    
    private int numProductoFerreteria;
    private SubCategoriaProducto subCategoriaProducto;
    private boolean activo;

    public ProductoFerreteria() {}

    public ProductoFerreteria(int idProductoFerreteria) {
        this.numProductoFerreteria = idProductoFerreteria;
    }

    public int getNumProductoFerreteria() {
        return numProductoFerreteria;
    }

    public void setNumProductoFerreteria(int numProductoFerreteria) {
        this.numProductoFerreteria = numProductoFerreteria;
    }

    public SubCategoriaProducto getSubCategoriaProducto() {
        return subCategoriaProducto;
    }

    public void setSubCategoriaProducto(SubCategoriaProducto subCategoriaProducto) {
        this.subCategoriaProducto = subCategoriaProducto;
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
