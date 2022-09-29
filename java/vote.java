import java.util.*;
class vote
{
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		int sum;
		int avg;
		
		System.out.println("Enter your Tamil Mark:");
		a=Sc.nextInt();
		System.out.println("Enter your English Mark:");
		b=Sc.nextInt();
		System.out.println("Enter your Maths Mark:");
		c=Sc.nextInt();
		System.out.println("Enter your Science Mark:");
		d=Sc.nextInt();
		System.out.println("Enter your Social Science Mark:");
		e=Sc.nextInt();
		
		sum=a+b+c+d+e;
		System.out.println("Total  :",+sum);

		avg=sum/5;
		System.out.println("Average  :",+avg);
	}
}
