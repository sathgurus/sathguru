class student
{
 int id=1001;
 String name="Sathguru";
 int age=22;
 String qual="M.Sc Computer Science";
 void display()
 	{
		
		System.out.println("Student Details");
		System.out.println("---------------------------------------");
    		System.out.println("Student id :"+id);
		System.out.println("Student name :"+name);
		System.out.println("Student Age :"+age);
		System.out.println("Student Qualification :"+qual);
	}
		
}
class StudentDemo1
{
 public static void main(String args[])
 {
 	student obj=new student();
	obj.display();
 }
}