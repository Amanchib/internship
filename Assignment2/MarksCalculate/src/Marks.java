
public class Marks {
	public static void main (String arg[]) {
		int a,b,c;
		a=78;
		b=45;
		c=62;
		System.out.println("Marks in Three Subjects each out of 100 are");
		System.out.println(a+"\n"+b+"\n"+c);
		System.out.println("Total Marks out of 300 are "+(a+b+c));
			System.out.println("Percentage is");
			double x= ((double)(a+b+c)/300.0)*100.0;
			System.out.println(String.format("%.2f",x));
		
	}
}
