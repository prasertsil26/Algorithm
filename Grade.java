import java.util.Scanner;
public class Grade {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);
         System.out.print("Enter your name ");
         String name = scanner.nextLine();
         System.out.print("Enter score ");
         int score = scanner.nextInt();
         System.out.println("name : "+ name);
          System.out.println("score : "+ score);
         if (score > 100) {
           System.out.println("Error score");
         }
         else if (score > 79) { 
           System.out.println("grade : A");
         }
         else if (score > 69) { 
           System.out.println("grade : B");
         }
         else if (score > 59) {
          System.out.println("grade : C");
         }
         else if (score > 49){
          System.out.println("grade : D");
         }
         else{
          System.out.println("grade : E");
         }

          
    }
}
  
