package Day34_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

/*

            Arrayslist is the part of the collection
            ArrayList does not support primitive DataType


            Methods:
            .add(value)
            .add(index, value)
            .get(index)
            .



 */

public class   List_intro {
    public static void main(String[] args) {

        //=====Creating ArrayList =========
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12); //autoBoxing , will be added to index 0
        list1.add(13); // will be added to index 1
        list1.add(14); // index 2
        list1.add(15); // index 3
        list1.add(16); //index 4
        list1.add(3,15); // can change the value of the index (index, value)
        System.out.println(list1);

        System.out.println(".get() Method "+list1.get(2));

        System.out.println(".size() Method :"+list1.size());


        //==========loop in ArrayList==========

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenNum = new ArrayList<>();

        for(int i=0; i<=100;i++){
            if(i%2==0){
                evenNum.add(i);
            }else {
                oddList.add(i);
            }
        }
        System.out.println(oddList);
        System.out.println(evenNum);
    }
}
