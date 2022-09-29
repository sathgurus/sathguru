import java.util.*;
class Area
{
	public static void main(String args[])
	{
	Scanner ar = new Scanner(System.in);
	double pi=3.14;
	double r;
	double area;
	
	System.out.println("Enter radius:");
	r=ar.nextInt();
	area=pi*r*r;
	System.out.println("Area of circle is :"+area);
	
	}
}
	
		