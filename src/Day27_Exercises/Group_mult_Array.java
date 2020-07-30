package Day27_Exercises;

public class Group_mult_Array {
    public static void main(String[] args) {
        String[] group33 = {"Davut","Dilara","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","Zain","Ali","Etnick","Aigul","Mike","Veola"};
        String[] group22 = {"Aiperi","Aalia","Rumiya","Viorel", "Samir"};
        String[] group2 = { "Ali", "Anton", "Elif", "Filip", "Guljannat" };
        String [] group21 = {"Violeta","Alla", "Adam", "Lilia"};
        String [] group17 =  {"Elvira", "Zeliha", "Paban","Asylkan", "Dilyar", "Roza","Kamil", "Sedge"};

        String[][] Batch20= {group33,group22,group2,group21,group17};
        for(int i=0; Batch20.length-1>=0;i++){
            for(int j=0; Batch20[i].length-1>=j;j++){
               if(Batch20[i][j].toLowerCase().contains("m"))
                System.out.println(Batch20[i][j]);
            }
        }

    }
}
