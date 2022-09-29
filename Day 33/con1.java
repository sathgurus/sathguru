class rectangle
{
 double l,b;
 rectangle(double l1,double b1)
 {
  	l=l1;
	b=b1;
 }
 void display()
 {
  System.out.println("Rectangle:"+(l*b));
 }
}
class con1
{
 public static void main(String args[])
 {
  rectangle s1=new rectangle(12.34,6.21);
  rectangle s2=new rectangle(23.32,45.45);
  s1.display();
  s2.display();
 }
}