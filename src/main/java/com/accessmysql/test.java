package com.accessmysql;/*
@author     Leon.King
@Date       2020/4/2
  
*/

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] xxx = cal(12, 23, 45);
        System.out.println(xxx[0]);
        System.out.println(xxx[1]);

        int[] array = {10, 20, 30, 40, 50 };
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");

        System.out.println(Arrays.toString(array));

    }

    public static int[] cal(int a, int b, int c) {
        int[] result = new int[2];
        result[0] = a + b + c;
        result[1] = (a + b + c) / 3;
        return result;
    }
}
