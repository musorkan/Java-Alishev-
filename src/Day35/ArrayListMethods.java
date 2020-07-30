package Day35;
/*
        set(index,newElement): replaces the old elenent at given index with new element
        remove(int primitive): removes the element at the given index
        remove(nonPrimitive) : will remove the element



 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        //========.set() =========
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.set(1, 9999);  // replaces the value in index 1 to 9999.

        System.out.println(list);
        System.out.println("===============================");

        // =======.set() String ArrayList========

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Belek");
        strList.add("Rakhat");
        strList.add("Almaz");
        strList.add("Ido");

        strList.set(0, "Belek Tutuev"); // Replaces the value in the given index
        System.out.println(strList);
        System.out.println("=============");

        //===========.remove() ArrList Method==========

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.remove(0); //will remove the index from that list
        Integer a =3;
        l1.remove(a); // will remove the Element since it is nonPrimitive

        System.out.println(l1);
        System.out.println("============================");


        //===============================================

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hamit");
        l2.add("Lilia");
        l2.add("Bulnet");
        l2.add("Viorel");
        l2.add("Musa");

        l2.remove(2); // removes the index 2
        l2.remove("Bulnet");  // removes the index with value "Bulnet"

        System.out.println(l2);

    }
}
