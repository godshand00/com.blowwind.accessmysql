package com.accessmysql.accessmysql;/*
@author     Leon.King
@Date       2020/4/3
  
*/

import ch.qos.logback.core.joran.conditional.ElseAction;

import java.util.Scanner;

public class WhoBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入三个数字，我会挑出最大的那一个！");
        System.out.print("请输入第一个数字：");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int i2 = sc.nextInt();
        System.out.print("请输入第三个数字：");
        int i3 = sc.nextInt();

        int max;

        if (i1 > i2) {
            max = i1;
        } else {
            max = i2;
        }

        if (max < i3) {
            max = i3;
        }
        System.out.println("最大的数为：" + max);
    }
}
