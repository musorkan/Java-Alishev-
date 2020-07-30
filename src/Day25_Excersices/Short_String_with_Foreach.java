package Day25_Excersices;

public class Short_String_with_Foreach {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        int minLength = arr[0].length();

        for(String each:arr){
            if(each.length()<minLength){
                minLength=each.length();
            }
        }

        for(String element:arr ){
            if(element.length()==minLength){
                System.out.println(element);
            }
        }
    }
}
