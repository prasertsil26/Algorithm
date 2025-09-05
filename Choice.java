import java.util.Scanner;
public class Choice {
    public static void main (String[] args){
       Scanner scanner = new Scanner (System.in);
         int number = scanner.nextInt();
         System.out.println("Enter a number");
          if (number ==1) {
            System.out.print("Enter you base of the triangle\n");
              int base = scanner.nextInt(); //scanner.nextInt() = เอาไว้เก็บข้อมูลแปลงเป็นตัวแปร//
            System.out.print("Enter you height of the triangle\n");
              int height = scanner.nextInt();
              double Triangle = 0.5*(base*height);
            System.out.println("Base = " + base);
            System.out.println("Height = " + height);
            System.out.println("Area of Triangle = " +Triangle+ " unit");
         }
          else {
          if (number ==2) {//ไม่ต้องใช้ () แต่ต้องใช้ {}
           System.out.println("Enter your weight");
             double weight = scanner.nextDouble();
           System.out.println("Enter your height");
              double height = scanner.nextDouble();
              double BMI = weight/(height*height);
           System.out.println("BMI="+BMI);
          }
          else {
            System.out.println("Error");
          }
        
    }
  }
}  
