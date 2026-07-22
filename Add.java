
/* Simple Java program to add two numbers */

import java.io.File;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("Sum = " + (a + b));
    }
}
