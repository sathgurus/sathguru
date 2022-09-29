import java.util.*;
class fact1
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int i,n,fact=1;
  System.out.println("Factorial Number:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
	fact=fact*i;
	System.out.println(fact);
  }
 }
}
