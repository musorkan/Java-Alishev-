package Day20;

import java.util.Scanner;

public class WhileloopPasswordInput {
    public static void main(String[] args) {
        String passwd="Belek";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your password: ");
        String userInput=input.next();


        while (!userInput.equals(passwd)){
            System.out.println("You Typed wrong Password, Please enter it again");
            userInput=input.next();
        }
        System.out.println("Logged In");
    }
}
