package vn.edu.giadinh.buoi8;

import java.text.ParseException;

public class Thucphamtest {
    public static void main(String[] args) throws ParseException {
        Hangthucpham htp = new Hangthucpham();
        htp.nhapThongTin();
        System.out.println(htp.toString());
    }
    }
