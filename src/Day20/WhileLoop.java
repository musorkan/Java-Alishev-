package Day20;

public class WhileLoop {
    public static void main(String[] args) {
        for(int i=0; i<=10;i++){
            System.out.print(i+"");
        }

        System.out.println();
        int num=1;
        while (num<=10){
            System.out.print(num);
            num++;
        }
        System.out.println();

        String reversed="";
        String name="Belek";
        int times=name.length()-1;
        while (times>=0){
            reversed+=name.charAt(times)+"";
            times--;

        }
        System.out.println(reversed);
    }
}
