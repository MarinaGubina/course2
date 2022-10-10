package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus : " + super.toString();
    }
}
