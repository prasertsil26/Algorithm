import java.util.Scanner;
public class Age {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);
         System.out.print("Enter your age ");
         int age = scanner.nextInt();
         if (age > 10) {
           System.out.println("Take 2 teaspoons");
         }
         else if (age > 3) { 
           System.out.println("Take 1 teaspoons");
         }
         else if (age > 1) { 
           System.out.println("Take 1/2 teaspoons");
         }
         else if (age >= 0) {
          System.out.println("Do not take medicine");
         }
         else {
          System.out.println("Wrong age");
         }
          
    }
}
  
