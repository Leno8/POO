package SWING;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.io.IOException;
import javax.imageio.*;

public class AfficheImage extends Panel {

    private static final long serialVersionUID = 1L;
    private BufferedImage Delivreats, Createdby;
    private Rectangle Rectangle;

    public AfficheImage(String nomImage1, String nomImage2) {

        try {
            Delivreats = ImageIO.read(new File(nomImage1));
            Createdby = ImageIO.read(new File(nomImage2));
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void paint(Graphics g) {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int DWi = (int) Delivreats.getWidth();
        int DHi = (int) Delivreats.getHeight();

        int CWi = (int) Createdby.getWidth();
        int CHi = (int) Createdby.getHeight();

        int We = (int) dim.getWidth();
        int He = (int) dim.getHeight();


        int DCw = (int) (DWi/(2560/We));
        int DCh = (int) (DHi/(1440/He));

        int CCw = (int) (CWi/(2560/We));
        int CCh = (int) (CHi/(1440/He));

        int empDH = (int) (He/2 - He/5);

        g.drawImage(Delivreats, We/2 - (DCw/2), empDH , DCw, DCh, null);

        g.drawImage(Createdby, We/2 - (CCw/2), empDH + DCh, CCw , CCh, null);

    }



}