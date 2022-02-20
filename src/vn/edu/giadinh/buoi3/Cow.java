package vn.edu.giadinh.buoi3;

public class Cow {
     //attribute: thuộc tính
     double weight;// cân nặng
     int age;//tuổi
 
     //hàm tạo mặc định
     Cow(){
         weight = 11.2;
         age = 5;
     }
     //Constructor co tham so
     Cow(double w, int a){
         weight = w;
         age = a;
     }
 
     //method
     void moo(){
         System.out.println("Be be ....");
     }
     void show(){
         System.out.println("Can nang: "+weight);
         System.out.println("Tuoi: "+age);
     }
}
