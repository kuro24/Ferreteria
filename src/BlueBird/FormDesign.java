
package BlueBird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * CONTROLA EL DISEÑO Y APARIENCIA DE LOS FORMULARIOS, TITULOS, ICONOS, GUI, ETC.
 * @author manuel
 */
public class FormDesign {
    
    private static UIManager.LookAndFeelInfo apariencia[]; 
    private static final String URLIMAGEN = "/Imagen/icono.png";
    private static final Color COLOR = Color.WHITE; 
    private static final Dimension PANTALLA = Toolkit.getDefaultToolkit().getScreenSize();
    private static final String FONT = "Arial";
    
    /**
     * AGREGA TITULO, ICONO Y COLOR DE FONDO A UN JFRAME.
     * @param titulo: el titulo que llevara la cabecera del JFRAME
     * @param frame: el objeto JFRAME que se piensa modificar
     * @param panel: el objeto JPANEL puesto como color de fondo del JFRAME.
     */
    public static void designFrame(String titulo, JFrame frame, JPanel panel ) {
        try {
            /*AGREGAR EL ICONO Y TITULO*/
            Image icon = Toolkit.getDefaultToolkit().getImage(FormDesign.class.getClass().getResource(URLIMAGEN));
            
            frame.setIconImage(icon);
            frame.setDefaultCloseOperation(0);
            frame.setTitle(titulo);
            
            /*ESTABLECER POCISION CENTRADO DEL JFRAME*/   
            frame.setLocation((PANTALLA.width/2)-(frame.getWidth()/2), (PANTALLA.height/2)-(frame.getHeight()/2) );
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(COLOR);
        
            /*ESTABLECER UNA APARIENCIA AMIGABLE CON EL USUARIO, ESTILO WINDOWS*/
            apariencia = UIManager.getInstalledLookAndFeels();
            UIManager.setLookAndFeel( apariencia[3].getClassName() );
            SwingUtilities.updateComponentTreeUI(frame);
            
        } catch( HeadlessException | ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e ) {}
    }
    
    /**
     * AGREGA TITULO, ESTABLECE TAMAÑO Y COLOR DE FONDO DEL JINTERNALFRAME
     * @param titulo: el titulo que llevara el JINTERNALFRAME
     * @param frame: el objeto JINTERNALFRAME que se le aplicara el cambio
     * @param panel: el panel de fondo dentro del JINTERNALFRAME
     * @param pantallaCompleta: establece si el objeto debe mostrarse en toda la pantalla o a tamaño original
     */
    public static void designInternal(String titulo, JInternalFrame frame, JPanel panel, boolean pantallaCompleta ) {
        try {
            Icon icon = new ImageIcon( FormDesign.class.getClass().getResource(URLIMAGEN) );

            frame.setFrameIcon(icon);
            frame.setTitle(titulo);    
            
            /*ESTABLECER POSICION Y TAMAÑO DEL JINTERNALFRAME*/
            if( pantallaCompleta ) {
                frame.setSize((int) PANTALLA.getWidth(), frame.getHeight() );
            } else {
                //VALIDA QUE EL TAMAÑO DEL FRAME NO SEA MAYOR QUE EL TAMAÑO DE LA RESOLUCION DE PANTALLA
                if( (int) PANTALLA.getWidth() < frame.getWidth() ) {
                    frame.setSize(PANTALLA.width, PANTALLA.height-100);
                } else {
                    frame.setLocation((PANTALLA.width/2)-(frame.getWidth()/2), ((PANTALLA.height/2)-(frame.getHeight()/2)-50) );
                }
            }         
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(COLOR);
        } catch( Exception e ) {}
    }
    
    /**
     * AGREGA TITULO, ESTABLECE COLOR DE FONDO Y TAMAÑO DEL JDIALOG
     * @param titulo: el titulo que llevara el marco del JDIALOG
     * @param frame: el objeto JDIALOG que se le aplicaran los cambios
     * @param panel: el fondo del JDIALOG al cual se le aplicara el color de fondo
     * @param pantallaGrande: si se mostrar el objeto en toda la pantalla o a tamaño original
     */
    public static void designDialog(String titulo, JDialog frame, JPanel panel, boolean pantallaGrande ) {
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage( FormDesign.class.getClass().getResource(URLIMAGEN) );
            
            frame.setIconImage(icon);
            frame.setDefaultCloseOperation(0);
            frame.setTitle(titulo);  
            frame.setResizable(false);
            
            //TOMA EL TAMAÑO DE LA RESOLUCION DE PANTALLA PARA AJUSTAR EL JDIALOG
            if( pantallaGrande ) frame.setSize((int)PANTALLA.getWidth()-100, (int)PANTALLA.getHeight()-150);
            frame.setLocation((PANTALLA.width/2)-(frame.getWidth()/2), (PANTALLA.height/2)-(frame.getHeight()/2) );
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(COLOR);
        } catch( Exception e ) {}
    }
    
    public static void fontLabel( JLabel[] label ) {
        for ( JLabel thislabel : label ) {
            thislabel.setFont(new Font(FONT, Font.PLAIN, 14));
        }
    }
    
    public static void fontButton( JButton[] button ) {
        for ( JButton thisButton : button ) {
            thisButton.setFont(new Font(FONT, Font.PLAIN, 14));
        }
    }
    
    public static void fontTextField( JTextField[] textField ) {
        for ( JTextField thisText : textField ) {
            thisText.setFont(new Font(FONT, Font.PLAIN, 14));
        }
    }
    
    public static void fontComponents( JComponent[] comp ) {
        for ( JComponent thisComp : comp ) {
            thisComp.setFont(new Font(FONT, Font.PLAIN, 14));
        }
    }
}
