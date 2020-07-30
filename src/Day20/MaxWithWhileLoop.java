package Day20;

import java.util.Scanner;

//=====Find MIN and MAX number given by User=======
public class MaxWithWhileLoop {
    public static void main(String[] args) {
        int max=-999999;
        int min=9999999;
        Scanner input = new Scanner(System.in);
        int loop=1;

        while (5>=loop){
            System.out.println("Enter you number");
            int num = input.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

            loop++;
        }
        System.out.println(max+ " Is your max number");
        System.out.println(min+ " is your min number");
    }
}
