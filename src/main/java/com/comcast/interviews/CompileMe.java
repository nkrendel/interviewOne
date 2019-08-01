package com.comcast.interviews;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CompileMe {
    public static void main(String[] args) {
        List list = Utils.createList();
        System.out.println("Sum: " + Utils.sum(list));
    }

    static Map createMap() {
        return new HashMap<String, String>();
    }
}
