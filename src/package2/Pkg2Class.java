package package2;

import package1.TestModifiers;

public class Pkg2Class extends TestModifiers{
	
	public void printModifiersValue() {
		
		System.out.println("public int a = "+a);
		System.out.println("default will not visible"); //"default int b = "+b
		System.out.println("protected int c = "+c);
		System.out.println("private will not visible "); //nt d = \"+d
	}

}
