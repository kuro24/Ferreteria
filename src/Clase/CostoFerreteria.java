
package Clase;

public class CostoFerreteria extends Costo {
    
    private int idCostoFerreteria;
    private ProductoFerreteria productoFerreteria;
    private boolean activo;

    public CostoFerreteria() {}

    public CostoFerreteria(int idCostoFerreteria) {
        this.idCostoFerreteria = idCostoFerreteria;
    }

    public int getIdCostoFerreteria() {
        return idCostoFerreteria;
    }

    public void setIdCostoFerreteria(int idCostoFerreteria) {
        this.idCostoFerreteria = idCostoFerreteria;
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
