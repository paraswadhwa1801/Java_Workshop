import static java.lang.Integer.MAX_VALUE;

// An example to understand the rules for naming an identifier
// Also, to understand the static imports

class Test {
	
//  Legal identifiers
	int _a;		//contains only unicode character and starts with underscore
	int $c;		//can start with dollar symbol
	int ______2w__;	//can start with underscore
	int _$;		//can start with underscore and dollar is a valid character
	int this_is_a_very_detailed_name_for_an_identifier;	//follows the naming conventions for identifiers

//  Illegal identifiers
	// int :b;		//cannot use the symbol colon
	// int -d;		//cannot use hyphen
	// int e#;		//cannot use hash symbol
	// int .f;		//cannot use dot as dot operator exist
	// int 7g;		//cannot start with a number

 	static public void main(String args[]) {
		System.out.println("Hello World");
		// System.out.println(args[0]);		//Need to pass an argument at run-time
		System.out.println(MAX_VALUE);		//Prints the max value a integer can store
	}

}
