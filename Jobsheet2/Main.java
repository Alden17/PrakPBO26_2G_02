package Jobsheet2;

public class Main {
    public static void main(String[] args) {    
        Circle c = new Circle (5);
        int radius = 5;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + c.area());
        System.out.println("Keliling: " + c.circumference());
    }
}
