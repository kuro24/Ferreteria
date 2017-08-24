
package BlueBird;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.border.Border;

public class ImagenFondoDesktop implements Border {
    
    /*FONDO PRINCIPAL DEL MENU*/
    BufferedImage fondo;
    JDesktopPane desktop;
    
    public ImagenFondoDesktop( JDesktopPane desktop ) {  
        this.desktop = desktop;
        try {       
            //se obtiene la imagen            
            URL url = new URL(getClass().getResource("/Imagen/desktop.jpg").toString());
            fondo = ImageIO.read(url);    
            
        } catch (IOException ex) {
            Logger.getLogger(ImagenFondoDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    // se sobreescriben metodos propios de Border
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {     
        Dimension alto = desktop.getSize();        
        //se dibuja la imagen de fondo en el centro del contenedor
        //cada que se redimensione el contenedor, la imagen automaticamente se posiciona en el centro
        g.drawImage(fondo, 0, 0, (int)alto.getWidth(), (int)alto.getHeight(), null);
    }

    public Insets getBorderInsets(Component c)  {
        return new Insets(0,0,0,0);
    }

    public boolean isBorderOpaque() {
        return true;
    }
}
