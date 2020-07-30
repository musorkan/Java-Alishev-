package Day35_ArrayList_Methods;

/*
            indexOf() ---find index of specific element
            lastIndexOf() ---
            contains()---
            equals()----
            isEmpty()----

 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arr_List_method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int a = list.indexOf(40);
        boolean b = list.contains(20);

        list.equals(10);

        System.out.println(a);
        System.out.println(b);

        //==========.equals()============


        ArrayList<String> s = new ArrayList<>();
        ArrayList<String> s1 = new ArrayList<>();

        s.add("Cybertek");
        s1.add("Cybertek");

        boolean b1 = s.equals(s1);
        System.out.println(b1);
        System.out.println("===============");

        //============.isEmpty()==========

        System.out.println(s1.isEmpty());

    }



}
