package ua.yakubovskiy;

import ua.yakubovskiy.task1.SortNumbers;
import ua.yakubovskiy.task2.TopHashtags;
import ua.yakubovskiy.task3.SortShapes;
import ua.yakubovskiy.task3.entity.Circle;
import ua.yakubovskiy.task3.entity.Cube;
import ua.yakubovskiy.task3.entity.Cylinder;
import ua.yakubovskiy.task3.entity.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(5);
        numbers.add(10);
        SortNumbers sortNumbers = new SortNumbers();
        List<Integer> resultNumbers = sortNumbers.sorting(numbers);
        resultNumbers.forEach(System.out::println);
    }

    public static void task2(){
        List<String> lines = new ArrayList<>();
        lines.add("-1");
        lines.add("#tt");
        lines.add("#t#e");
        lines.add("rr");
        lines.add("#r");
        lines.add("#r");
        lines.add("#r");
        lines.add("#y");
        lines.add("#y");
        lines.add("#y");
        lines.add("#i");
        lines.add("#h");
        lines.add("#n");
        lines.add("#i");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#r");
        TopHashtags topHashtags = new TopHashtags();
        Map<String, Long> resultLines = topHashtags.chooseTop(lines);
        resultLines.forEach((s, aLong) -> System.out.println(s + " - " + aLong));
    }

    public static void task3(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(5));
        shapes.add(new Circle(10));
        shapes.add(new Cube(9));
        SortShapes sortShapes = new SortShapes();
        List<Shape> resultShapes = sortShapes.sorting(shapes);
        resultShapes.forEach(System.out::println);
    }
}