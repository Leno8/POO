package CODE;
public class Scooter extends Vehicule{

    private int cylinder;
    private double  fuel_consommation;

    public Scooter(String name, int price, int cylinder, int payload, double fuel_consommation) {

        super(name, price);

        this.isABike = false;
        this .cylinder = cylinder;
        this.payload = payload;
        this.fuel_consommation = fuel_consommation;
        this.average_speed = 30 + this.cylinder/50;
        this.CO2_emission = this.cylinder / 4;
        this.utilisation_cost = price / 20000 + this.fuel_consommation;

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

    public int getCylinder() {
        return cylinder;
    }

    public double getFuel_consommation() {
        return fuel_consommation;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void print() {
        System.out.println("\n Name : " + getName() + "; Price : " + getPrice() + "; Cylinder (cm3) : " + getCylinder() + "; Playload (kg) : " + getPayload() + "; Fuel Consommation (1/100km) : " + getFuel_consommation() + ";");
    }



}
