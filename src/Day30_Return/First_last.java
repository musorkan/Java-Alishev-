package Day30_Return;

import java.util.Arrays;

public class First_last {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       int[] nn= addElementToArr(arr,7);
        System.out.println(Arrays.toString(nn));


    }

    //========Add element to an array ============
    public static int[] addElementToArr(int[] existingArr, int newElem){
        int[] newArr = new int[existingArr.length+1];

        for(int i=0;existingArr.length>i;i++){
            newArr[i] = existingArr[i];

        }
        newArr[newArr.length-1]=newElem;

        return newArr;
    }
}
