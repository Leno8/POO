package SWING;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageMaison extends JPanel{

    private BufferedImage image;

    public ImageMaison(String name) {
        try {
            image = ImageIO.read(new File(name));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 1000, 1000, this); // see javadoc for more info on the parameters
    }

}