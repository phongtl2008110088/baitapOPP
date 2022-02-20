package vn.edu.giadinh.buoi2;

import java.util.Scanner;

public class ShapeTestDrive {
    public static void main(String[] args) {

        Shape circle = new Shape("Hinh dang tron");

        Shape triangle = new Shape("Hinh dang tam giac");
        Shape square = new Shape("Hinh dang vuong");

        Scanner varInput = new Scanner(System.in);

        while(true){
            System.out.println("==================MENU-XOAY HINH=================");
            System.out.println("lua chon 1: Xoay hinh dang tron");
            System.out.println("lua chon 2: Xoay hinh dang tam giac");
            System.out.println("lua chon 3: Xoay hinh dang vuong");
            System.out.println("lua chon 4: Thoat chuong trinh: ");
            System.out.println("=================KET THUC======================");

            System.out.print("Chon lua chon: ");
            switch(varInput.nextInt()){
                case 1:
                System.out.println("Da chon hinh dang tron");
                circle.turn();
                circle.play();
                break;
                case 2:
                System.out.println("Da chon hinh dang tam giac");
                triangle.turn();
                triangle.play();
                break;
                case 3:
                System.out.println("Da chon hinh dang vuong");
                square.turn();
                square.play();
                break;
                case 4:
                System.out.println("Thoat chuong trinh xoay hinh");
                System.exit(0);
                break;
               default:
               System.out.println("Thuc hien sai");

            }
            

            
        }
        


    }
}
