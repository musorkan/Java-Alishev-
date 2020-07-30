package Day35;

import java.util.ArrayList;

public class Day35 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
