package bar;

// If this class is declared without the public modifier, then it is only accessible
// in the bar package
// class Bar {
public class Bar {

	// Can be accessed by any class independent of the package
	protected void printHello() { System.out.println("Hello from Bar class"); }

	// Can only be accessed within this class
	private void printPrivateMessage() { System.out.println("Private message from bar class"); }

	// Can be accessed by any class that extends this class (Inheritance - super class and sub class)
	// independent of the package
	protected void printMessageWhichCanBeInherited() { 
		System.out.println("Message which can be inherited from Bar class"); 
	}
}
