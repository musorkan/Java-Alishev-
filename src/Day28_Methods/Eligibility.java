package Day28_Methods;

public class Eligibility {
    /*
    age,citizen, name
     */
    //===============eligibility to Vote====================
    public static void vote(String name, int age, boolean citizen, String candidate) {
        boolean eligibleToVote = age >= 18 && citizen == true;
        if (eligibleToVote) {
            System.out.println(name + " is eligible to vote for " + candidate);
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }
    //===========eligibility to buy alcohol=============
    public static void eligibilityToBuyAlcohol(boolean hasID,int age){
        if(hasID && age>=21){
            System.out.println(" You are eligible to buy alcohol");
            return;
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Substruction:  "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication:  "+(num1*num2));
                break;
            case '/':
                System.out.println("Diviion:  "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder:  "+(num1%num2));
                break;
        }
    }

//==============Main method=================
    public static void main(String[] args) {
        eligibilityToBuyAlcohol(true,17);

    }

    }



