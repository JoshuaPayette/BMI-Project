import java.util.Scanner;

public class BMIProject {



    public static void main(String[] args){
        String name;
        int weightPounds,heightInches;
       double divHeight, total, weightDivheight;



        Scanner keyboard;



        keyboard = new Scanner(System.in);
        System.out.println("Hello there! What's your name?");
        name = keyboard.nextLine();
        System.out.println("Hello "+name+" my name is Josh and today im going to calculate your bmi.");
        System.out.println("What is your weight in pounds?");
        weightPounds = keyboard.nextInt();
        System.out.println("what is your height inches.");
        heightInches = keyboard.nextInt();
        weightDivheight = (double) weightPounds/heightInches;
        System.out.println( weightDivheight);
        divHeight = (weightDivheight/(double) heightInches);
        System.out.println(  divHeight);
        total = (divHeight*703);
      //  total = ((weightPounds/heightInches)/heightInches)*703;
        System.out.println("Your bmi is "+total);





    }
}
