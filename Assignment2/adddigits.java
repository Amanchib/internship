import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
	
 int n,temp,new_number =0,temp1,rev=0;;
 
    n=obj.nextInt();
    while(n!=0){
        temp= n%10;
        n=n/10;
        if(temp==8){
            temp=0;
        }
        else if(temp==9){
            temp=1;
        }
        else    
            temp=temp+2;
        
        new_number=new_number*10+temp; 
    }
   
    while(new_number!=0){
        temp1=new_number%10;
        new_number=new_number/10;
        rev = rev*10+temp1;
    }
    System.out.println(rev);;
    }
  
}