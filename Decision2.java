import java.util.Scanner;
public class Decision2 {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);
         int number = scanner.nextInt();
           if (number > 0) {
        System.out.println("จำนวนเต็มบวก");
        
         }
         else { //ไม่ต้องใช้ () แต่ต้องใช้ {}
          System.out.println("ไม่ใช่จำนวนเต็มบวก");
         }
        System.out.println("จบโปรแกรม");
    }
}
  
