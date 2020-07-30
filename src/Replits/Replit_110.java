package Replits;

import javax.print.attribute.standard.PresentationDirection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class Replit_110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number for Array Size: ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] myArr=new String[n];

        for (int i=0; n-1>=i; i++){
            System.out.println("Enter the Value for Index: "+i);
            myArr[i]=scan.nextLine();
        }
        System.out.println(Arrays.toString(myArr));

        for(String each:myArr){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        }

            }

    }

