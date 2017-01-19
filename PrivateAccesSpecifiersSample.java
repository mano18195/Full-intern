package programs;

public class PrivateAccesSpecifiersSample {

	public static void main(String[] args) {
		DemoProgram dp = new DemoProgram();
		//dp.print();//this gives compilation error as we are trying to 
		//access a private method from anothe class
		//System.out.println(dp.a); Same here as a was declared as private
		dp.great();
				
	}

}
class DemoProgram
{
	private int a=20;
	public int b=21;
	private void print()
	{
		System.out.println("Hey there!!!");
	}
	public void great()
	{
		System.out.println("This is Public method");
	}
}