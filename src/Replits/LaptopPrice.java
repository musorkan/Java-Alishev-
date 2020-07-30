package Replits;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
Write a program that will calculate laptop price based on the components.


First ask user for a screen size.
 If screen size is equals to 13.3, add  $200 to the laptop price.
 If screen size is equals to  15.0 - add  $300 to the laptop price.
 If screen size is equals to  17.3 - add  $400 to the laptop price.
 Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
  If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price.
  Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type.
  There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.
  If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution.
  There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
Example:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Example #2

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */
public class LaptopPrice {
    public static void main(String[] args) {

        double screenSize=0;
        int laptopPrice=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Screen size: ");
        screenSize = scan.nextDouble();
        if(screenSize==13.3){
            laptopPrice+=200;
        }else if (screenSize==15.0){
            laptopPrice+=300;
        }else if(screenSize==17.3){
            laptopPrice+=400;
        }

        System.out.println("Enter CPU Type: ");
        String cpuInfo = scan.next();
        if(cpuInfo.equals("i7")){
            laptopPrice+=350;
        }else if(cpuInfo.equals("i5")){
            laptopPrice+=300;
        }else if(cpuInfo.equals("i3")){
            laptopPrice+=250;
        }


        System.out.print("The laptop Price is : "+laptopPrice+"$");

    }
}
