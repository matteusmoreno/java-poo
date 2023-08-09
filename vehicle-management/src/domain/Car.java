package domain;

import java.math.BigDecimal;

public class Car extends Vehicle {

    private Integer numberOfDoors;
    private Double trunkCapacity;

    public Car(String brand, String model, Integer year, Double price, Integer numberOfDoors, Double trunkCapacity) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return
                "Number of Doors: " + numberOfDoors + " - " +
                "Trunk Capacity: " + trunkCapacity + "kg";

    }
}
