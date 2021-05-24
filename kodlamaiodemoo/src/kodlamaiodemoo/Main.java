package kodlamaiodemoo;

public class Main 
{
	public static void main(String[] args) 
	{
		User user = new User();
		user.setName("Barış");
		
		Instructor ınstructor = new Instructor();
		ınstructor.setCourse("JAVA & REACT");
		
		Student student = new Student();
		student.setPhoneNumber("0123456789");
		
		UserManager userManager = new UserManager();
		userManager.add(user);

		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(ınstructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
	}

}
