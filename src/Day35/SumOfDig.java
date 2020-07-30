package Day35;

// isDigit(char): verifies if the char is digit , returns boolean
public class SumOfDig {
    public static void main(String[] args) {
        String str="a1b2c3";
        int sum =0;
        for(char each:str.toCharArray()){
            if(Character.isAlphabetic(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
