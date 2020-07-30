package EulerProject;
/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of
 two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product
of two 3-digit numbers.

0.Start decrement from 999 since it is the largest 3dim num.
1. length of input /2 ;
2.if (till the middle) == (from the middle)

 */
public class Problem4 {
    public static void main(String[] args) {
        String reversed="";
        int max = -9999999;



        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                String mult = i*j+"";

                for(int ind= mult.length()-1;ind>=0; ind--){
                    reversed+=mult.charAt(ind);

                }
                if(mult.equalsIgnoreCase(reversed)){
                    int num = Integer.parseInt(reversed);
                    if(num>max){
                        max=num;
                    }
                    System.out.println(mult+ " is palindrome"+" of "+ i+ " and "+j);
                }else {
                    reversed="";
                }

            }

        }
        System.out.println(max);


    }
}
