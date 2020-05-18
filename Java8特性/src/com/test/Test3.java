package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("I am a boy");
        list.add("I love the girl");
        list.add("But the girl loves another girl");
        list.stream()
                .map(line->line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray()));
    }
}
