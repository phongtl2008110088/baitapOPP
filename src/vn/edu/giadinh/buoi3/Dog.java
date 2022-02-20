package vn.edu.giadinh.buoi3;

public class Dog {
    int size;//the loai
    String bread;
    String name;// ten

    void bark(){
        if(size > 14){
            System.out.println("Buff! buff!");
        }else{
            System.out.println("Wroff! wroff");
        }
    }
    void getBigger(){
        size +=5;
        
    }
    void run(){
        System.out.println("Running ...");
        this.bark();
    } 
}
