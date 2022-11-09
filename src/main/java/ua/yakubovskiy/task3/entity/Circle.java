package ua.yakubovskiy.task3.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle implements Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        double result = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        return BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "volume=" + getVolume() +
                '}';
    }
}
