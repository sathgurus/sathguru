class bus
{
 public int ticket=50;
 private void free()
 {
  System.out.println("only for Women");
 }
 private String Backseat()
 {
  return "Eligible for men";
 }
 public static void main(String args[])
 {
 bus owner=new bus();
 owner.free();
 String st=owner.Backseat();
 System.out.println(st);
 }
}
 
 
  