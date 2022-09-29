interface model
{
 String name="BMW";
 void year();
 }
 class car implements model
 {
 public void year()
 {
 System.out.println("Car name :"+name);
 System.out.println("Model year 2005");
 }
}
class Demointerface
{
 public static void main(String args[])
 {
  car obj=new car();
  obj.year();
 }
}
  