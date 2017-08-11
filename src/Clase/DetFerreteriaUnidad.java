
package Clase;

/**
 *
 * @author manuel
 */
public class DetFerreteriaUnidad {
    
    private int idDetFerreteriaUnidad;
    private ProductoFerreteria productoFerreteria;
    private UnidadMedida unidadMedida;
    private float equivalencia;
    private boolean activo;

    public DetFerreteriaUnidad() {}

    public DetFerreteriaUnidad(int idDetFerreteriaUnidad) {
        this.idDetFerreteriaUnidad = idDetFerreteriaUnidad;
    }

    public int getIdDetFerreteriaUnidad() {
        return idDetFerreteriaUnidad;
    }

    public void setIdDetFerreteriaUnidad(int idDetFerreteriaUnidad) {
        this.idDetFerreteriaUnidad = idDetFerreteriaUnidad;
    }

    public ProductoFerreteria getProductoFerreteria() {
        return productoFerreteria;
    }

    public void setProductoFerreteria(ProductoFerreteria productoFerreteria) {
        this.productoFerreteria = productoFerreteria;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public float getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(float equivalencia) {
        this.equivalencia = equivalencia;
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
