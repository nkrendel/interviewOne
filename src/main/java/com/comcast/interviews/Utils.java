package com.comcast.interviews;

import java.util.Arrays;
import java.util.List;

public class Utils {

    static int sum(List<Integer> list) {
        int sum = 0;

        for(int x : list) {
            sum += x;
        }

        return sum;
    }

    static List<Integer> createList() {
        return Arrays.asList(1, 2, 3);
    }
}
