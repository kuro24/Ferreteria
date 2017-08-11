
package Clase;

public class ContactoTelefonoEmpleado extends ContactoTelefono {
    
    private int idContactoTelefonoEmpleado;
    private Empleado empleado;
    private boolean activo;

    public ContactoTelefonoEmpleado() {
    }

    public ContactoTelefonoEmpleado(int idContactoTelefonoEmpleado) {
        this.idContactoTelefonoEmpleado = idContactoTelefonoEmpleado;
    }

    public int getIdContactoTelefonoEmpleado() {
        return idContactoTelefonoEmpleado;
    }

    public void setIdContactoTelefonoEmpleado(int idContactoTelefonoEmpleado) {
        this.idContactoTelefonoEmpleado = idContactoTelefonoEmpleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
