package ua.yakubovskiy.task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public List<Integer> sorting(List<Integer> numbers){
        if(numbers == null) throw new NullPointerException("list must not be null");
        if(numbers.isEmpty()) throw new IllegalArgumentException("list must not be empty");
        return numbers.stream().filter(integer -> integer >= 0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
