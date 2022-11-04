package ua.yakubovskiy.task3.entity;

public class Circle implements Shape{

    private final int volume;

    public Circle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "volume=" + volume +
                '}';
    }
}
