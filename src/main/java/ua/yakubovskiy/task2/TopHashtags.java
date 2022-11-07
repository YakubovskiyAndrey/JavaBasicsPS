package ua.yakubovskiy.task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopHashtags {
    public Map<String, Long> chooseTop(List<String> lines){
        if(lines == null) throw new NullPointerException("list must not be null");
        if(lines.isEmpty()) throw new IllegalArgumentException("list must not be empty");
        Map<String, Long> result = new LinkedHashMap<>();
        lines.stream()
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(5)
                .forEach(stringLongEntry -> result.put(stringLongEntry.getKey(), stringLongEntry.getValue()));
        return result;
    }
}
