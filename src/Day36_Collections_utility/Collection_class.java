package Day36_Collections_utility;

/*

        Methods for ArrayList is in Collections:

        Collections.sort(arrList);
        Collections.swap(arrList,index1, index2)
        Collections.frequency(arrList, element)
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_class {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(450);
        list.add(5);


        Collections.sort(list);

        for(int i=list.size()-1; i>=0; i--){
            newList.add(list.get(i));
            System.out.print(list.get(i)+" ");
        }

        System.out.println(list);
        System.out.println(newList);

        System.out.println("==========================");

        //===========Collections.frequency()==============

        int c = Collections.frequency(list,10);
        System.out.println(c);

        //==========Collections.swap==========



    }
}
