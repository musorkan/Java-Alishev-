package Day33_Formatting_TimeStamp;

public class Uniques {


    public static void main(String[] args) {
        int[] arr= {3,3,2,1,1};

        for(int each: arr) {
            int count = 0;
            for (int each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each + " " + count);
            }
        }
    }
}
