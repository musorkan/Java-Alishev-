package Day35;

import javax.swing.*;
import java.util.ArrayList;

public class Combine2ArrayList {
    public static void main(String[] args) {
        String[]  group1={"Aalia","Mohammed","Aslan","Ernis"};
        String[]  group2= {"Zaring", "Mee", "Irina", "Virginia", "Ali", "Dawud"};

        ArrayList<String> student = new ArrayList<>();
        ArrayList<String> forLoopMethod = new ArrayList<>();


        //============Solution with ForEach Loop========

        int index=0;
        for (String each: group1){
            student.add(each);
            index++;
        }
        for (String each: group2){
            student.add(each);
            index++;
        }
        System.out.println(student);

        System.out.println("==================================================");



        //=======Solution with forloop=======

         for (int i=0; group1.length-1>=i;i++){
             forLoopMethod.add(group1[i]);
         }

         for (int j=0; group2.length-1>=j;j++){
             forLoopMethod.add(group2[j]);
         }
        System.out.println(forLoopMethod);


    }
}
