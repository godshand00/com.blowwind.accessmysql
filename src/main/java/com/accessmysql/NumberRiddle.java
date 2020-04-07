package com.accessmysql;/*
@author     Leon.King
@Date       2020/4/4
  
*/

import java.util.Random;
import java.util.Scanner;

public class NumberRiddle {
    static int c;

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println("来猜数字吧！");
        System.out.println("我是1到100中的其中一个，看你几次能猜中我！");
        int gg;
        do {
            gg = getnum();
            if (gg > num) {
                System.out.println("你猜得大了哦！");
                System.out.println();
            } else if (gg < num) {
                System.out.println("你猜得小了哦！");
                System.out.println();
            }
        } while (num != gg);
            System.out.println("你真厉害，你猜中了！  ^$^  ");
    }

    public static int getnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("快来猜猜吧：");
        int i = sc.nextInt();
        if ((i < 1) | (i > 100)) {
            System.out.println(" 你猜得不对哦，只能是1到100中的整数哦！");
        } else {
            c = c + 1;
            System.out.println("你已经猜了" + c + "次了！");
            return i;
        }
        return 0;
    }
}
