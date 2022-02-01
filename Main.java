//Carlo Golfo
package com.company;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println(" 1     2     3     4");
        for (int x = 0; x<4; x++)
        {
            System.out.printf("%-6s","x");
        }
        System.out.println("\n");
        for (int i = 1; i<=10; i++)//for the base
        {
            System.out.printf("%2d", i);
            for(int e = 2; e<=4; e++)
            {
                System.out.printf("%6d",(int)Math.pow(i,e));

            }
            System.out.printf("%n");
        }
    }
}
