package K14dcpm02.kiemtragiuaki;

import java.text.ParseException;
import java.util.Date;

public class TheoGio extends Donthanhtoan {
    protected double h ; // viet tac cua gio= h 

    public TheoGio() {
    }

    public TheoGio(String maDon, Date ngayThanhToan, String maPhong, double giaPhong , String KhachHang ,double Gio) {
        super(maDon, ngayThanhToan, maPhong, giaPhong , KhachHang);
        this.h = Gio;
        settongTienTheoGio();
    }

    protected double getGio() {
        return this.h;
    }

    protected void setGio(double Gio) {
        this.h = Gio;
    }

    protected double gettonggio() {
        return this.Tong;
    }

    protected void settongTienTheoGio() {
        if (this.h > 24 && this.h < 30)
            this.Tong = 24 * this.giaPhong;
        else if (h < 24)
            this.Tong = this.h * this.giaPhong;
        else
            System.out.println(" qua 30 tieng");
            System.out.println(" khong dung lai hoa don");
    }

    @Override
    public void inBill() throws ParseException {
        super.inBill();
        System.out.println("Nhap so gio thue phong:");
        setGio(scanner.nextDouble());
        settongTienTheoGio();
    }

    @Override
    public void outBill() {
        super.outBill();
        System.out.printf("%-20.2f %-20.2f\n", getGio(), gettonggio());
    }
}
