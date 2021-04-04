import java.util.Scanner;

public class Main {

  
  private static int FirstLastDigitSum(int number) {

     
     int slastDigit, firstDigit, divisor;;
     int totalDigits = 0;
     int sum = 0;

     
     slastDigit = number/10%10;

     
    

    
     
   
     while(number>10)
     {
         number=number/10;
     }
  sum = number+ slastDigit;
     return sum;
  }

  

  public static void main(String[] args) {

     
     int number = 0;
     int sum = 0;

          Scanner scan =  new Scanner(System.in);

     
     System.out.print("Enter an integer number:: ");
     number = scan.nextInt();

     
     sum = FirstLastDigitSum(number);

     
     System.out.println("The sum of first & Secong last"
            +" digit of the number "+number
            +" = "+ sum);

     
  }
}
