package Day27_Exercises;
/*
     ==================Adding 2 Arrays into new Array =======================
 */
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Adding_arrays {
    public static void main(String[] args) {


        String arr[] = {"Belek", "Rakhat", "Sultan"};
        String arr2[] = {"Eric", "Amina", "Almaz"};

        int size = arr.length + arr2.length;

        String[] newArr = new String[size];

        int index=0;
        for (int i = 0; arr.length-1>=i; i++) {
                newArr[index] = arr[i];
                index++;
        }
        for(int j=0;arr2.length-1>=j;j++){
            newArr[index] = arr2[j];
            index++;
        }
        System.out.println(newArr);
        System.out.println(Arrays.toString(newArr));

    }
}

