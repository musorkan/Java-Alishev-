package ForLoop;

import javax.swing.*;
import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {

    String reversed = "";

    Scanner input = new Scanner(System.in);
        System.out.println("Please enter your String: ");
    String str = input.next();

    //1.get lengthe of the sring

        for (int dlina = str.length()-1;dlina>=0; dlina--){
            reversed+= str.charAt(dlina);
        }

        if(str.equalsIgnoreCase(reversed)){
            System.out.println(str+" and "+reversed+" are Polindrome");
        }else {
            System.out.println("Not Polindrom");
        }
}
}
