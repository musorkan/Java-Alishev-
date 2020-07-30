package Day25_Excersices;

import javax.naming.PartialResultException;
import javax.swing.*;

public class ShortTestString {
    public static void main(String[] args) {


        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        int minLength = arr[0].length();


        for (int i = 0; arr.length - 1 >= i; i++) {
            int l = arr[i].length();
            if(l<minLength){
                minLength=l;
            }
        }

        for (int j=0;arr.length-1>=j;j++){
            if(arr[j].length()==minLength){
                System.out.println(arr[j]);
            }
        }

    }
}

