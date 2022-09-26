package testExeercise;

import java.util.Scanner;

public class qus_3 {

    /*
    Write a java program to show following menu to the user:
    *******Menu*******
    1. Calculate Area of Circle
    2. Calculate Circumference of a Circle
    3. Exit.
    Choose an option (1-3):
    Take radius as user input.
    Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
    */

    static final double pi = 3.141;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("************ MENU *********** \n 1. Calculate Area of circle " +
                    "\n 2. Claculate circumference of circle" +
                    "\n 3. Exit \n Choose an option(1-3)");

            int menu = sc.nextInt();


            switch (menu){
                case 1:
                    calculateArea();
                    break;
                case 2:
                    calculateCircumference();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

     static void calculateArea(){
        long radius = inputRadius();
        System.out.print("The area of circle is : ");
        System.out.println(pi*radius*radius);
    }

     static void calculateCircumference(){
         long radius = inputRadius();
        System.out.print("The circumference of circle is : ");
        System.out.println(2*pi*radius);
    }

    // added this method for code reuseability as it is executed after the switch statement
    static long inputRadius(){
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
}
