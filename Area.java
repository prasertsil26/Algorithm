import java.util.Scanner;

public class Area{
    public static void main(String [] args){
     Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your width");
        double width = Scanner.nextDouble();
        System.out.println("Enter your long");
        double Long = Scanner.nextDouble();
        double area = (width * Long) / 360;
        System.out.println("sum="+area);
    }
}
 
