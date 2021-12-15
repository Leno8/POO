package CODE;

public abstract class Vehicule {

    protected boolean isUsed, isABike;
    protected String name;
    protected int price, payload;
    protected double average_speed, CO2_emission, utilisation_cost;

    public Vehicule(String name, int price) {

        this.name = name;

        this.price = price;

        this.payload = payload;

        this.isUsed = false;

    }


    public abstract String getName();

    public abstract int getPrice();

    public abstract double getAverage_speed();

    public abstract double getCO2_emission();

    public abstract int getPayload();

    public abstract double getUtilisation_cost();

    public abstract void print();

    public abstract boolean getIsUsed();


}
