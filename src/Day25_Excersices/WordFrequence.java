package Day25_Excersices;

import java.util.Arrays;

public class WordFrequence {
    public static void main(String[] args) {
        String str = "JavajavaJavajava";
        int count =0;
        str=str.toLowerCase();


        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java","");
        }
        System.out.println(count);


    }
}
