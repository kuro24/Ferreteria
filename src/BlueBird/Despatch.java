
package BlueBird;

/**
 *
 * @author manuel
 */
import javax.swing.JOptionPane;

public class Despatch {
    
    public void error( String mensaje ) {
        JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void afirmacion( String mensaje, String cabecera ) {
        JOptionPane.showMessageDialog(null, mensaje, cabecera, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void advertencia( String mensaje ) {
        JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean confirmacion( String mensaje ) {
        return JOptionPane.showConfirmDialog(null, mensaje, "CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION;  
    }
}