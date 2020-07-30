package javaExample;

import javax.swing.*;
import java.util.Scanner;

public class fivtyseven {
    public static void main(String[] args) {
        System.out.println("input: ");
        Scanner input = new Scanner(System.in);
        String  text = input.nextLine();
        int dlina = text.length()/2;
        String actual_text = text.substring(0, dlina);
        System.out.println("output: "+ actual_text+actual_text);

    }
}
