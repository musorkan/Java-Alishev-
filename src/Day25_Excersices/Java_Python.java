package Day25_Excersices;

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool, Java is better then Python, python";
        String[] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJava=0;
        int countPython=0;

        for(String each:words){
            if(each.toLowerCase().equalsIgnoreCase("Python")){
                countPython++;
            }
            if(each.contains("Java")){
                countJava++;
            }
        }
        System.out.println("Java Count: "+countJava);
        System.out.println("Python Count: "+countPython);
    }
}
