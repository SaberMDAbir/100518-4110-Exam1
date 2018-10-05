/*
MD Abir A. Choudhury
100518 - Exam 1
Question 3
Write a Java GUI application that computes the cost of flowers sold at a 
flower stand. Five kinds of flowers—petunia, pansy, rose, violet, and carnation—
are stocked and cost, respectively, 50¢, 75¢, $1.50, 50¢, and 80¢ per flower. 
Create an array of strings that holds the names of these flowers (Paralell 
arrays). Create another array that holds the cost of each corresponding flower. 

Your program should read the name of a flower and the quantity desired by a 
customer. Locate the flower in the name array and use that index to find the 
cost per stem in the cost array. Compute and print the total cost of the sale.
*/

import javax.swing.*;
import java.lang.String;
import java.text.*;


class Question3{
    public static void main(String[] args) {
        // create the array to store the flower names
        String[] flowers = new String[] {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
        // create the other array to store prices of flowers
        Double[] costOfFlowers = new Double[] {.5, .75, 1.5, .5, .8};
        
        // output to display the options of flowers and take in the flower name
        String userInput = JOptionPane.showInputDialog("Choose a flower from the following list:\n" 
                                    + "Petunia\n"
                                    + "Pansy\n"
                                    + "Rose\n"
                                    + "Violet\n"
                                    + "Carnation");

        // lowercase everything first
        userInput = userInput.toLowerCase();
        // capitalize the first letter of the user input
        userInput = userInput.substring(0,1).toUpperCase() + userInput.substring(1);
        // output option to take in user quantity
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the quantity of those flowers you want"));

        double totalCost = 0.0;
        // find the flower in the array
        for(int i = 0; i < 5; i++) {
            // if the userinput is the same in the array, then find the correlated cost and compute the total cost of flowers
            if(flowers[i].equals(userInput)) {
                // compute the totalcost
                totalCost = quantity * costOfFlowers[i];
            }
        }

        // format to currency
        NumberFormat formatterDouble = NumberFormat.getCurrencyInstance(); 
        // output the totalcost of the sale
        JOptionPane.showMessageDialog(null, "The total cost of the sale is: " + formatterDouble.format(totalCost));
    }
}