package vn.edu.giadinh.buoi3;

public class DogtestDrive {
    public static void main(String[] args) {
        Dog mot = new Dog();
        mot.size = 7;
        Dog hai = new Dog();
        hai.size = 12;

        System.out.println("Chó 1: ");
        mot.bark();
        mot.getBigger();
        mot.run();
        System.out.println("Chó 2: ");
        hai.bark();
        hai.getBigger();
        hai.run();
    }
}
