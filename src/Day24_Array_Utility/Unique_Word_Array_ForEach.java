package Day24_Array_Utility;

import java.io.OutputStream;

public class Unique_Word_Array_ForEach {
    public static void main(String[] args) {


        String[] word = {"Rakhat", "Eric", "Eric", "Almaz"};

        for(String j:word){
            String s = j;
            int count = 0;

            for (String each : word) {
                if(s.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }

        }


    }
}