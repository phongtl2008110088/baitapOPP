package vn.edu.giadinh.buoi2;
/* */
public class Shape {
    String shape;

    public Shape(String newShape){
        shape = newShape;
    }

    //hành vi
    public void turn(){
        System.out.println("Xoay hinh vuong 360 do... ");
    }

    public void play(){
        System.out.println("run................ ");
    }
}