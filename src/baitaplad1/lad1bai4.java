package baitaplad1;
import java.util.Scanner;

public class lad1bai4 {
    public static void main(String[] args) {
        Float a,b,c,delta;
        double canDelta;
        System.out.println("Nhap he so a,b,c cua phuong trinh : ");
        Scanner bien = new Scanner(System.in);
        
        a = bien.nextFloat();
        b = bien.nextFloat();
        c = bien.nextFloat();
        delta = b*b - 4*a*c;
        canDelta = Math.sqrt(delta);
        System.out.println("delta co ket qua la : "+delta);
        System.out.println("can cua delta co ket qua la :"+canDelta);

    
    }
}
