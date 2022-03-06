package vn.edu.giadinh.buoi4;

public class Square {
    String Sound = "Square sound";
    boolean click = false;

    void rotare() {
        System.out.printf("run around X3");
        click = true;
    }

    void play() {
        if (click == true) {
            System.out.printf("sound playing: " + Sound);
        } else
            System.out.printf("error");
    }
}
