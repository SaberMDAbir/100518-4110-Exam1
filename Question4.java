/*
MD Abir A. Choudhury
100518 - Exam 1
Question 4
Write a Java Console applications that asks the user repeatedly to enter an 
integer between 1 and 10. The program should display a triangle that contains 
numbers. It displays 1 on the first row, 1 and 2 on the second, 1, 2, and 3 
on the third row and so on...up to the number entered by the user.  
*/

// import libraries
import java.lang.String;
import java.util.*;

class Question4{
    public static int errorCheck(int num) {
        if(num <= 0 || num > 10) {
            Scanner S = new Scanner(System.in);
            System.out.println("Please input a valid number: ");
            num = S.nextInt();
            errorCheck(num);
        }
        return num;
    }

    public static int printTriangle(int num) {
        num = errorCheck(num);

        // print top half of isoceles triangle
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int num = 0;
        // get user input for number between 1 and 10
        do{
            try{
                Scanner S = new Scanner(System.in);
                System.out.print("Enter an integer from 1 to 10 or enter 0 to exit the application: ");
                num = S.nextInt();
                if(num == 0) {
                    System.out.println("You have chosen to exit the application. Closing Application.");
                    System.exit(0);
                }
                printTriangle(num);
            }
            catch (InputMismatchException e) {
                num = errorCheck(num);
                printTriangle(num);
            }
        } while(num != 0);
    }
}