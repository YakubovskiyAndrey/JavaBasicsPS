package ua.yakubovskiy.task3.entity;

public class Cube implements Shape{

    private final int volume;

    public Cube(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume=" + volume +
                '}';
    }
}
