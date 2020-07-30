package Day28_Methods;

public class ReverseString {
    public static void main(String[] args) {

        reverse("How are you doing bro");
        reverse("Cybertek");

    }

    public static void reverse(String str){
        String result ="";
        for(int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i)+"";

        }
        System.out.println(result);

    }

}
