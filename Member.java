import java.util.Scanner;

public class Member {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter You Membership Level (Silver , Gold , Platinum ,Other) : ");
        String member = scanner.nextLine();
        System.out.print("Enter Total purchase amount : ");
        double price = scanner.nextDouble();
        System.out.println("----- Receipt -----");
        System.out.println("Member Level : "+ member);
        System.out.println("Total purchase : "+ price);

        if ( member.equals("Platinum") ) { // Stirng
            double sum = price * 0.15 ;
            price = price - sum ;
            System.out.println("Discount : "+ sum);
            System.out.println("Final Price : "+ price);
        }
        else if ( member.equals("Gold") ) {
            double sum = price * 0.1 ;
            price = price - sum ;
            System.out.println("Discount : "+ sum);
            System.out.println("Final Price : "+ price);
        }
        else if ( member.equals("Silver") ) {
            double sum = price * 0.05 ;
            price = price - sum ;
            System.out.println("Discount : "+ sum);
            System.out.println("Final Price : "+ price);
        }
        else {
        double sum = price * 0 ; 
        System.out.println("Discount : "+ sum);
        System.out.println("Final Price : "+ price);
        }
    }
}


