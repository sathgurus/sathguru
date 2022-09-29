
import java.util.*;
class Average1{

public static void main(String arg[]){

Scanner sc=new Scanner(System.in);

int a,b,c,d,e;
System.out.println("Enter the 5 Number:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
int sum;
int avg;

sum=a+b+c+d+e;

avg=sum/5;


System.out.println("Sum :"+sum);
System.out.println("Average :"+avg);
}


}
