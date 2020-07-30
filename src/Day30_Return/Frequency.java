package Day30_Return;

public class Frequency {
    public static void main(String[] args) {

        String str = "aavbbcccddsss";
        System.out.println(dupRemove(str));
        String str1 = dupRemove(str);
        System.out.println(countElems(str,str1));
    }




    public static String dupRemove(String StrWithDups) {
        String reTurn="";
        for (int i = 0; StrWithDups.length() - 1 >= i; i++) {
            String elem = StrWithDups.charAt(i) + "";
            if (!reTurn.contains(elem)) {
                reTurn += elem;

            }
        }
        return reTurn;
    }


    public static String countElems(String withDups, String noDups) {
        String expected = "";
        for (int i = 0; noDups.length() - 1 >= i; i++) {
            String uni = noDups.charAt(i) + "";
            int count = 0;
            for (int j = 0; withDups.length() - 1 >= j; j++) {
                if (uni.equals(withDups.charAt(j) + "")) {
                    count++;
                }

            }
             expected += uni + "" + count;
        }
        return expected;
    }


}