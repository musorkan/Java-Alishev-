package javaExample;

import java.util.Scanner;

public class FivtySix {
    public static void main(String[] args) {


        System.out.println("Enter command: ");
        Scanner input = new Scanner(System.in);
        char request = input.next().charAt(0);

        switch (request){
            case  'y':
                System.out.println("Your request is being processed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'h':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }

    }
}
