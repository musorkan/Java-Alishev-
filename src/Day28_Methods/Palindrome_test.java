package Day28_Methods;

public class Palindrome_test {
    public static void main(String[] args) {
        palindrome("Level");

    }



    //======Palindrom Method==========
    public static void palindrome(String str){
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i)+"";

        }
        System.out.println(reversed.equalsIgnoreCase(str));
    }
}
