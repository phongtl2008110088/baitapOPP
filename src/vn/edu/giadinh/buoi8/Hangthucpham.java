package vn.edu.giadinh.buoi8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hangthucpham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHetHan;

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    String nsx, hsd;

    public String getMaHang() {
        return this.maHang;
    }

    private void setMaHang(String maHang) {
        do {
            System.out.println("Nhap ma hang: ");
            maHang = scanner.nextLine();
            if (maHang.isBlank() == true)
                System.out.println("Ma hang khong duoc de trong");
        } while (maHang.isBlank() == true);
        this.maHang = maHang;
    }

    public String getTenHang() {
        return this.maHang;
    }

    public void setTenHang(String tenHang) {
        do {
            System.out.println("Nhap ten hang: ");
            tenHang = scanner.nextLine();
            if (tenHang.isBlank() == true)
                System.out.println("Ten hang khong duoc de trong");
        } while (tenHang.isBlank() == true);
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        do {
            System.out.println("Nhap don gia: ");
            donGia = scanner.nextDouble();
            if (donGia <= 0)
                System.out.println("Don gia phai > 0");
        } while (donGia <= 0);
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return this.ngaySX;
    }

    public void setNgaySX(Date ngaySX) throws ParseException {
        scanner.nextLine();
        do {
            System.out.println("Nhap ngay san xuat: ");
            nsx = scanner.nextLine();
            if (nsx.isBlank() == true)
                System.out.println("Ngay san xuat khong duoc de trong");
        } while (nsx.isBlank() == true);
        ngaySX = date.parse(nsx);
        this.ngaySX = ngaySX;
    }

    public Date getNgayHetHan() {
        return this.ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) throws ParseException {
        do {
            do {
                System.out.println("Nhap ngay het han: ");
                hsd = scanner.nextLine();
                if (hsd.isBlank() == true)
                    System.out.println("Ngay het han khong duoc de trong");
            } while (hsd.isBlank() == true);
            ngayHetHan = date.parse(hsd);
            if (ngayHetHan.after(getNgaySX()) == false)
                System.out.println("Ngay het han phai sau ngay san xuat");
        } while (ngayHetHan.after(getNgaySX()) == false);
        this.ngayHetHan = ngayHetHan;
    }

    public boolean checkHSD() {
        return this.tinhHSD();
    }

    private boolean tinhHSD() {
        Date today = new Date();
        if (getNgayHetHan().after(today))
            return false;
        else
            return true;
    }

    public Hangthucpham() {

    }

    public Hangthucpham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHetHan)
            throws ParseException {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
    }

    @Override
    public String toString() {
        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHan=" + ngayHetHan + ", ngaySX="
                + ngaySX + ", tenHang=" + tenHang + "]";
    }

    public void nhapThongTin() throws ParseException {
        setMaHang("");
        setTenHang("");
        setDonGia(0);
        setNgaySX(null);
        setNgayHetHan(null);
        if (checkHSD())
            System.out.println("San pham da het han");
        else
            System.out.println("San pham chua het han");
    }
}
