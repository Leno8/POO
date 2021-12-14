package SWING;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Fenetre1 extends JFrame {

    private static final long serialVersionUID = 1L;

    static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    private JButton buttonStart, buttonQuitter;


    public Fenetre1(String titre) {

        super(titre);

        int w = (int) dim.getWidth();
        int h = (int) dim.getHeight();

        this.getContentPane().setBackground(Color.WHITE);

        Button(this);
        creationImage();

        this.setBounds(0,0,w, h);
        this.setVisible(true);

    }


    private void creationImage()
    {
        AfficheImage image = new AfficheImage("DELIVREATS.png", "Createdby.png");

        this.add(image);
        this.pack();
    }

    public void Button(Fenetre1 app){

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = (int) dim.getWidth()/2;
        int h = (int) dim.getHeight()/2;

        int la = w/4;
        int lo = h/7;

        w -= la/2;
        h += 20;

        buttonStart = new JButton("Start");
        buttonStart.setBounds(w,h,la,lo);

        buttonQuitter = new JButton("Quitter");
        buttonQuitter.setBounds(w,h + lo,la,lo);


        buttonStart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Fenetre2 F2 = new Fenetre2();
                F2.setBounds(0,0,dim.width,dim.height);
                F2.setVisible(true);
                app.setVisible(false);
            }
        });

        buttonQuitter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);

            }
        });



        this.add(buttonStart);
        this.add(buttonQuitter);



    }
}