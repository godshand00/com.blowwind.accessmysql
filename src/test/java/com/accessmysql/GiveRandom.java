package com.accessmysql.accessmysql;/*
@author     Leon.King
@Date       2020/4/4
  
*/
import java.util.Random;

public class GiveRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt();
        System.out.println(i);
        System.out.println("====================");
        for (int j = 1; j <= 10; j++) {
            int num = r.nextInt(21);
            System.out.print(num + " ");
            if (j % 6 == 0) {
                System.out.println();
            }

        }

    }
}
