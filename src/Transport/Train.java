package Transport;

import java.time.LocalDate;
import java.time.LocalTime;

public class Train extends Transport {
private double ticketPrice;
private LocalTime ticketTime;
private String startingStation;
private String endingStation;
private int numbersWagon;

    public Train(String brand, String model, int productionYear,
                 String productionCountry, String color,
                 double maxSpeed, double ticketPrice,
                 LocalTime ticketTime, String startingStation,
                 String endingStation, int numbersWagon) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.ticketPrice = ticketPrice;
        setTicketTime(ticketTime);
        this.startingStation = startingStation;
        this.endingStation = endingStation;
        this.numbersWagon = numbersWagon;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public LocalTime getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(LocalTime ticketTime) {
        if(ticketTime == null){
            this.ticketTime = LocalTime.of(10,15);
        }
        else{
            this.ticketTime = ticketTime;}
    }

    public String getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(String startingStation) {
        this.startingStation = startingStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumbersWagon() {
        return numbersWagon;
    }

    public void setNumbersWagon(int numbersWagon) {
        this.numbersWagon = numbersWagon;
    }
    @Override
    public String toString() {
        return  super.toString()+ "Цена билета =" + ticketPrice +
                ", Время отправления =" + ticketTime +
                ", начальная станция ='" + startingStation + '\'' +
                ", конечная станция ='" + endingStation + '\'' +
                ", количество вагонов =" + numbersWagon;
    }
}
