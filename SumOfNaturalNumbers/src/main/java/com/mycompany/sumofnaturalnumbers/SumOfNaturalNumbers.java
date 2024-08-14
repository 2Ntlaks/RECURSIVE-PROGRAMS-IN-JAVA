package com.mycompany.sumofnaturalnumbers;

import java.util.Scanner;

/*
  @author Ntlakanipho Mgaguli
 */
public class SumOfNaturalNumbers 
{
    //Method to calculate sum of n natural numbers using recursion
    private static int sumOfNumbers(int number)
    {
        if(number == 0)
            return 0;
        else
            return number + sumOfNumbers(number -1);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n number to be display in ascending order: ");
        int x = input.nextInt();
        
        int sum = sumOfNumbers(x);
        
        System.out.println("Sum of first "+x+" natural numbers: "+sum);
    }
}
