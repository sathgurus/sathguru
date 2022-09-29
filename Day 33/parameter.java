class passing
{
 int id;
 String name;
 int m1,m2,m3,m4,m5;
 float avg;
 void getData(int id1,String name1)
 {
	id=id1;
	name=name1;
 }
 int mark(int a1,int a2,int a3,int a4,int a5)
 {
	m1=a1;
	m2=a2;
	m3=a3;
	m4=a4;
	m5=a5;
	return m1+m2+m3+m4+m5;
 }
 void display()
 {
        avg=m1+m2m3+m4+m5/5;
	System.out.println("Student id :"+id);
	System.out.println("Student name :"+name);
 }
}
class parameter
{
 public static void main(String args[])
 {
  passing obj=new passing();
  obj.getData(1001,"Sathguru");
  obj.display();
  int total=obj.mark(78,93,97,65,78);
  
  System.out.println("Total :"+total);
  System.out.println("Average :"+avg);
 }
}