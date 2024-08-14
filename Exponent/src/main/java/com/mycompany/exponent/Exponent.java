package com.mycompany.exponent;

import java.util.Scanner;

/**
 * @author Ntlakanipho Mgaguli
 */
public class Exponent 
{
    private static int power(int m,int n)
    {
        if(n == 0)
            return 1;
        else
            return m*power(m,n-1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter base: ");
        int base = input.nextInt(); //accepting base from the user
        System.out.println("Enter exponent/power: ");
        int exp = input.nextInt(); //accepting exponent from the user
        
        int pow = power(base,exp); //calling recursive method
        
        System.out.println(base+"^"+exp+": "+pow);
    }
}
