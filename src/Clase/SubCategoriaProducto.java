
package Clase;

public class SubCategoriaProducto {
    
    private int idSubCategoriaProducto;
    private CategoriaProducto categoriaProducto;
    private String nombreSubCategoria;
    private String descripcionSubCategoria;
    private boolean activo;

    public SubCategoriaProducto() {}

    public SubCategoriaProducto(int idSubCategoriaProducto) {
        this.idSubCategoriaProducto = idSubCategoriaProducto;
    }

    public int getIdSubCategoriaProducto() {
        return idSubCategoriaProducto;
    }

    public void setIdSubCategoriaProducto(int idSubCategoriaProducto) {
        this.idSubCategoriaProducto = idSubCategoriaProducto;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }

    public String getDescripcionSubCategoria() {
        return descripcionSubCategoria;
    }

    public void setDescripcionSubCategoria(String descripcionSubCategoria) {
        this.descripcionSubCategoria = descripcionSubCategoria;
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
