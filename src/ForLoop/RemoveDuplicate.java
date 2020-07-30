package ForLoop;

import java.rmi.UnexpectedException;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
       // String str="aabbjlsdjflkjslkfjhhhhdjdhljdsflsjdf"; //bb
        String result="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your for Duplicate Check: ");
        String str = input.nextLine();
        for(int i=0;str.length()-1>=i;i++){
            String s = ""+str.charAt(i);
            if(!result.contains(s)){
                result+=s;
            }
        }
        System.out.println(result);
    }
}
