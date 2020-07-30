package Day35_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Rm_dups {
    public static void main(String[] args) {


    ArrayList <Character> list = new ArrayList<>();
    list.addAll(Arrays.asList('A','B','B','C','C','D'));
        System.out.println(list);

        ArrayList<Character> nonDups = new ArrayList<>();

        for(Character each: list){
            if(!nonDups.contains(each)){
                nonDups.add(each);
            }
        }


        System.out.println(nonDups);
    }
}
