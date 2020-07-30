package Day26_Multi_Dimentional_Array;

public class Example1 {
    public static void main(String[] args) {
        String[] names = {"Belek","Rakhat","eric","Amina"};

        for(int i=0; names.length-1>=i;i++){
            if(names[i].startsWith('A'+"")){
                System.out.println(names[i]+" starts with :A ");
            }
        }
    }
}
