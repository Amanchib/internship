import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
	
 int n,temp,new_number =0,temp1,rev=0;
 temp=0;
 int c=0;
    n=obj.nextInt();
    while(n!=0){
        temp+= n%10;
        n=n/10;
           }
   
   
    System.out.println(temp);
    }
  
}

