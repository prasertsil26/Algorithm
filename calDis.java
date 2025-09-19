import java.util.Scanner ;

public class calDis {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;
        System.out.print("Enter the price of the product (per unit) : ") ;
            int price = scanner.nextInt() ;
        System.out.print("Enter the quantity of the product : ") ;
            int quantity = scanner.nextInt() ;
            double sum = price*quantity ;
                if (quantity > 10){
                    System.out.println("You get a 10% discount ! ");
                    double discount = (price*quantity) * 0.1 ;
                    sum = sum - discount ;
                    System.out.println("Total price : "+sum+" Baht");
                }
                else{
                    System.out.println("Total price : "+sum+" Baht");
                }
    }
}
