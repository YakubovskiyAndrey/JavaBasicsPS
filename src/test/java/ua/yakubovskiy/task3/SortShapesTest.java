package ua.yakubovskiy.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.yakubovskiy.task3.entity.Circle;
import ua.yakubovskiy.task3.entity.Cube;
import ua.yakubovskiy.task3.entity.Cylinder;
import ua.yakubovskiy.task3.entity.Shape;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortShapesTest {

    private SortShapes sortShapes;

    @BeforeEach
    void setUp() {
        sortShapes = new SortShapes();
    }

    @Test
    void whenListIsEmpty(){
        List<Shape> shapes = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> sortShapes.sorting(shapes));
    }

    @Test
    void whenListIsNull(){
        assertThrows(NullPointerException.class, () -> sortShapes.sorting(null));
    }

    @Test
    void whenListIsNotEmpty(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(5.3, 2.2));
        shapes.add(new Circle(10.4));
        shapes.add(new Cube(9.8));
        assertEquals("[Cylinder{volume=194.14}, Cube{volume=941.19}, Circle{volume=4711.82}]",
                sortShapes.sorting(shapes).toString());
    }

    @Test
    void whenIdenticalShapesInList(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(5.1, 3.1));
        shapes.add(new Cylinder(10.1, 22.1));
        shapes.add(new Cylinder(9.5, 2.5));
        assertEquals("[Cylinder{volume=253.31}, Cylinder{volume=708.82}, Cylinder{volume=7082.47}]",
                sortShapes.sorting(shapes).toString());
    }

    @Test
    void whenOnlyOneShapesInList(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(9.2, 5.4));
        assertEquals("[Cylinder{volume=1435.88}]",
                sortShapes.sorting(shapes).toString());
    }
}