package test;

import bar.Bar;

// Inherits class Bar, hence can access all the members with the access modifiers - public and protected
class Test extends Bar {

	public static void main(String[] args) {
		
		//Creating an object of Test class
		Test t = new Test();
		
		//Accessing public member of Bar class
		t.printHello();
		
		//Calling the member of the same class
		t.testPrint();

		// Cannot be called here with the "this" keyword as main() is a static function
		// this.printMessageWhichCanBeInherited();
	}

	public void testPrint() {

		// The inherited properties/members can be accessed in the same way 
		// as the members of the same class using the this keyword
		this.printMessageWhichCanBeInherited();
	}
}
