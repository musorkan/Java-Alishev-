package Day34_wrapper;

import java.util.Arrays;

public class Wrapper {
    /*
    Data Structures:
            1. Array ====> supports primitives and non-primitives
            2. Collection ==> does not support primitives
            3. Map ==>  does not support primitives

We need to learn wrapper classes because collection, map do not support primitive data type.

    Wrappers class: Byte, Short, Integer, Long, Character, Boolean,   Double,   Float.
                    byte  short   int      long   char      boolean    double   float

    Default values:
    primitive:
            byte, short, int, long ==> 0;
            double, float ==> 0;
            boolean ===> false;

            wrapper class : null

    Autoboxing ===> converting primitive values to wrapper class
    Unboxing   ===> converting wrapper class to primitive


Integer, Double,  Character, Boolean
    "123" ===> 123

    methods:
            parse methods: converts string of text to primitive, not case sensitive

            valueOf methods: converts string of text to wrapper class, not case sensitive


     */


    public static void main(String[] args) {
        Integer num = 100;
        int a = 100;

        double[] arr = new double[3];

        System.out.println(Arrays.toString(arr));

        Double r1 = 200.0; // Wrapper class in  only dedicated to its primitive;
        double r2 = r1; // unboxing

        long l1 = 200;
        Long l2 = l1;  //autoboxing

        Float f1 = 100.5f;

    }

}
