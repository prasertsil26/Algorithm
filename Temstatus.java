import java.util.Scanner;
	
	public class Temstatus {
	    public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter You Temperature in Celsius : ");
	        int celsius = scanner.nextInt();
	        System.out.println("Temperature : "+ celsius);
	        if (celsius > 35){
	            System.out.println("Status : Hot");
	        }
	        else if (celsius >= 20){
	            System.out.println("Status : Normal");
	        }
            else{
	            System.out.println("Status : Cold");
	        }
	    }
	}

