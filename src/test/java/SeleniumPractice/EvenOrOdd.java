package SeleniumPractice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number=");
        int number = sc.nextInt();
        if((number%2)==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd");
        }

    }
}
