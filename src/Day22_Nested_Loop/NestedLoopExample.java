package Day22_Nested_Loop;

public class NestedLoopExample {
    public static void main(String[] args) {
        int j=0;
        while (j<=5) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println("*");
            j++;
        }
    }
}
