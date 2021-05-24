package kodlamaiodemoo;

public class Main 
{
	public static void main(String[] args) 
	{
		User user = new User();
		user.setName("Bar��");
		
		Instructor �nstructor = new Instructor();
		�nstructor.setCourse("JAVA & REACT");
		
		Student student = new Student();
		student.setPhoneNumber("0123456789");
		
		UserManager userManager = new UserManager();
		userManager.add(user);

		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.add(�nstructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
	}

}
