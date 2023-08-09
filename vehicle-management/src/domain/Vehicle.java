package domain;


import java.util.ArrayList;

public class Vehicle {

    private String brand;
    private String model;
    private Integer year;
    private Double price;

    public Vehicle(String brand, String model, Integer year, Double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Brand: " + brand + " - " +
                "Model: " + model + " - " +
                "Year: " + year + " - " +
                "Price: R$" + price;
    }


}
