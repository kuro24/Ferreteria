
package Clase;

public class CargoLaboral {
    
    private int idCargoLaboral;
    private String nombreCargo;
    private String descripcionCargo;
    private boolean activo;

    public CargoLaboral() {}

    public CargoLaboral(int idCargoLaboral) {
        this.idCargoLaboral = idCargoLaboral;
    }

    public int getIdCargoLaboral() {
        return idCargoLaboral;
    }

    public void setIdCargoLaboral(int idCargoLaboral) {
        this.idCargoLaboral = idCargoLaboral;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
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
