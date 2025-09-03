import java.util.Scanner;
public class Product2 {  
  public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter you Product #1 Name : ");
        String productName1 = scanner.nextLine();
    System.out.print("Enter you Product #1 Price : ");
        double productPrice1 = scanner.nextDouble();
    System.out.print("Enter you Quantity of Product #1 : ");
        int productQuantity1 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter you Product #2 Name : ");
        String productName2 = scanner.nextLine();
    System.out.print("Enter you Product #2 Price : ");
        double productPrice2 = scanner.nextDouble();
    System.out.print("Enter you Quantity of Product #2 : ");
        int productQuantity2 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter you Product #3 Name : ");
        String productName3 = scanner.nextLine();
    System.out.print("Enter you Product #3 Price : ");
        double productPrice3 = scanner.nextDouble();
    System.out.print("Enter you Quantity of Product #3 : ");
        int productQuantity3 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter you Money : ");
        double money = scanner.nextDouble();
    
    double priceAll1 = productPrice1 * productQuantity1 ;
    double priceAll2 = productPrice2 * productQuantity2 ;
    double priceAll3 = productPrice3 * productQuantity3 ;
    double sum = priceAll1 + priceAll2 + priceAll3 ;
    double vat = sum*0.07 ;
    double net = sum + vat ;
    double change = money - net ;
    System.out.println("----- Recipe -----");
    System.out.println(productName1 + " : " + productPrice1 + " x " + productQuantity1 + " = " + priceAll1 + " Baht" );
    System.out.println(productName2 + " : " + productPrice2 + " x " + productQuantity2 + " = " + priceAll2 + " Baht" );
    System.out.println(productName3 + " : " + productPrice3 + " x " + productQuantity3 + " = " + priceAll3 + " Baht" );
    System.out.println("Subtotal : "+ sum + " Baht");
    System.out.println("VAT 7% : "+ vat + " Baht");
    System.out.println("Net Price : "+ net + " Baht");
    System.out.println("Total Paid : "+ money + " Baht");
    System.out.println("Change : "+ change + " Baht");
}
}