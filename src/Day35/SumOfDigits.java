package Day35;


public class SumOfDigits {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum =0;

        for(int i=0; i<=str.length()-1;i++){
            char each = str.charAt(i);
            if(each>=48 && each<=57){   //if the char is between 48-57, then it is digit
               sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
