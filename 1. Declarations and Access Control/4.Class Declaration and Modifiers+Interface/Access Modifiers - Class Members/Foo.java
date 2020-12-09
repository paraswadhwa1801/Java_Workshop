package foo;

import bar.Bar;

//Class Foo declared in the foo package
class Foo {

	public static void main(String[] args) {
	
		// Creating an object of Bar class which is public
		Bar b = new Bar();
		
		//Trying to access public member
		b.printHello();	

		//Trying to access private member
		//Throws error
		//b.printPrivateMessage();

		// Throws error as the method is declared with the protected modifier
		// b.printMessageWhichCanBeInherited();
	}
}
