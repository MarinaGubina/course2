package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        if(isNullOrEmpty(brand)){
            this.brand = "default";}
        else{
            this.brand = brand;
        }
        if(isNullOrEmpty(model)){
            this.model = "default";}
        else{
            this.model = model;
        }
        if(isNullOrEmpty(color)){
            this.color = "белый";}
        else{
            this.color = color;}
        if(productionYear <= 0){
            this.productionYear = 2000;}
        else{
            this.productionYear = productionYear;}
        if(isNullOrEmpty(productionCountry)){
            this.productionCountry = "default";}
        else{
            this.productionCountry = productionCountry;}
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry,",белый",0);
    }
    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }
    public int getProductionYear() {
        return productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != null || !color.isEmpty() || !color.isBlank()){
            this.color = color;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();
    @Override
    public String toString() {
        return  "Марка ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", год выпуска =" + productionYear +
                ", страна производства ='" + productionCountry + '\'' +
                ", цвет кузова='" + color + '\'' +
                ", максимальная скорость =" + maxSpeed;
    }
}
