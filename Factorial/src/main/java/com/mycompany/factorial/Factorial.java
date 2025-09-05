package com.mycompany.factorial;

import java.util.Scanner;

/*
 * @author Ntlakanipho Mgaguli
 */
public class Factorial 
{
    //method to calculate factorial of a given number by user recursively
    private static int fact(int number)
    {
        if(number == 0)
            return 1;
        else
            return number*fact(number-1);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number you want factorial of: ");
        int x = input.nextInt();
        
        int factorial = fact(x);
        
        System.out.println("Factorial of "+x+" is: "+factorial);
        
    }
}
