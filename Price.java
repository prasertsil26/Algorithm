import java.util.Scanner;
public class Price {  
  public static void main (String[] args){
     Scanner Scanner = new Scanner(System.in) ;  
     System.out.print ("Enter amount to pay : ");
    int price = Scanner.nextInt();
     int money = 1000;
       int Change = money - price ;
       System.out.println ("Change is :" + Change + "bhat");
       int Fivehundred = Change / 500 ;
       System.out.println ("Five-hundred :" + Fivehundred + " note  (s)" );
        Change = Change % 500 ;
       int Hundred = Change / 100 ;
       System.out.println ("Hundred note :" + Hundred + " note  (s)" );
        Change = Change % 100 ; 
       int Fifty = Change / 50 ;
       System.out.println ("Fifty note :" + Fifty + " note  (s)" );
        Change = Change % 50 ; 
       int Twenty = Change / 20 ;
       System.out.println ("Twenty note :" + Twenty + " note  (s)" );
        Change = Change % 20 ;
       int TenCoin = Change / 10 ;
       System.out.println ("Ten coin:" + TenCoin + " coin  (s)" );
        Change = Change % 10 ; 
       int FiveCoin = Change / 5 ;
       System.out.println ("Five coin:" + FiveCoin + " coin  (s)" );
        Change = Change % 5 ;
       int TwoCoin = Change / 2 ;
       System.out.println ("Two coin:" + TwoCoin + " coin  (s)" );
        Change = Change % 2 ;
    System.out.println ("One coin:" + Change + " coin  (s)" );


    }
  }