package Library;

public class Custom_Methods {

    public static void maxMin(int[] arr){
        int max=arr[0];
        int min=arr[0];

        for(int each: arr){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println(min+" is min");
        System.out.println(max+" is max");

    }


}
