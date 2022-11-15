package ua.yakubovskiy.task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopHashtags {

    public Map<String, Long> chooseTop(List<String> lines){
        if(lines == null) throw new NullPointerException("list must not be null");
        if(lines.isEmpty()) throw new IllegalArgumentException("list must not be empty");
        List<String> lineStrings = new ArrayList<>();
        for(String s:lines){
            lineStrings.addAll(Arrays.stream(s.split(" "))
                    .collect(Collectors.toSet()));
        }
        return lineStrings.stream()
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
    }

}
