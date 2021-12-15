
package CODE;

public class Bike extends Vehicule {

    public Bike(String name, int price) {

        super(name, price);

        this.isABike = true;

        this.average_speed = 0;

        this.CO2_emission = 0;

        this.utilisation_cost = price/30000;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getAverage_speed() {
        return average_speed;
    }

    public double getCO2_emission() {
        return CO2_emission;
    }

    public int getPayload() {
        return payload;
    }

    public double getUtilisation_cost() {
        return utilisation_cost;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void print() {
        System.out.println("\n Name : " + getName() + "; Price : " + getPrice() + ";");
    }

}
