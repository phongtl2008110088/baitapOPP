package vn.edu.giadinh.buoi4;

public class Amoeba {
    String music= "AmoebaSound.HIF";
    boolean click = false;
    int x;
    int y;
    void click(){
        click = !click;
	}
    void playSound(){
        if(click ==true){
            System.out.println("Phát ra file âm thanh "+music);
        }	
    }
    void rotate(){
        if(click==true){
            System.out.println("Xoay 360 theo tọa độ x= "+x+" y = "+y);
        }
        
    }
    Amoeba(){

    }
    Amoeba(int xx,int yy){
        x = xx;
        y = yy;
    }
}
