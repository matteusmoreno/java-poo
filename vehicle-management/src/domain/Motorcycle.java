package domain;

import java.math.BigDecimal;

public class Motorcycle extends Vehicle {

    private Integer displacement;
    private String type;

    public Motorcycle(String brand, String model, Integer year, Double price, Integer displacement, String type) {
        super(brand, model, year, price);
        this.displacement = displacement;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Displacement: " + displacement + "cc - " +
                "Type: " + type ;


    }
}
