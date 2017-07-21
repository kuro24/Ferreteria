
package BlueBird;

/**
 *
 * @author manuel
 */
import java.awt.Component;
import javax.swing.JOptionPane;

public class Despatch {
    
    public static void error( Component component, String mensaje ) {
        JOptionPane.showMessageDialog(component, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void afirmacion( Component component, String mensaje, String cabecera ) {
        JOptionPane.showMessageDialog(component, mensaje, cabecera, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void advertencia( Component component, String mensaje ) {
        JOptionPane.showMessageDialog(component, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean confirmacion( Component component, String mensaje ) {
        return JOptionPane.showConfirmDialog(component, mensaje, "CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION;  
    }
}