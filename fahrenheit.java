import java.util.Scanner;
public class fahrenheit {  
    public static void main( String[]arg ){
      Scanner scanner = new Scanner(System.in);

      System.out.println("lnput your fahrenheit ");
      double fahrenheit = scanner.nextDouble();
      double celsius = (5.0/9.0)*(fahrenheit-32.0)  ; 
      System.out.println("celsius = " + celsius );

    }
}
