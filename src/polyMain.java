import org.w3c.dom.css.Rect;

import java.util.Scanner;

class squareArea{
    public void areaOf(int a, int b){
        System.out.println("Area Of Square: "+ a*b);
        System.out.println();
    }
}
class RectangleOne extends squareArea{
    public void areaOf(int a, int b){
        System.out.println("Area of Rectangle is: "+(2*a*b+b*a));
        System.out.println();
        super.areaOf(a,b);
    }
}
class PolyGone extends squareArea{
    public void areaOf(int a,int b){
        System.out.println("Area of Polygone: "+2*a*b);
        System.out.println("Than you!");
    }
}
public class polyMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int squareAreaLen = input.nextInt();
        int squareAreaBread = input.nextInt();
        RectangleOne ObjR = new RectangleOne();
        ObjR.areaOf(squareAreaLen,squareAreaBread);
        int polyA = input.nextInt();
        int polyB = input.nextInt();
        PolyGone objPoly = new PolyGone();
        objPoly.areaOf(polyA,polyB);
    }
}
