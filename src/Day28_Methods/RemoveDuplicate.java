package Day28_Methods;

public class RemoveDuplicate {
    public static void main(String[] args) {
        v1_RemoveDups("ababcdcdab");

    }



    //==Version 1========Method To Remove Duplicates=============

public static void v1_RemoveDups(String str){
        String result="";
        for(int i=0; str.length()-1>=i; i++){
            if(!result.contains(str.charAt(i)+"")){
                result+=str.charAt(i)+"";
            }
        }
    System.out.println(result);
}

}





