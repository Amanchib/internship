import java.util.Scanner;
public class AreaandPerimeter 
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
       
        System.out.print("Length of rectangle is 5\n");
        l = 5;
        System.out.print("Breadth of rectangle is 7\n");
        b = 7;
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }
}