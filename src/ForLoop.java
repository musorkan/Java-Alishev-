import javax.swing.*;

public class ForLoop {
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++) {
            System.out.print(ch);
        }
        System.out.println("");
        for(char ch1='Z';ch1>='A'; ch1--){
            System.out.print(ch1);
        }
        System.out.println("");
        for (int sifra=5; sifra<=53; sifra+=2){
            System.out.print(sifra+", ");
        }
        System.out.println("");
        for(int a=100; a>=1; a/=2){
            System.out.print(a);

        }
    }
}
