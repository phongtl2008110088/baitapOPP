package K14dcpm02.kiemtragiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Donthanhtoan {
   
    protected String maDon;
    protected Date ngayThanhToan ;
    protected String maPhong;
    protected double giaPhong;
    protected String khachHang;
    protected double Tong;

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Donthanhtoan() {

    }

    public Donthanhtoan(String maDonThanhToan, Date ngayThanhToan, String maPhon, double gia, String khachHang) {
        this.maDon = maDonThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.maPhong = maPhon;
        this.giaPhong = gia;
        this.khachHang = khachHang;
    }

    protected String getmaDon() {
        return maDon;
    }

    protected void setmaDonHang(String maDon){
        this.maDon = maDon;
    }

    protected Date getngay() {
        return ngayThanhToan;
    }

    protected void setngay(Date date) {
        this.ngayThanhToan = date;
    }

    protected String getmaPhong() {
        return maPhong;
    }

    protected void setmaP(String MaP) {
        this.maPhong = MaP;
    }

    protected double getGia() {
        return giaPhong;
    }

    protected void setGia(double gia) {
        this.giaPhong = gia;
    }
    protected String getKhachHang() {
        return khachHang;
    }

    protected void setKhachHang(String khachhang) {
        this.khachHang = khachhang;
    }

    @Override
    public String toString() {
        return "thanh toan tien : ma Thanh Toan=" + maDon + ", Khach Hang=" + khachHang + ", ngay tra =" + ngayThanhToan + 
        " ,gia =" + giaPhong + ", ma Phong =" + maPhong ;
    }


    public void inBill() throws ParseException {
        System.out.println("Nhap ma hoa don:");
        setmaDonHang(scanner.nextLine());
        System.out.println("Nhap ngay hoa don:");
        setngay(formatter.parse(scanner.nextLine()));
        System.out.println("Nhap ten khach hang:");
        setKhachHang(scanner.nextLine());
        System.out.println("Nhap ma phong:");
        setmaP(scanner.nextLine());
        System.out.println("Nhap don gia:");
        setGia(scanner.nextDouble());
    }

    public void outBill() {
        System.out.printf("%-20s %-20s %-20s %-20.2s %-20f", getmaDon(), formatter.format(getngay()), getKhachHang(),getmaPhong(), getGia());
    }

}
