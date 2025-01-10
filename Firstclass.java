
 import java.util.Scanner;
 class Firstclass{
     public static void main(String[] args){
         int myNumber=(int)(Math.random()*100);
         int userNumber=0;
          Scanner sc = new Scanner(System.in);
         do{
             System.out.println("guess my number");
             userNumber=sc.nextInt();
            if (userNumber==myNumber) {
            System.out.println("woww..correct number");
            break;
            }
            else if (userNumber>myNumber) {
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
         }
         while(userNumber>=0);
         System.out.println("my number was:");
     System.out.println("myNumber");
     }
 }
 