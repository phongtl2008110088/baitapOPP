package K14dcpm02.lad4;
import java.util.Scanner;
public class sanpham {
     //attribute
     private String ten;
     private double gia;
     private double giamGia;
     //method
     protected void nhap(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Nhập tên sản phẩm: ");
         ten = scanner.nextLine();
         System.out.print("Nhập giá sản phẩm: ");
         gia = scanner.nextDouble();
         System.out.print("Nhập giảm giá: ");
         giamGia = scanner.nextDouble();
     }
     protected double getThueNhapKhau(){
         return (gia/100)*10;      
     }
     protected void xuat(){
         System.out.println("Tên sản phẩm: "+ten);
         System.out.println("Đơn giá: "+gia);
         System.out.println("Giảm giá: "+giamGia);
         System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
     }
}
