/*
MD Abir A. Choudhury
100418 - Exam 1
*/

import java.util.*;

class Question2{ 
    public static void main(String[] args) {
        String a, b, c, d;
        a = "Cloud Computing!";
        b = " Algorithms "; 
        c = "04 Mars 2013";
        d = "a";

        System.out.println(c.indexOf("0",2));
        System.out.println(a.startsWith("Cloud C"));
        System.out.println(a.substring(c.lastIndexOf('r')));
        System.out.println(a.substring(6,9).equals("com"));
        System.out.println(c + b.length() + a);
        // Illegal --> System.out.println(d.equalsIgonreCase(“A”));


        /*
        int sum = 0;
        double product = 1;
        int max = 20;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
            product = product * i;
        }
        System.out.println("The sum is " + sum + " and the product is " + product);
        */
    }
}