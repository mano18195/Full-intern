package programs;

public class AbstractionSample {

	public static void main(String[] args) {
		ParentWish pw  = new ParentWish();
		pw.wish();

	}

}
abstract class ChildWish
{
	public abstract void wish();
	
}
class ParentWish extends ChildWish
{
	public void wish()
	{
		System.out.println("Marry your loved ones");
	}
}