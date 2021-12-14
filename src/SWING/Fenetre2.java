package SWING;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.miginfocom.swing.*;

/*
 * Created by JFormDesigner on Tue Dec 14 10:55:17 CET 2021
 */



/**
 * @author Noe
 */
public class Fenetre2 extends JFrame{

    static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int mX, mY;
    private boolean isActif;


    public Fenetre2() {
        initComponents();
        }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }





    private void panel1MouseClicked(MouseEvent e) {

        BufferedImage Pin = null;
        BufferedImage House = null;

        mX = (int) (MouseInfo.getPointerInfo().getLocation().getX());
        mY = (int) (MouseInfo.getPointerInfo().getLocation().getY());
        isActif = true;
        try {
            Pin = ImageIO.read(new File("983013.png"));
            House = ImageIO.read(new File("Maison.png"));
        } catch (IOException ie) {
            ie.printStackTrace();
        }

        int ptx = mX - (Pin.getWidth()/2);
        int pty = mY - (Pin.getHeight());

        getGraphics().drawImage(Pin, ptx, pty ,null);

        int htx = dim.width/2 - (House.getWidth()/2);
        int hty = dim.height/2 + (House.getHeight());

        getGraphics().drawImage(House, htx, hty,null);

        getGraphics().drawLine(ptx+(Pin.getWidth()/2),pty+(Pin.getHeight())/2,htx + (House.getWidth()/2), hty + (House.getHeight())/2);




    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Noe
        panel2 = new JPanel();
        button6 = new JButton();
        button7 = new JButton();
        panel3 = new JPanel();
        panel1 = new JPanel();

        //======== this ========
        setBackground(new Color(51, 51, 255));
        setResizable(false);
        var contentPane = getContentPane();

        //======== panel2 ========
        {
            panel2.setBackground(new Color(0, 102, 204));
            panel2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel2. getBorder () ) ); panel2. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );
            panel2.setLayout(new MigLayout(
                "insets 0,hidemode 3,align center center",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[fill]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button6 ----
            button6.setText("Salarie");
            panel2.add(button6, "cell 3 8");

            //---- button7 ----
            button7.setText("Vehicule");
            panel2.add(button7, "cell 3 9");

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());
            }
            panel2.add(panel3, "cell 3 14 4 2");
        }

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setAlignmentX(0.0F);
            panel1.setAlignmentY(0.0F);
            panel1.setPreferredSize(new Dimension(1000, 0));
            panel1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    panel1MouseClicked(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 735, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
        // Generated using JFormDesigner Evaluation license - Noe
        private JPanel panel2;
        private JButton button6;
        private JButton button7;
        private JPanel panel3;
        private JPanel panel1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables

}
