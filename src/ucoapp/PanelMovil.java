package ucoapp;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *  Creamos una clase que extienda de JPanel para crear nuestro JPanel principal
 * 
 * @author Jose Manuel Izquierdo Ramírez
 * @author Francisco Llamas Nuflo
 * 
 */
public class PanelMovil extends JPanel {
    
    // Imagen para fondo
    private Image imagen;
    
    // Constructor al que se le pasa la imagen
    public PanelMovil(Image imagenInicial) {
    if (imagenInicial != null) {
        imagen = imagenInicial;
    }
}
    
    @Override
    public void paint(Graphics g) {
        // Con esta funcion, le indicamos que dibuje la imagen
        // Podemos utilizarla tal cual
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }
}
