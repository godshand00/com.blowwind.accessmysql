package com.accessmysql;/*
@author     Leon.King
@Date       2020/4/2
  
*/

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给" + who + "打电话");
        return;
    };
    public void sendMessage(){
        System.out.println("群发短信");
        return;
    };

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
