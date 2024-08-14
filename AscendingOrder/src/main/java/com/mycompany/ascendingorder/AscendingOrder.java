package com.mycompany.ascendingorder;

/**
 * @author Ntlakanipho Mgaguli
 */

import java.util.Scanner;

public class AscendingOrder
{
    //Method to recursively display numbers in ascending order
    private static void ascendingOrder(int number)
    {
        if(number > 0)
        {
            ascendingOrder(number -1);
            System.out.printf("%d ",number);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n number to be display in ascending order: ");
        int x = input.nextInt();
        
        ascendingOrder(x);
    }
}
