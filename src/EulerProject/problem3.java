package EulerProject;

public class problem3 {

        /*
        The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
         */

    public static void main(String[] args) {
        long num = 600851475143l;

        for(long i=2; i<num; i++){
            if(num%i==0) {
                System.out.println(i);
                num=num/i;
            }
        }
        System.out.print(num);
    }

}