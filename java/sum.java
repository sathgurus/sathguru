import java.util.*;
class sum
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int i,n,sum=0;
  System.out.println("Sum Of Number :");
  n=sc.nextInt();

  for(i=1;i<=n;i++)
  {
	sum=sum+i;
	System.out.println(sum);
  }
 }
}