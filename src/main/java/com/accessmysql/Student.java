package com.accessmysql;

public class Student {
    String name;
    int age;

    public Student() {
        System.out.println("无参");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭！");
    }
    public void sleep() {
        System.out.println("睡觉！");
    }
    public void study() {
        System.out.println("学习！");
    }

}
