package Bridgelabz;

import java.util.Scanner;

public class SwitchCaseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number : ");
        double num2 = sc.nextDouble();

        System.out.println("Enter your Choices (1 for Addition) , " +
                "(2 for Subtraction), " +
                "(3 for Multiplication), " +
                "(4 For Division) ");
        int x = sc.nextInt();
        switch (x){
            case 1:
              double add = num1 + num2;
                System.out.println("Addition is : " +add);
              break;
            case 2:
                double sub = num1 - num2;
                System.out.println("Subtraction is :" +sub);
                break;
            case 3:
                double multi = num1 * num2;
                System.out.println("multiplication is :" +multi);
                break;
            case 4:
                double divi = num1  / num2;
                System.out.println("Division is : " +divi);
                break;
            case 5:
                System.out.println("Invalid Input");
                break;
        }
    }
}
