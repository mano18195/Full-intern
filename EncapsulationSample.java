package programs;
public  class EncapsulationSample {
	 private String userid;
	 private int age;
	 private String username;
	 
	 public String getUserid()
	 {
		 return userid; 
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public String getUsername()
	 {
		return username; 
	 }
		
public void setUserid(String userid)
{
	this.userid = userid;
}
public void setAge(int age)
{
	this.age=age;
	
	
}
public void setUsername(String username)
{
	
	this.username = username;
}
	}
 class EncapsulationDemo
{
	public static void main(String[] args) {
		EncapsulationSample es = new EncapsulationSample();
		es.setUserid("Mano");
		es.setUsername("Adaptavant");
		es.setAge(22);
		System.out.println("UserId is :"+es.getUserid());
		System.out.println("Age is :"+es.getAge());
		System.out.println("UserName is:"+es.getUsername());
	}
}