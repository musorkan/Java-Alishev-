package Day21_While_and_DoWhile;

public class DivideWithoutDivision {
    public static void main(String[] args) {
        int a =14;
        int b=3;
        int count=0;

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with remainder of "+a);
    }
}
