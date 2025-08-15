import java.util.Scanner;

public class Discount {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter price of one dress : ");
        double price = scanner.nextDouble();
    System.out.print("Enter number of dresses to buy : ");
        double amount = scanner.nextDouble();
    System.out.print("Enter discount rate : ");
        double discount = scanner.nextDouble();
    double sum = price*amount ;
    double discountAmount = amount*discount ;
    double netPay = sum - discountAmount ;
    System.out.println("Total cost = " +sum+ " Bhat");
    System.out.println("discountAmount = " +discountAmount+ " Bhat");
    System.out.println("Net Pay = " +netPay+ " Bhat");
    }
}
