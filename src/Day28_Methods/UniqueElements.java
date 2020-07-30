package Day28_Methods;

public class UniqueElements {
    //==========Maint Method==========
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "E", "F"};
        uniques(arr);
    }

    //=========Uniques Method=============
    public static void uniques(String[] arr){
            for( String a: arr){ // gets each of the element

                int count = 0;
                for( String each: arr ){ // gets the frequency of the element
                    if( a.equals(each) ){
                        count++;
                    }
                }

                if(count == 1){ // unique
                    System.out.print(a+" ");
                }

            }
    }

}
