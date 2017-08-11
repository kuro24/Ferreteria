
package Clase;

/**
 *
 * @author manuel
 */
public class EmpleadoUsuario {
    
    private int idEmpleadoUsuario;
    private String usuario;
    private String clave;
    private int preguntaSeguridad;
    private String respuestaSeguridad;
    private boolean enLinea;
    private boolean primerInicio;
    private boolean activo;

    public EmpleadoUsuario() {}

    public EmpleadoUsuario(int idEmpleadoUsuario) {
        this.idEmpleadoUsuario = idEmpleadoUsuario;
    }

    public int getIdEmpleadoUsuario() {
        return idEmpleadoUsuario;
    }

    public void setIdEmpleadoUsuario(int idEmpleadoUsuario) {
        this.idEmpleadoUsuario = idEmpleadoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(int preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public boolean isEnLinea() {
        return enLinea;
    }
    
    public int getEnLinea() {
        return enLinea == true ? 1 : 0;
    }

    public void setEnLinea(int enLinea) {
        this.enLinea = (enLinea == 1);
    }

    public boolean isPrimerInicio() {
        return primerInicio;
    }

    public int getPrimerInicio() {
        return primerInicio == true ? 1 : 0;
    }
    
    public void setPrimerInicio(int primerInicio) {
        this.primerInicio = (primerInicio == 1);
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
