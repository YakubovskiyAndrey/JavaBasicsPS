package ua.yakubovskiy.task3.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cube implements Shape{

    private final double height;

    public Cube(double height) {
        this.height = height;
    }

    public double getVolume() {
        double result = Math.pow(height, 3);
        return BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume=" + getVolume() +
                '}';
    }
}
