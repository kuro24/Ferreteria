
package Clase;

/**
 *
 * @author manuel
 */
public class PerfilUsuario {
    
    private int idPerfilUsuario;
    private CargoLaboral cargoLaboral;
    private String nombrePerfil;
    private String descripcionPerfil;
    private String fechaCreacion;
    private boolean modificable;
    private boolean activo;

    public PerfilUsuario() {}

    public PerfilUsuario(int idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public int getIdPerfilUsuario() {
        return idPerfilUsuario;
    }

    public void setIdPerfilUsuario(int idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public CargoLaboral getCargoLaboral() {
        return cargoLaboral;
    }

    public void setCargoLaboral(CargoLaboral cargoLaboral) {
        this.cargoLaboral = cargoLaboral;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isModificable() {
        return modificable;
    }

    public int getModificable() {
        return modificable == true ? 1 : 0;
    }
    public void setModificable(int modificable) {
        this.modificable = (modificable == 1);
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
