package model;

public class Wheel {

    private Double spokesPrice;
    private Double rimPrice;
    private Double tubePrice;
    private Double tyrePrice;

    public Double getSpokesPrice() {
        return spokesPrice;
    }

    public void setSpokesPrice(Double spokesPrice) {
        this.spokesPrice = spokesPrice;
    }

    public Double getRimPrice() {
        return rimPrice;
    }

    public void setRimPrice(Double rimPrice) {
        this.rimPrice = rimPrice;
    }

    public Double getTubePrice() {
        return tubePrice;
    }

    public void setTubePrice(Double tubePrice) {
        this.tubePrice = tubePrice;
    }

    public Double getTyrePrice() {
        return tyrePrice;
    }

    public void setTyrePrice(Double tyrePrice) {
        this.tyrePrice = tyrePrice;
    }

    public Double getTotalPrice() {
        return this.rimPrice+this.spokesPrice+this.tubePrice+this.tyrePrice;
    }
}
