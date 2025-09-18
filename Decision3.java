import java.util.Scanner;
public class Decision3 {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);
         int number = scanner.nextInt();
           if (number %2 == 0) {
        System.out.println("The number is Even ");
        
         }
         else { //ไม่ต้องใช้ () แต่ต้องใช้ {}
          System.out.println("The number is Odd");
         }
        System.out.println("จบโปรแกรม");
    }
}
  
