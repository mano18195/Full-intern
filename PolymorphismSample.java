package programs;

public class PolymorphismSample {

	public static void main(String[] args) {
		EditMathsOps emo = new EditMathsOps();
		emo.add(1,2);
		emo.add("Manoj", "Kumar");
		

	}

}
class MathsOps
{
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	public void add(String x, String y)
	{
		System.out.println(x+y);
	}
}
class EditMathsOps extends MathsOps
{
	public void add(int x, int y)
	{
		System.out.println(x-y);
	}
}