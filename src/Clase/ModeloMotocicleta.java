
package Clase;

/**
 *
 * @author manuel
 */
public class ModeloMotocicleta {
    
    private int idModeloMotocicleta;
    private String descripcion;
    private boolean activo;

    public ModeloMotocicleta() {}

    public ModeloMotocicleta(int idModeloMotocicleta) {
        this.idModeloMotocicleta = idModeloMotocicleta;
    }

    public int getIdModeloMotocicleta() {
        return idModeloMotocicleta;
    }

    public void setIdModeloMotocicleta(int idModeloMotocicleta) {
        this.idModeloMotocicleta = idModeloMotocicleta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
