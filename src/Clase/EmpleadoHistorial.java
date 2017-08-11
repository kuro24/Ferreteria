
package Clase;


public class EmpleadoHistorial {
    
    private int idEmpleadoHistorial;
    private Empleado empleado;
    private CargoLaboral cargoLaboral;
    private String fechaAsignacion;
    private String fechaDestitucion;
    private boolean activo;

    public EmpleadoHistorial() {}

    public EmpleadoHistorial(int idEmpleadoHistorial) {
        this.idEmpleadoHistorial = idEmpleadoHistorial;
    }

    public int getIdEmpleadoHistorial() {
        return idEmpleadoHistorial;
    }

    public void setIdEmpleadoHistorial(int idEmpleadoHistorial) {
        this.idEmpleadoHistorial = idEmpleadoHistorial;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public CargoLaboral getCargoLaboral() {
        return cargoLaboral;
    }

    public void setCargoLaboral(CargoLaboral cargoLaboral) {
        this.cargoLaboral = cargoLaboral;
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
