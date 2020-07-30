package Day25_Excersices;

public class Count_Odd_Even {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5,6,6,6,64,3,345,3};

        int countEven=0;
        int countOdd=0;

        String evens=" ";
        String odds=" ";

        for(int each:nums){
            if(each%2==0){
                countEven+=1;
                evens+=each+" ";
            }
            if(each%2!=0){
                odds+=each+" ";
                countOdd+=1;

            }
        }
        System.out.println("Even Numbers: "+countEven);
        System.out.println("Odd Numbers: "+countOdd);
        System.out.printf("Odds: "+odds);
        System.out.println(" ");
        System.out.println("Evens:  "+evens);
    }
}
