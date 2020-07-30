package EulerProject;

public class Problem5 {
    /*
    Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void main(String[] args) {
//        int result=0;
//        for(int i=10; i<9999;i++){
//            for(int j=2; j<10;j++){
//                if(i%j==0){
//                    result=i;
//                }else {
//                    result = 0;
//                }
//            }
//        }
//        System.out.print(result);
        //===========================Solution=================
        int start=1, stop=10;

        for (int i=1; i>=0; i++) {
            for (int j=start; j<=stop; j++) {
                if (i%j != 0 ) {
                    break;
                }
                if (i%j == 0 && j == stop) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }
}
