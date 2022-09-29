import java.util.*;
class mark
{
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		int sum;
		int avg;
		
		System.out.println("Enter your Tamil Mark:");
		a=sc.nextInt();
		System.out.println("Enter your English Mark:");
		b=sc.nextInt();
		System.out.println("Enter your Maths Mark:");
		c=sc.nextInt();
		System.out.println("Enter your Science Mark:");
		d=sc.nextInt();
		System.out.println("Enter your Social Science Mark:");
		e=sc.nextInt();
		
		
		
		sum=a+b+c+d+e;
		System.out.println("Total  :"+sum);

		avg=sum/5;
		System.out.println("Average  :"+avg);
		if(sum>=175)
		{
			System.out.println("Result:PASS");
		}
		else{
			System.out.println("Result:FAIL");
		}		

		if(avg>=90 && avg<=100)
		{
			System.out.println("Grade : A");
		}
		else if(avg>=80 && avg<=90)
		{
			System.out.println("Grade : b");
		}
		else if(avg>=70 && avg<=80)
		{
			System.out.println("Grade : c");
		}
		else if(avg>=60 && avg<=70)
		{
			System.out.println("Grade : d");
		}
		else
		{
			System.out.println("Grade : e");
		}
		
			
	}
}
