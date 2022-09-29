import java.util.*;
class switch1
{
 public static void main(String args[])
 {
  int a,b,c,ch;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your choice:");
  ch=sc.nextInt();
  System.out.println("Enter your 2 Number:");
  a=sc.nextInt();
  b=sc.nextInt();
  switch(ch)
  {
	case 1:

		c=a+b;
		System.out.println("Addition" :+c);
		break;
	case 2:
   		c=a-b;
		System.out.println("Substraction :"+c);
		break;
	case 3:

		c=a*b;
		System.out.println("Multiplication :"+c);
		break;
	case 4:
   		c=a/b;
		System.out.println("Division :"+c);
		break;
	case 5:
   		c=a%b;
		System.out.println("modulus :"+c);
		break;
	default:
 		System.out.println("invalid no");
  }
 }
}