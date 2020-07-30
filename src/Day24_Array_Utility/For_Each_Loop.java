package Day24_Array_Utility;
/*
             Data Structures:
                1.Array
                2.Collection
                3.Map

              ==>   You can use ForEach loop only with Data Structures.
              ==>   for(DataType each:Collection jof Data){}


         */
public class For_Each_Loop {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,-1,-2,-3};

        for(int each:arr){
            System.out.print(each+" ");
        }

        //=========Group Names============
        String[] groupMates = {"Almaz", "Rakhat", "Eric", "Sultan"};

        for(String each1:groupMates){
            System.out.println(each1);
        }




    }
}
