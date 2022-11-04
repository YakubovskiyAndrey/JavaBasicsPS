package ua.yakubovskiy.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {

    private SortNumbers sortNumbers;

    @BeforeEach
    void setUp() {
        sortNumbers = new SortNumbers();
    }

    @Test
    void whenListIsEmpty(){
        assertThrows(IllegalArgumentException.class, () -> sortNumbers.sorting(new ArrayList<>()));
    }

    @Test
    void whenListIsNotEmpty(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(5);
        numbers.add(10);
        assertEquals("[10, 5, 0]", sortNumbers.sorting(numbers).toString());
    }

    @Test
    void whenOnlyOneValue(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        assertEquals("[5]", sortNumbers.sorting(numbers).toString());
    }

    @Test
    void whenOnlyNegativeValuesResultMustBeEmpty(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-3);
        numbers.add(-10);
        assertTrue(sortNumbers.sorting(numbers).isEmpty());
    }
}