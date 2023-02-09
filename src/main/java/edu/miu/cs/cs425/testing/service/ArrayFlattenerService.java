package edu.miu.cs.cs425.testing.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattenerService {

    public static List<Integer> flattenArray(Integer[][] arr) {

        List<Integer> streamList = new ArrayList<>();

        for (Integer[] array : arr) {
            Arrays.stream(array)
                    .forEach(streamList::add);
        }

        Integer[] flattenArray = streamList.stream().toArray(Integer[] ::new);

//        System.out.println("Input: " + Arrays.deepToString(arr));
//        System.out.println("Output: " + Arrays.toString(flattenArray));
        return List.of(flattenArray);


    }
}
