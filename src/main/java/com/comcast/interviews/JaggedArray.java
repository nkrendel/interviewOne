package com.comcast.interviews;

/**
 * Work with a jagged array in Java
 */
public class JaggedArray
{
    public static void main( String[] args ) {
        Object[] jagged = {2, 4, 10, new Object[] {12, 4, new Object[] {100, 98}, 4}, new Object[] {3, 2, 99}, 0};

        System.out.println(String.format("Max value is: %d", max(jagged)));
    }

    static int max(Object[] array) {
        // TODO: implement finding maximum value in the given jagged array!
        return -1;
    }
}
