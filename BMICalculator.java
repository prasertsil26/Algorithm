import java.util.Scanner;

public class BMICalculator{
    public static void main(String [] args){
     Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your weight");
        double weight = Scanner.nextDouble();
        System.out.println("Enter your height");
        double height = Scanner.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("BMI="+BMI);
    }
}
 
