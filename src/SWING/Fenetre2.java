package SWING;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue Dec 14 10:55:17 CET 2021
 */



/**
 * @author Noe
 */
public class Fenetre2 extends JFrame{

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

        mX = (int) (MouseInfo.getPointerInfo().getLocation().getX());
        mY = (int) (MouseInfo.getPointerInfo().getLocation().getY());
        System.out.println(mX + "    " + mY);
        isActif = true;
        repaint();
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
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
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
            panel1.setBackground(new Color(255, 51, 0));
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
                    .addGap(0, 740, Short.MAX_VALUE)
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
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        System.out.println("HEHEHHEHEHEHE");
        int w = this.getWidth(),
                h = this.getWidth(),
                r = 5,
                d = r * 2;
        g.setColor(Color.CYAN);
        g.fillOval(w / 2 - r, h / 2 - r, d, d);
        if (isActif) {
            g.fillOval(mX - r, mY - r, d, d);
            g.drawLine(w / 2, h / 2, mX, mY);
        }
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
