import java.util.Scanner;

abstract class vehicle{
    abstract void name();
    public static void MaxSpeed(int max){
        System.out.println(max +" is the maximum Speed!");
    }
    public static void minSpeed(int min){
        System.out.println(min +" is the minimum Speed!");
    }
}
class Bike extends vehicle{
    public void name(){
        System.out.println("Bike name: "+ "Benz");
    }
    public void Speed(int max, int min){
        super.MaxSpeed(max);
        super.minSpeed(min);
    }
}

public class abstaClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Bike objBike = new Bike();
        int a = input.nextInt();
        int b = input.nextInt();
        objBike.name();
        objBike.Speed(a,b);
    }
}
