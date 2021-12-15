import SWING.Fenetre1;
import CODE.*;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try{
            SwingUtilities.invokeAndWait(
                new Runnable(){
                    public void run(){
                        Garage Garage = new Garage();



                        Scooter S1 = new Scooter("Yamama", 3500, 300, 50, 7.5);

                        Scooter S2 = new Scooter("Vespo", 2500, 125, 30, 5.5);

                        Scooter S3 = new Scooter("Piagigi", 2000, 150, 35, 6);

                        Bike B1 = new Bike("Cyclou",450);

                        Bike B2 = new Bike("Vavite", 500);


                        System.out.println("\n "
                                + "----------------------------------------"
                                + "-----------Garage--------------------"
                                + "-------------------------------");


                        Garage.addVehicule(S1);

                        Garage.addVehicule(S2);

                        Garage.addVehicule(S3);

                        Garage.addVehicule(B2);

                        Garage.addVehicule(B1);

                        Garage.printParking();


                        System.out.println("\n "
                                + "----------------------------------------"
                                + "-----------Staff--------------------"
                                + "--------------------------------");



                        System.out.println("\n "
                                + "----------------------------------------"
                                + "------------------------------------"
                                + "--------------------------------");




                        Fenetre1 app = new Fenetre1("Afficher image");

                        app.setVisible(true);
                    }
                }
            );
        }
        catch (Exception e) {}
    }

}
