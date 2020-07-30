package Day24_Array_Utility;
//Find Unique numbers using the ForLoop

public class Unique_int_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,5,5,6,4,2,3};

        for(int j=0; arr.length-1>=j;j++){
            int count=0;
            int s=arr[j];

            for(int i=0;arr.length-1>=i;i++){
                int sifra = arr[i];
                if(s==sifra){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s+" : is the Unique Number");
            }
        }

    }

}
