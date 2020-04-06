package com.accessmysql.accessmysql;/*
@author     Leon.King
@Date       2020/4/5
  
*/

public class Demo4StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===================");

        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("++++++++++++++++++++++++");

        String str1 = "How do you do!";
        String str2 = str1.replace("o", "#");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("+++++++++++++++++++++++");

        String lang1 = "阿斯蒂芬 阿斯蒂芬式样阿斯蒂芬月铝合金藏起一李斐莉雪";
        String lang2 = lang1.replace("铝合金","AAAAAA");
        System.out.println(lang1);
        System.out.println(lang2);

    }
}
