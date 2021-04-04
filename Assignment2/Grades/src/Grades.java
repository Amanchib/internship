
public class Grades {

	public static void main(String args[])
	{
		System.out.println("The total number of students in a class are 90");
		System.out.println("45 Students are boys");
		int s,b,l;
		s=90;
		b=45;
		
		System.out.println("So the girls are Total-Boys "+s +"-"+b+" = "+(s-b)+" Girls");
		
		
		System.out.print(" 50% of the total students secured grade 'A' are ");
		l=90*50/100;
		System.out.println(l);
		System.out.println("Out of which 20 are boys which means total girls score A grade are 45 - 20 ="+(45-20));
		
	}
}
