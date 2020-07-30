package ForLoop;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your number: ");
        int sifra = input.nextInt();
        int result=0;

        for(int i=0; sifra>=i;i++){
            result+=i;


        }
        System.out.println(result);
    }
}
