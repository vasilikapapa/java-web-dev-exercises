package studioExercises.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main (String args[])
    {  Scanner input= new Scanner(System.in);

           System.out.println("Enter a radius: ");

        try {
            double radius=input.nextDouble();
            while(radius<0)
            {
                System.err.println("You entered a negative number! Please try again: ");
                radius = input.nextDouble();
            }
            Double areaOfCircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius "+radius+" is "+areaOfCircle);

        }catch (Exception error)
        {
            System.out.println("You did not enter a number! Please try again: ");

        }
    }
}
