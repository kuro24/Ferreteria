
package BlueBird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * CONTROLA EL DISEÑO Y APARIENCIA DE LOS FORMULARIOS, TITULOS, ICONOS, GUI, ETC.
 * @author manuel
 */
public class FormDesign {
    
    private UIManager.LookAndFeelInfo apariencia[]; 
    private final String urlImagen;
    private final Color color;
    private final Dimension pantalla;
    
    public FormDesign() {
        urlImagen   = "/PAQUETE/NOTENGOIMAGEN.png";
        color       = Color.WHITE; 
        pantalla    = Toolkit.getDefaultToolkit().getScreenSize();
    }
    
    /**
     * AGREGA TITULO, ICONO Y COLOR DE FONDO A UN JFRAME.
     * @param titulo: el titulo que llevara la cabecera del JFRAME
     * @param frame: el objeto JFRAME que se piensa modificar
     * @param panel: el objeto JPANEL puesto como color de fondo del JFRAME.
     */
    public void designFrame(String titulo, JFrame frame, JPanel panel ) {
        try {
            /*AGREGAR EL ICONO Y TITULO*/
            Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource(urlImagen));
            
            frame.setIconImage(icon);
            frame.setDefaultCloseOperation(0);
            frame.setTitle(titulo);
            
            /*ESTABLECER POCISION CENTRADO DEL JFRAME*/   
            frame.setLocation( (pantalla.width/2)-(frame.getWidth()/2), (pantalla.height/2)-(frame.getHeight()/2) );
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(color);
        
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
    public void designInternal(String titulo, JInternalFrame frame, JPanel panel, boolean pantallaCompleta ) {
        try {
            Icon icon = new ImageIcon(getClass().getResource(urlImagen));
            
            frame.setFrameIcon(icon);
            frame.setTitle(titulo);    
            
            /*ESTABLECER POSICION Y TAMAÑO DEL JINTERNALFRAME*/
            if( pantallaCompleta ) {
                frame.setSize( (int) pantalla.getWidth(), frame.getHeight() );
            } else {
                //VALIDA QUE EL TAMAÑO DEL FRAME NO SEA MAYOR QUE EL TAMAÑO DE LA RESOLUCION DE PANTALLA
                if( (int) pantalla.getWidth() < frame.getWidth() ) {
                    frame.setSize(pantalla.width, pantalla.height-100);
                } else {
                    frame.setLocation( (pantalla.width/2)-(frame.getWidth()/2), ((pantalla.height/2)-(frame.getHeight()/2)-50) );
                }
            }         
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(color);
        } catch( Exception e ) {}
    }
    
    /**
     * AGREGA TITULO, ESTABLECE COLOR DE FONDO Y TAMAÑO DEL JDIALOG
     * @param titulo: el titulo que llevara el marco del JDIALOG
     * @param frame: el objeto JDIALOG que se le aplicaran los cambios
     * @param panel: el fondo del JDIALOG al cual se le aplicara el color de fondo
     * @param pantallaGrande: si se mostrar el objeto en toda la pantalla o a tamaño original
     */
    public void designDialog(String titulo, JDialog frame, JPanel panel, boolean pantallaGrande ) {
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource(urlImagen));
            
            frame.setIconImage(icon);
            frame.setDefaultCloseOperation(0);
            frame.setTitle(titulo);   
            
            //TOMA EL TAMAÑO DE LA RESOLUCION DE PANTALLA PARA AJUSTAR EL JDIALOG
            if( pantallaGrande ) frame.setSize((int)pantalla.getWidth()-100, (int)pantalla.getHeight()-150);
            frame.setLocation( (pantalla.width/2)-(frame.getWidth()/2), (pantalla.height/2)-(frame.getHeight()/2) );
            
            /*ESTABLECER EL COLOR DE FONDO DEL JPANEL*/
            if( panel != null ) panel.setBackground(color);
        } catch( Exception e ) {}
    }
}
