package vn.edu.giadinh.buoi10;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import vn.edu.giadinh.buoi8.Hangthucpham;

public class WritingObject {
    public static void main(String[] args) throws IOException {
        Hangthucpham hangthucpham = new Hangthucpham("TP01");

        FileOutputStream outFile = new FileOutputStream("thp.dat");

        ObjectOutputStream objectOut = new ObjectOutputStream(outFile);

        objectOut.writeObject(Hangthucpham);
        objectOut.close();
    }
}
