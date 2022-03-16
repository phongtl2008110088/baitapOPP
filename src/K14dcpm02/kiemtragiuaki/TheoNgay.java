package K14dcpm02.kiemtragiuaki;

import java.text.ParseException;
import java.util.Date;

public class TheoNgay extends Donthanhtoan {
    protected double day;

    public TheoNgay() {
    }

    public TheoNgay(String maDon, Date ngayThanhToan, String maPhong, double giaPhong , String KhachHang ,double day) {
        super(maDon, ngayThanhToan, maPhong, giaPhong , KhachHang);
        this.day = day;
        settongTien();
    }

    protected double gettheoNgay() {
        return day;
    }

    protected void settheoNgay(double days) {
        this.day = days;
    }

    protected double gettongTien() {
        return this.Tong;
    }

    protected void settongTien() {
        this.Tong = this.day * this.giaPhong;
        if (day > 7)
            this.Tong /= 20/100 ;
    }

    @Override
    public void inBill() throws ParseException {
        super.inBill();
        System.out.println("So ngay thue phong =:");
        settheoNgay(scanner.nextDouble());
        settongTien();
    }

    @Override
    public void outBill() {
        super.outBill();
        System.out.printf("%-20.2f %-20.2f\n", gettheoNgay(), gettongTien());
    }
}
