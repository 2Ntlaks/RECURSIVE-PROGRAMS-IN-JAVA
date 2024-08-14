package com.mycompany.fibonacciseries;

import java.util.Scanner;

/**
 * @author Ntlakanipho Mgaguli
 */
public class FibonacciSeries 
{
    private static int fib(int number)
    {
        if( number == 0 || number ==1)
            return number;
        else
            return fib(number -2) + fib(number-1);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n number of fibonacci series: ");
        int x = input.nextInt();
        
        int fibonacci = fib(x);//calling recursive method
        
        System.out.println("Fibonacci series of "+x+": "+fibonacci);
    }
}
