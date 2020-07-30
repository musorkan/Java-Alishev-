package Replits;

public class By_two_words {
    public static void main(String[] args) {


        String[] arr = {"Rakhat", "Belek", "Eric", "Amina", "Ajar", "Almaz"};

        for(int i=0; arr.length-1>=i; i++){
            if(i%2!=0){
                System.out.println(arr[i-1]+", "+arr[i]);
            }
        }
    }
}