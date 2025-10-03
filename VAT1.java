import java.util.Scanner ;
 public class VAT1 {
    public static void main (string [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println ("-----manu-----");
        System.out.println ("-----Consumer-gooods-----");
        System.out.println ("-----Luxury-goods-----");
        System.out.println ("-----Tax-exempt-----");
        System.out.println ("--------------");
        
    System.out.println(" your selected Consumer goods ");
    int numder = sc.nextInt();
        System.out.println(" Euter unit price ");
    int numder = sc.nextInt();
        System.out.println(" Enter quatity ");
    int numder = sc.nextInt();
    System.out.println("");

    if (number >=1 && number <=3){
        if (number ==1 ){
            System.out.println("-----Consumergoods----");
            double totalpay = Consumergoods + (VAT 7%);
            System.out.println("total product price:"+sum+"VAT");
            System.out.println("--------------------------");
        }
        else if ( number ==2 ){
            System.out.println("----Luxury-goods-----");
            double totalpay = Luxury-goods + (VAT 10%);
            System.out.println("total product price:"+sum+" VAT");
            System.out.println("--------------------------");
        }
         else if ( number ==3 ){
            System.out.println("----Tax-exempt-----");
            double totalpay = Tax-exempt + (VAT 0%);
            System.out.println("total product price:"+sum+"VAT");
            System.out.println("--------------------------");
        }    
    }else{
        System.out.println("Invalid menu choice");
    }

    }
 }