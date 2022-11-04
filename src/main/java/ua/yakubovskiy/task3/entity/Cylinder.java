package ua.yakubovskiy.task3.entity;

public class Cylinder implements Shape{

    private final int volume;

    public Cylinder(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume +
                '}';
    }
}
