package Day20;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        int min = 9999999;
        Scanner input = new Scanner(System.in);

        for(int sifra=0; sifra<5; sifra++){
            System.out.println("Enter you number: ");
            int num = input.nextInt();
            if(num<min){
                min=num;

            }

        }
        System.out.println(min+": This is minimum number: ");
    }
}
