import java.util.Scanner;
public class Product {  
    public static void main( String[]arg ){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter Product name =");
        String name1 = scanner.nextLine();
      System.out.print("Enter Product price =");
        double price1 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("Enter Product name =");
        String name2 = scanner.nextLine();
      System.out.print("Enter Product price =");
        double price2 = scanner.nextDouble();
      System.out.print("Enter Product name =");
      scanner.nextLine(); 

        String name3 = scanner.nextLine();
      System.out.print("Enter Product price =");
        double price3 = scanner.nextDouble();
      System.out.print("Enter Money");
        double Money = scanner.nextDouble();
        scanner.nextLine();

      double Sum = price1 + price2 + price3;
      double VAT = Sum * 0.07;
      double Net = Sum + VAT;
      double Change = Money - Net;
      System.out.println("Sum = " + Sum);
      System.out.println("VAT = " + VAT);
      System.out.println("Net = " + Net);
      System.out.println("Change =" + Change);



      

     


    }
}
