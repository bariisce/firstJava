package kodlamaiodemoo;

public class StudentManager extends UserManager 
{

	public void add(Student student)
	{
		System.out.println(student.getPhoneNumber() + " ilgili telefon numarası eklendi");
	}
}
