package kodlamaiodemoo;

public class Student extends User
{
	private String phoneNumber;
	private String school;
	private String crediCard;
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getSchool() 
	{
		return school;
	}
	
	public void setSchool(String school) 
	{
		this.school = school;
	}
	
	public String getCrediCard() 
	{
		return crediCard;
	}
	
	public void setCrediCard(String crediCard) 
	{
		this.crediCard = crediCard;
	}
}
