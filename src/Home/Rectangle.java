package Home;

import java.util.Scanner;

public class Rectangle {
    static double perimeterCalculator (double side1, double side2) {
        double p = 2* (side1 + side2 );
        return p;
    }
    static double areaCalculator (double side1, double side2) {
        double s = side1 * side2;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Введіть довжину першої сторони прямокутника ");
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        System.out.println("Введіть довжину другої сторони прямокутника ");
        double side2 = input.nextDouble();
        System.out.println("Периметр прямокутника = " + perimeterCalculator (side1 , side2 ));
        System.out.println("Площа  прямокутника = " + areaCalculator (side1 ,side2 ));


    }

}
