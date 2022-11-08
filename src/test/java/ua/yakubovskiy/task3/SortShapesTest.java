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
        assertThrows(IllegalArgumentException.class, () -> sortShapes.sorting(new ArrayList<>()));
    }

    @Test
    void whenListIsNull(){
        assertThrows(NullPointerException.class, () -> sortShapes.sorting(null));
    }

    @Test
    void whenListIsNotEmpty(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(5));
        shapes.add(new Circle(10));
        shapes.add(new Cube(9));
        assertEquals("[Cylinder{volume=5}, Cube{volume=9}, Circle{volume=10}]",
                sortShapes.sorting(shapes).toString());
    }

    @Test
    void whenIdenticalShapesInList(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(5));
        shapes.add(new Cylinder(10));
        shapes.add(new Cylinder(9));
        assertEquals("[Cylinder{volume=5}, Cylinder{volume=9}, Cylinder{volume=10}]",
                sortShapes.sorting(shapes).toString());
    }

    @Test
    void whenOnlyOneShapesInList(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(9));
        assertEquals("[Cylinder{volume=9}]",
                sortShapes.sorting(shapes).toString());
    }
}