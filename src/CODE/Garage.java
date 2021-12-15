
package CODE;
import java.util.ArrayList;

public class Garage {

    public Garage() {
        parking = new ArrayList<Vehicule>();
    }
    private ArrayList<Vehicule> parking;

    public void addVehicule(Vehicule V){
        parking.add(V);
    }

    public int getSize() {
        return parking.size();
    }

    public Vehicule getVehicule(int i) {
        return parking.get(i);
    }


    public void printParking() {
        int size = getSize();
        for(int i = 0; i < size; i++) {
            getVehicule(i).print();
        }
    }

    public void Take(Employee E) {
        for(int i = 0; i < getSize(); i++) {
            if( getVehicule(i).isUsed == false && E.getIsBusy() == false && getVehicule(i).isABike == E.getIsACyclist() ) {
                E.Associate(E, getVehicule(i));
            }
        }
    }

}
