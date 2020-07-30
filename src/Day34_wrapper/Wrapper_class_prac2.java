package Day34_wrapper;

import java.util.Scanner;

public class Wrapper_class_prac2 {
    public static void main(String[] args) {

        //=====Max value which can be assigned to int=========

        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println("==============");

        //=====Max value which can be assigned to byte=========

        byte b = Byte.MAX_VALUE;
        System.out.println(b);
        System.out.println("==============");

        //===================Find Max number using .MIN_VALUE=======================

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=5;i++){
            System.out.println("Enter number: ");
            int n = scanner.nextInt();
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);

    }
}
