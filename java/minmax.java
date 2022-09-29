import java.util.*;
class minmax
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int i;
  int min,max;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Array:");
  for(i=0;i<10;i++)
  {
   a[i]=sc.nextInt();
  }
  max=a[0];
  min=a[0];
  for(i=1;i<10;i++)
  {
	if(max<a[i])
	{
		max=a[i];
	}
	if(min>a[i])
	{
		min=a[i];
	}
  }
  	System.out.println("max :"+max);
	System.out.println("min :"+min);
 }
}
  