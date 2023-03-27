package com.epam.mjc;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
          List<Integer> modifiedList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        return modifiedList;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
         List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        return result;
    }

    public Optional<Integer> findMax(List<Integer> list) {
         Optional<Integer> max = list.stream().max(Integer::compare);
        return max;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> min = list.stream().flatMap(Collection::stream).min(Integer::compare);
        return min;
    }

    public Integer sum(List<Integer> list) {
         Integer sum = list.stream().reduce(0, Integer::sum);
        return sum;
    }
}
