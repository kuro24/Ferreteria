
package Clase;

/**
 *
 * @author manuel
 */
public class TipoPago {
    
    private int idTipoPago;
    private String tipoPago;
    private boolean activo;

    public TipoPago() {}

    public TipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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
