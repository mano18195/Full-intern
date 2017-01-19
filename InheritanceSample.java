package programs;

public class InheritanceSample {

	public static void main(String[] args) {
        School s = new School();
        s.celeberations();
        s.faculties();

       

	}

}
class College
{
	public void celeberations()
	{
		System.out.println("We have Culturals");
		
	}
	public void faculties()
	{
		System.out.println("We have Professors");
	}
}
class School extends College
{
	public void celeberations()
	{
		System.out.println("We have Annual Day");
	}
}