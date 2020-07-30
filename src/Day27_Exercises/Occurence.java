package Day27_Exercises;

public class Occurence {
    public static void main(String[] args) {


        String str = "BElekBelekbelekbelekbel";
        int count = 0;

        for (int i = 0; str.length() - 5 >= i; i++) {

            if (str.substring(i, i + 5).equalsIgnoreCase("belek")) {
                ;
                count++;

            }
        }
        System.out.println(count);
    }
    }
