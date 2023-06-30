package com.ss2_loop.bai_tap;



class Bike{
    int id;
    String name;
    String gioitinh;

   
    Bike(int id, String name, String gioitinh){
        this.id = id;
        this.name = name;
        this.gioitinh = gioitinh;
    }
    Bike(){}
    public void display(){
        System.out.println("id : "+ id);
        System.out.println("name : "+ name);
        System.out.println("gioi tinh : "+ gioitinh);
    }
}
public class Test {
    public static void main(String[] args){

        Bike bike_3 = new Bike(15,"tuan","nam");
        bike_3.display();
    }
}

