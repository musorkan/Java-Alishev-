package Day25_Excersices;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {


        int[] numbers = new int[100];

        for(int i=0; numbers.length-1>=i;i++){

                numbers[i] = i +1;

        }
        System.out.println(Arrays.toString(numbers));
        for(int each:numbers){
            if(each%2==0){
                System.out.print(each+" ");
            }
        }
    }
}
