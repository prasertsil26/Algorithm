  import java.util.Scanner;

public class numSwap {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter number 1 : ") ;
            int num1 = scanner.nextInt() ;
        System.out.print("Enter number 2 : ") ;
            int num2 = scanner.nextInt() ;
        System.out.println("Current -> number 1 = "+ num1 +" and number 2 = "+ num2) ;
        System.out.println("Swapping ..............") ;
        System.out.println("Now -> number 1 = "+ num2 +" and number 2 = "+ num1) ;
    }
}
