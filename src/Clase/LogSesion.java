
package Clase;

/**
 *
 * @author manuel
 */
public class LogSesion {
    
    private int idLogSesion;
    private EmpleadoUsuario empleadoUsuario;
    private String ultimaVezEnLinea;

    public LogSesion() {}

    public LogSesion(int idLogSesion) {
        this.idLogSesion = idLogSesion;
    }

    public int getIdLogSesion() {
        return idLogSesion;
    }

    public void setIdLogSesion(int idLogSesion) {
        this.idLogSesion = idLogSesion;
    }

    public EmpleadoUsuario getEmpleadoUsuario() {
        return empleadoUsuario;
    }

    public void setEmpleadoUsuario(EmpleadoUsuario empleadoUsuario) {
        this.empleadoUsuario = empleadoUsuario;
    }

    public String getUltimaVezEnLinea() {
        return ultimaVezEnLinea;
    }

    public void setUltimaVezEnLinea(String ultimaVezEnLinea) {
        this.ultimaVezEnLinea = ultimaVezEnLinea;
    }
}
