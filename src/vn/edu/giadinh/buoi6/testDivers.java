package vn.edu.giadinh.buoi6;

public class testDivers {
    public static void main(String[] args) {
        Lion L = new Lion();
        System.out.println("Lion Attributes");
        System.out.println("==>");
        L.Roam();
        L.Eat();
        L.Sleep();

        System.out.println("-----------");

        Dog D = new Dog();
        System.out.println("Dog Attributes");
        System.out.println("==>");        
        D.Roam();
        D.Eat();
        D.Sleep();

        System.out.println("-----------");

        Woft W = new Woft();
        System.out.println("Wolf Attributes");
        System.out.println("==>");
        W.Roam();
        W.Sleep();
        W.Eat();

        System.out.println("-----------");

        Tiger T = new Tiger();
        System.out.println("Tiger Attributes");
        System.out.println("==>");
        T.Roam();
        T.Eat();
        T.Sleep();

        System.out.println("-----------");

        Cat C = new Cat();
        System.out.println("cat Attributes");
        System.out.println("==>");
        C.Roam();
        C.Eat();
        C.Sleep();

        System.out.println("-----------");

        Hipo H = new Hipo();
        System.out.println("cat Attributes");
        System.out.println("==>");
        H.Roam();
        H.Sleep();
        H.Eat();
    }
}
