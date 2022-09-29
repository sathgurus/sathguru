interface customer
{
 int id=8959;
 String name="Sathguru";
 void custdetails();
}
interface SI
{
 double p=50000.56;
 int n=3;
 double r=0.075;
 void interest();
}
class bank implements customer,SI
{
 public void custdeatils()
 {
  System.out.println("Custome id :"+id);
  System.out.println("Customer name :"+name);
 }
 public void interest()
 {
  double calc=(p*n*r)/100;
  System.out.println("principle Amount :"+p);
  System.out.println("Years :"+n);
  System.out.println("interest :"+r);
  System.out.println("Total :"+calc);
 }
}
class mulinherit
{
 public static void main(String args[])
 {
  bank s=new bank();
  s.custdetails();
  s.interest();
 }
}
