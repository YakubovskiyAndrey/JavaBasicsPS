package ua.yakubovskiy.task3.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cylinder implements Shape{

    private final double radius;

    private final double height;

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public double getVolume() {
        double result = Math.PI * radius * radius * height;
        return BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + getVolume() +
                '}';
    }
}
