class cons
{
 int empno;
 cons()
 {
  empno=1001;
 }
}
class b extends cons
{
 double bp,sal;
 double pf=0.13,allowance=0.20;
 b(double b1)
 {
  super();
  bp=b1;
  System.out.println("Employee:"+empno);
 }
 void salary()
 {
 	sal=(bp+(bp*0.20))-(bp*0.13);
	System.out.println("Employee Basic Pay:"+bp);
  	System.out.println("Employee Salary:"+sal);
 }
}
class inher
{
 public static void main(String args[])
 {
  b ob=new b(2500.56);
  ob.salary();
 }
}