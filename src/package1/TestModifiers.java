package package1;

public class TestModifiers {
	
	public int a=10;
	int b=20; //default
	protected int c=30;
	private int d=40;
	
	public void printModifiersValue() {
		
		System.out.println("public int a = "+a);
		System.out.println("default int b = "+b);
		System.out.println("protected int c = "+c);
		System.out.println("private int d = "+d);
	}

}
