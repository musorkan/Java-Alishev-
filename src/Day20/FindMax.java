package Day20;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        //=========Find the Maximum number entered by User=======

        int max = -122434;
        Scanner input = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.println("Enter you number: ");
            int num=input.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.printf(max+" is maximum number");
    }
}
