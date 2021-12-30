import java.util.Scanner;

interface Ractangle {
    void Side(int a, int b);
}
class Calculate implements Ractangle{
    public void Side(int a, int b){
        System.out.println("Ractangle is: "+(2*a*b));
    }
}
class areaOf extends Calculate implements Ractangle {
    public void square(int a, int b){

    }
    public void Side(int len, int bread){
        System.out.println(2*len*bread);
    }
}
public class mainClassOne{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Calculate objCalc = new Calculate();
        objCalc.Side(a,b);
        areaOf objArea = new areaOf();
        int len = input.nextInt();
        int bread  = input.nextInt();
        objArea.Side(len,bread);
    }
}
