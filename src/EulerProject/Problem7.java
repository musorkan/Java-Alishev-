package EulerProject;

import java.util.StringTokenizer;

public class Problem7 {
    /*

        Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
         */

    //1,2,3,4,5,6,7,8,9,10
    //1,2,3,4,5,6,7,8,9,10

    public static void main(String[] args) {

        int num = 29;

        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
