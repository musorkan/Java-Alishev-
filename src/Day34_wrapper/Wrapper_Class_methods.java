package Day34_wrapper;

public class Wrapper_Class_methods {
    public static void main(String[] args) {
        //======convert text to int================

        String str = "123";
        int a = Integer.parseInt(str);  // converting String text to primitive
        System.out.println(a);
        System.out.println("=============");


        //========convert text to Double==========

        String str1 = "7.4";
        Double d1 = Double.parseDouble(str1); // unboxing
        System.out.println(d1);
        System.out.println("=============");

        //=======convert text to boolean=======

        String str2 = "TRUE";
        boolean b1 = Boolean.parseBoolean(str2);  // Does not have case sensitivity
        System.out.println(b1);
        System.out.println("===============");

        //=========convert text to wrapper class===========
        String s2="1000.5";
        Double d3 = Double.valueOf(s2);  //unboxing
        System.out.println(d3);
        System.out.println("================");

        //====convert text to boolean wrapper and make it primitive======
        String s3 = "FaLSe";
        boolean r2 =Boolean.valueOf(s3);  // unboxing
        System.out.println(r2);
        System.out.println("==============");




    }
}
