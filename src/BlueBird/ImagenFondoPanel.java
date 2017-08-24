package BlueBird;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondoPanel extends JPanel {
    
    //LINK DE LA IMAGEN A AGREGAR
    String url;
    
    /*PANEL DE FONDO PARA EL INICIO DE SESION*/
    public ImagenFondoPanel(int width, int height, String url) {
        this.url = url;       
        this.setSize(width, height);  //se selecciona el tamaño del panel
    }

    @Override
    public void paint(Graphics grafico) {
        int height = getSize().height;
        int width = getSize().width;
        
        ImageIcon Img = new ImageIcon(getClass().getResource(url)); 
        grafico.drawImage(Img.getImage(), 0, 0, width, height, null);
        setOpaque(false);
        
        super.paintComponent(grafico);
    }
}