package Day28_Methods;

public class MaxMin {
    public static void main(String[] args) {
        int[] myarr = {112,2,3453,4345,5,6,735,8,9};
        maxMin(myarr);

    }



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
