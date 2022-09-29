import java.util.*;

class Greatest
{
	public static void main(String[] args)

	{
	   int a,b,c;
           
           
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the first value");
	a=sc.nextInt();

	System.out.println("Enter the second value");
        b=sc.nextInt();
        
        System.out.println("Enter the third value");
        c=sc.nextInt();

	if(a >b && a>c)
	{
	System.out.println("A is Greatest");
	}
	else if(b>c && b>a)

	{ 
		System.out.println("B is Greatest");
	}
	else if(c>a&&c>b)
	{
		System.out.println("C is Greatest");
	}
	else{
		System.out.println("");
	}
   }

}

