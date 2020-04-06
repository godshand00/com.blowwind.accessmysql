package com.accessmysql.accessmysql;/*
@author     Leon.King
@Date       2020/4/2
  
*/

import java.util.Scanner;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 100;
        stu.name = "王二麻子";
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.sleep();
        stu.study();

        System.out.println("=========================");

        Phone pho = new Phone();
        System.out.println(pho.brand);
        System.out.println(pho.price);
        System.out.println(pho.color);
        System.out.println("=========================");

        pho.brand = "三星";
        pho.price = 2000;
        pho.color = "红色";

        System.out.println(pho.brand);
        System.out.println(pho.price);
        System.out.println(pho.color);
        System.out.println("=========================");

        pho.call("玛丽");
        pho.sendMessage();

        System.out.println("=========================");

        Phone pho2 = new Phone();
        System.out.println(pho2.brand);
        System.out.println(pho2.price);
        System.out.println(pho2.color);
        System.out.println("=========================");

        pho2.brand = "苹果";
        pho2.price = 8000;
        pho2.color = "银色";

        System.out.println(pho2.brand);
        System.out.println(pho2.price);
        System.out.println(pho2.color);
        System.out.println("=========================");

        pho2.call("乔布斯");
        pho2.sendMessage();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("你输入了：" + str);

        System.out.println("我们来把两个数加起来！");
        System.out.print("请输入第一个数字：");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int i2 = sc.nextInt();
        System.out.println("两者相加等于：" + (i1 + i2));


    }
}
