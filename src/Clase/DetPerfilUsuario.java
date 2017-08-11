
package Clase;

/**
 *
 * @author manuel
 */
public class DetPerfilUsuario {
    
    private int idDetPerfilUsuario;
    private PerfilUsuario perfilUsuario;
    private String formulario;
    private boolean tienePermiso;

    public DetPerfilUsuario() {}

    public DetPerfilUsuario(int idDetPerfilUsuario) {
        this.idDetPerfilUsuario = idDetPerfilUsuario;
    }

    public int getIdDetPerfilUsuario() {
        return idDetPerfilUsuario;
    }

    public void setIdDetPerfilUsuario(int idDetPerfilUsuario) {
        this.idDetPerfilUsuario = idDetPerfilUsuario;
    }

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public boolean isTienePermiso() {
        return tienePermiso;
    }

    public int getTienePermiso() {
        return tienePermiso == true ? 1 : 0;
    }

    public void setTienePermiso(int tienePermiso) {
        this.tienePermiso = ( tienePermiso == 1 );
    }
}
