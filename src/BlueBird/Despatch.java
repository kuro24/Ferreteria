
package BlueBird;

/**
 *
 * @author manuel
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Despatch {
    
    public static void error( Component component, String mensaje ) {
        JOptionPane.showMessageDialog(component, crearPanel(mensaje), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void afirmacion( Component component, String mensaje, String cabecera ) {
        JOptionPane.showMessageDialog(component, crearPanel(mensaje), cabecera, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void advertencia( Component component, String mensaje ) {
        JOptionPane.showMessageDialog(component, crearPanel(mensaje), "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean confirmacion( Component component, String mensaje ) {        
        return JOptionPane.showConfirmDialog(component, crearPanel(mensaje), "CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION;  
    }
    
    public static JPanel crearPanel(String mensaje) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JLabel label = new JLabel(mensaje);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        
        panel.add(label, BorderLayout.CENTER);
        
        return panel;
    }
}