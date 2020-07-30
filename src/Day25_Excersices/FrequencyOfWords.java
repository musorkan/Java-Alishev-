package Day25_Excersices;

import java.util.Arrays;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str="catcat";
        int count=0;
        while(str.contains("cat")){
            count++;
            str=str.replaceFirst("cat","");
        }
        System.out.println(count);


    }
}
