
package Clase;

public class RepuestoMotocicleta extends Producto {
    
    private int idRepuestoMotocicleta;
    private CategoriaProducto categoriaProducto;
    private ModeloMotocicleta modeloMotocicleta;
    private boolean activo;

    public RepuestoMotocicleta() {}

    public RepuestoMotocicleta(int idRepuestoMotocicleta) {
        this.idRepuestoMotocicleta = idRepuestoMotocicleta;
    }

    public int getIdRepuestoMotocicleta() {
        return idRepuestoMotocicleta;
    }

    public void setIdRepuestoMotocicleta(int idRepuestoMotocicleta) {
        this.idRepuestoMotocicleta = idRepuestoMotocicleta;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public ModeloMotocicleta getModeloMotocicleta() {
        return modeloMotocicleta;
    }

    public void setModeloMotocicleta(ModeloMotocicleta modeloMotocicleta) {
        this.modeloMotocicleta = modeloMotocicleta;
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
