/*
MD Abir A. Choudhury
100518 - Exam 1
Question 5
Write a Java GUI Application that will ask the user a phrase then it will 
reverse and display the phrase in the reverse order. Use your own algorithm, 
you are not allowed to use the reverse method.
Sample Run:
Enter a Phrase: Programming languages is fun
The phrase in reverse order is: nuf si segaugnal gnimmargorP
  
*/

import javax.swing.*;
import java.lang.String;


class Question5{
    public static void main(String[] args) {
        // ask the user for a phrase
        String phrase = JOptionPane.showInputDialog("Enter a phrase:");
        String reversedPhrase = "";

        // reverse the order of the phrase
        for(int i = phrase.length() - 1; i >= 0; i--) {
            reversedPhrase = reversedPhrase + phrase.charAt(i);
        }

        // display the phrase in dialog box
        JOptionPane.showMessageDialog(null, "The phrase in reversed order is: " + reversedPhrase);
    }
}