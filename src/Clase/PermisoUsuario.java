
package Clase;

/**
 *
 * @author manuel
 */
public class PermisoUsuario {
    
    private int idPermisoUsuario;
    private EmpleadoUsuario empleadoUsuario;
    private PerfilUsuario perfilUsuario;
    private String fechaAsignacion;
    private String fechaDestitucion;
    private boolean activo;

    public PermisoUsuario() {}

    public PermisoUsuario(int idPermisoUsuario) {
        this.idPermisoUsuario = idPermisoUsuario;
    }

    public int getIdPermisoUsuario() {
        return idPermisoUsuario;
    }

    public void setIdPermisoUsuario(int idPermisoUsuario) {
        this.idPermisoUsuario = idPermisoUsuario;
    }

    public EmpleadoUsuario getEmpleadoUsuario() {
        return empleadoUsuario;
    }

    public void setEmpleadoUsuario(EmpleadoUsuario empleadoUsuario) {
        this.empleadoUsuario = empleadoUsuario;
    }

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaDestitucion() {
        return fechaDestitucion;
    }

    public void setFechaDestitucion(String fechaDestitucion) {
        this.fechaDestitucion = fechaDestitucion;
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
