package be.vdab.flights.domain;

public class Ticket {

    private double price;
    private String nameOfPassenger;
    private int flightId;

    public Ticket(int price, String nameOfPassenger, int flightId) {
        this.price = price;
        this.nameOfPassenger = nameOfPassenger;
        this.flightId = flightId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameOfPassenger() {
        return nameOfPassenger;
    }

    public void setNameOfPassenger(String nameOfPassenger) {
        this.nameOfPassenger = nameOfPassenger;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
