package model;

public class Seat {

    private Double coverPrice;

    public Double getCoverPrice() {
        return coverPrice;
    }

    public void setCoverPrice(Double coverPrice) {
        this.coverPrice = coverPrice;
    }

    public Double getTotalPrice() {
        return this.coverPrice;
    }
}
