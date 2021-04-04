
public class Swap {
	int a;
	int b;
Swap()
{
	a=0;
	b=0;
}
Swap (int x,int y)
{
	a=x;
	b=y;
}

public int reta()
{
	return a;
}
public int retb()
{
	return b;
}
public void swap1()
{
	int x;
	x=a;
	a=b;
	b=x;
	
}
public void swap2()
{
	a=a+b;
	b=a-b;
	a=a-b;
}
	public static void main (String arg[]) {
	

		Swap obj=new Swap(2,3);
		Swap obj1=new Swap(2,3);
		System.out.println("Swap using 3rd variable");
		obj.swap1();
		obj1.swap2();
		System.out.println("a = "+obj.reta() +" b = "+obj.retb());
		System.out.println("Swap wihtout using 3rd variable");
		System.out.println("a = "+obj1.reta() +" b = "+obj1.retb());

}
}
