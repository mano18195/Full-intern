package programs;



public class ProtectedAccessSpecifierSample  {

	public static void main(String[] args) {
             ProtectedSample ps = new ProtectedSample();
             ps.show();
             ps.start();
	}

}

class ProtectedSample {
	protected int a = 10;

	protected void show() {
		System.out.println("This is Protected ");
	}

	public void start() {
System.out.println("Something");		
	}

}