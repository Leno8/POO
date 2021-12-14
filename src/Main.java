import SWING.Fenetre1;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try{
            SwingUtilities.invokeAndWait(
                new Runnable(){
                    public void run(){
                        Fenetre1 app = new Fenetre1("Afficher image");
                        app.setVisible(true);
                    }
                }
            );
        }
        catch (Exception e) {}
    }

}
