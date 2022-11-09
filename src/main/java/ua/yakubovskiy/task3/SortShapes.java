package ua.yakubovskiy.task3;

import ua.yakubovskiy.task3.entity.Shape;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortShapes {

    public List<Shape> sorting(List<Shape> shapes){
        if(shapes == null) throw new NullPointerException("list must not be null");
        if(shapes.isEmpty()) throw new IllegalArgumentException("list must not be empty");
        return shapes.stream().
                sorted(Comparator.comparingInt(Shape::getVolume)).collect(Collectors.toList());
    }

}
