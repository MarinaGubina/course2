package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String type;
    private String regNumber;
    private final int capacity;
    public static String rubber;
    private Key key;
    private Insurance insurance;
    public Car(String brand, String model,Double engineVolume,String color,Integer productionYear,
               String productionCountry,String transmission,String type,String regNumber,
               int capacity, double maxSpeed){
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if(engineVolume <= 0 ){
            this.engineVolume = 1.5;}
        else{
            this.engineVolume = engineVolume;}
        if(isNullOrEmpty(transmission)){
            this.transmission = "default";}
        else{
            this.transmission = transmission;}
        if(isNullOrEmpty(type)){
            this.type = "default";}
        else{
            this.type = type;}
        if(regNumber.matches("[a-zA-Z]\\d{3}[a-zA-Z]{2}\\d{3}")){
            this.regNumber = regNumber;}
        else{
            this.regNumber = "Некорректный номер";
        }
        if(capacity <= 0){
            this.capacity = 5;}
        else{
            this.capacity = capacity;}
        this.key = new Key();
        this.insurance = new Insurance();
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }

    public static String changeRubber(){
        if(LocalDate.now().getMonthValue() > 10 || LocalDate.now().getMonthValue() <= 4){
            return rubber = "Зимняя резина";
        }
        else{
            return rubber = "Летняя резина";
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume > 0){
            this.engineVolume = engineVolume;}
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(!isNullOrEmpty(transmission)){
            this.transmission = transmission;}
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if(regNumber.matches("[a-zA-Z]\\d{3}[a-zA-Z]{2}\\d{3}")){
            this.regNumber = regNumber;}
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    public class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public class Insurance{
        private final LocalDate periodInsurance;
        private final double costInsurance;
        private final String numberOfInsurance;

        public Insurance(LocalDate periodInsurance,double costInsurance, String numberOfInsurance){
            if(periodInsurance == null){
                this.periodInsurance = LocalDate.now().plusDays(365);}
            else{
                this.periodInsurance = periodInsurance;}
            this.costInsurance = costInsurance;
            if(numberOfInsurance == null){
                this.numberOfInsurance = "123456789";
            }
            else{
                this.numberOfInsurance = numberOfInsurance;
            }

        }
        public Insurance(){
            this(null,10_000,null);
        }
        public void checkPeriodInsurance(){
            if(periodInsurance.isBefore(LocalDate.now())||periodInsurance.isEqual(LocalDate.now())){
                System.out.println("Срочно оформите страховку!");
            }
        }
        public void checkNumberOfInsurance(){
            if(numberOfInsurance.length() != 9){
                System.out.println("Некорректный номер");
            }
        }

        public LocalDate getPeriodInsurance() {
            return periodInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }
    }
    @Override
    public String toString() {
        return  super.toString() +
                ", объем двигателя:" + engineVolume+
                ", трансмиссия:" + transmission +
                ", тип кузова:" + type +
                ", регистрационный номер:" + regNumber +
                ", количество мест:" + capacity;
    }
    @Override
    public void refill() {
        System.out.println("Заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }
}

