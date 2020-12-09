class Test {
	public static void main(String[] args) {
		// throws compile time error:- incompatible types: int cannot be converted to boolean
		// should be a boolean condition or 1 or 0
		for(int i = 0; 1; i++) {
			System.out.println("Hello"); 
        		break;
     		}
	}	
}
