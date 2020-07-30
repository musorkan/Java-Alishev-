package Replits;
/*
        Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
         */

import javax.swing.*;
import java.util.Scanner;

public class VendingMashine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Insert your coin, It must be no greater than 100 cent and no lower than 25 c: ");
        int itemPrice = input.nextInt();
        int quaters=25;
        int dimes=10;
        int nickels=5;
        boolean valid = itemPrice<=100 && itemPrice>25 && itemPrice%5==0;

        if(valid){
            int quat=itemPrice/quaters;
            int dim=itemPrice%quaters/dimes;
            int nic= itemPrice%quaters%dimes/nickels;

            System.out.println(quat+" quoters, "+dim+" dimes, "+nic+" nickels ");


        }else{
            System.out.println("Not Valid");
        }

    }
}
