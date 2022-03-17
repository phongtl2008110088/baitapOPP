package K14dcpm02.kiemtragiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Menu {
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Donthanhtoan bill[] = new Donthanhtoan[10];
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("=========================Menu==============");
            System.out.println("======================================");
            System.out.println("1. Nhap danh sach cac hoa don thuae phòng ");
            System.out.println("2. Xuat danh sach cac hoa don thue phiong ");
            System.out.println("3. Trung binh thanh tien thue phong trong thang 9/2013");
            System.out.println("4. Tong so luong hoa don cho tung loai thue phong");
            System.out.println("5. Thoat");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1: {
                    int Menu1;
                    do {
                        System.out.println("======================================");
                        System.out.println("1. Nhap danh sach hoa don thue theo ngay");
                        System.out.println("2. Nhap danh sach hoa don thue theo gio");
                        System.out.println("3. Thoat");
                        Menu1 = scanner.nextInt();
                        switch (Menu1) {
                            
                            case 1: { //ngay
                                System.out.println("Nhap so hoa don theo ngay :");
                                int n = scanner.nextInt();
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Hoa don thu " + (i + 1) + ":");
                                    TheoNgay dailyBill = new TheoNgay();                                 
                                }
                            }
                                ;
                                break;
                                case 2: { // gio
                                    System.out.println("Nhap so hoa don theo gio :");
                                    int n = scanner.nextInt();
                                    for (int i = 0; i < n; i++) {
                                        System.out.println("Hoa don thu " + (i + 1) + ":");
                                        TheoGio donTheoGio = new TheoGio();
                                        donTheoGio.inBill();               
                                    }
                                }
                                    ;
                                    break;
                            case 3:
                                break;
                        }
                    } while (Menu1 != 3);

                }
                    ;
                    break;
                case 2: {
                    int Menu1;
                    do {
                        System.out.println("======================================");
                        System.out.println("1. Xuat danh sach hoa don thue theo ngay");
                        System.out.println("2. Xuat danh sach hoa don thue theo gio");
                        System.out.println("3. Thoat");
                        Menu1 = scanner.nextInt();
                        switch (Menu1) {
                            case 1: {
                                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Ma hoa don",
                                        "Ngay hoa don", "Ten khach hang", "Ma phong", "Don gia", "So ngay",
                                        "Thanh tien");    
                                     break;                                                                                     
                            }
                            case 2: {
                                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Ma hoa don",
                                        "Ngay hoa don", "Ten khach hang", "Ma phong", "Don gia", "So gio",
                                        "Thanh tien");                               
                            }
                                ;
                                break;
                            
                            case 3:
                                break;
                        }
                    } while (Menu1 != 3);
                }
                    ;
                    break;
                
                case 3: {
                    double trungBinh = 0;
                    int count1 = 0;
                    for (int i = 0; i < count1; i++) {
                        if (formatter.format(bill[i].ngayThanhToan).contains("09/2013")) {
                            trungBinh += bill[i].Tong;
                            count1++;
                        }
                    }
                    if (count1 != 0) {
                        trungBinh /= count1;
                        System.out.println("Trung binh thanh tien cua cac hoa don thang 9/2013 la: " + trungBinh);
                    } else
                        System.out.println("Khong co hoa don nao cua thang 9/2013");
                }
                    ;
                    break;
                    case 4: {
                        int Menu1;
                        do {
                            System.out.println("======================================");
                            System.out.println("1. Tong so luong hoa don thue theo ngay");
                            System.out.println("2. Tong so luong hoa don thue theo gio");
                            System.out.println("3. Thoat");
                            Menu1 = scanner.nextInt();
                            switch (Menu1) {
                                case 1: {
                                    int countNgay = 0;
                                    for (int i = 0; i < countNgay; i++)
                                        if (bill[i] instanceof TheoNgay)
                                            countNgay++;
                                    System.out.println("Tong so luong hoa don theo ngay: " + countNgay);
                                }
                                    ;
                                    break;
                                case 2: {
                                    int countGio = 0;
                                    for (int i = 0; i < countGio; i++)
                                        if (bill[i] instanceof TheoNgay)
                                            countGio++;
                                    System.out.println("Tong so luong hoa don theo gio: " + countGio);
                                }
                                    ;
                                    break;
                                case 3:
                                    break;
                            }
                        } while (Menu1 != 3);
    
                    }
                        ;
                        break;
            }
        } while (luaChon != 5);
    }
}
