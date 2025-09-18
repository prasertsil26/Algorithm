import java.util.Scanner;
public class Bmi {  
  public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);

        System.out.print("Enter you sex (F/M) : ") ;
        char sex = scanner.next().charAt(0) ;
        System.out.print("Enter you Weight : ") ;
            int weight = scanner.nextInt() ;
        System.out.print("Enter you Height : ") ;
            int height = scanner.nextInt() ;
        System.out.print("Enter you age : ") ;
            int age = scanner.nextInt() ;

        if (sex == 'M'){
            double bmrM = 66 + (13.7*weight) + (5*height) - ( 6.8*age) ;
            System.out.println("You BMI is : "+ bmrM );
        }
        else {
            if (sex == 'F'){
                double bmrF = 655 + ( 9.6*weight ) + (1.8*height) - ( 4.7*age );
                System.out.println("You BMI is : "+ bmrF );
            }
            else{
                System.out.println("Sex Error");
            }
        }
    }
}
