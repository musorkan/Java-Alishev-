package Day25_Excersices;

public class First_three_chars {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana","Strawberry","Java","Python"};

        //=====Solution with for i loop

        for(int i=0; words.length-1>=i;i++){
            System.out.println(words[i].substring(0,3));
        }



        //======Solution with each loop
        for(String each:words){
            System.out.println(each.substring(0,3));
        }
    }
}
