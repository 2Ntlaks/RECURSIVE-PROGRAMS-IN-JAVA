package com.mycompany.discendingorder;

import java.util.Scanner;

public class DiscendingOrder 
{
    //Method to recursively display numbers in descending order
    private static void discendingOrder(int number)
    {
        if(number > 0)
        {
            System.out.printf("%d ",number);
            discendingOrder(number - 1);
        }
    }

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter n number to be display in discending order: ");
        int x = input.nextInt();
        
        discendingOrder(x); //calling the method to be executed in the main method
    }
}
