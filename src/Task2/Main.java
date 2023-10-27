package Task2;

import java.util.Scanner;

public class Main {

    static void countAreaPerimetr(Rectangle rect){


        System.out.println("площа прямокутника: " + rect.areaCalculator() +"\n" + "периметр прямокутника: " + rect.perimeterCalculator());
    }

    static Rectangle prepareRect(){

        Scanner enterSide = new Scanner(System.in);
        double side1;
        double side2;
        System.out.println("type in the width of rectangle");
        side1 = enterSide.nextDouble();
        System.out.println("type in the length of rectangle");
        side2 = enterSide.nextDouble();
        return new Rectangle(side1,side2);

    }

    public static void main(String[] args) {

       Rectangle createdRect = prepareRect();
       countAreaPerimetr(createdRect);

    }

}
