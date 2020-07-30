package Day27_Exercises;

import javax.swing.text.DefaultEditorKit;
import java.util.Arrays;

public class Multi_Dimentional_Arrays {
    public static void main(String[] args) {


    String[][] D2Array = {{"Rakhat","Eric","Rakhat"},{"Ajar", "Almaz","Ayana"},{"Jakan","Baizak","Mansur"}};

    for(String[] myArr:D2Array){
        for(String each:myArr){
            if(each.startsWith("A") || each.startsWith("M")){
                System.out.println(each);
            }
        }
       // System.out.println(Arrays.toString(myArr));
    }
        System.out.println("=============================");
        System.out.println(Arrays.deepToString(D2Array));
    }
}
