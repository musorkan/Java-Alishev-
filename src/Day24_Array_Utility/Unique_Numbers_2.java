package Day24_Array_Utility;
//Find Unique numbers using ForEach

public class Unique_Numbers_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,7,8};

        for(int each1:arr){
            int s = each1;
            int count=0;

            for(int each:arr){
                if(s==each){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s+" : is the Unique number");
            }
        }

    }
}
