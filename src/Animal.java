import java.util.Scanner;

class Animal{
    public void Nature(){
        System.out.println("animals contains different colors.");
        System.out.println("animals can shouts.");
    }
    public void eat(){
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal{
    public void Nature(){
        System.out.println("Dog barks.");
        System.out.println("Dog always roms.");
        super.eat();
        super.Nature();
    }
}
class mainClass{
    public static void main(String[] args){
        Dog objDog = new Dog();
        objDog.Nature();

    }
}
