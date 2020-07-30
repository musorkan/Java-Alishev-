package Day24_Array_Utility;

//find the words in array which occure only one time (Find Unique Word)

public class Unique_Word {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python","Python", "C++"};

        for(int j=0;words.length-1>=j;j++){
            String s = words[j];
            int count = 0;
            for (int each = 0; words.length - 1 >= each; each++) {
                String str = words[each];
                if (str.equals(s)) {
                    count++;
                }
            }
            if (count <=1) {
                System.out.println("===============================");
                System.out.println(words[j]+ " : is a Unique Word");

            }else {
                System.out.println("================================");
                System.out.println(words[j]+" : is not a Unique Word");
            }
        }


    }
}