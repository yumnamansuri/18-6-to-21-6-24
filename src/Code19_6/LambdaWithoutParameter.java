package Code19_6;

public class LambdaWithoutParameter {

	
	/*
	
	-> Lambda expression is treated as a function (@functionalinterface)
	-> Lambda expression provides implementation of functional interface
	-> Less Coding
	-> Java 8 Feature
	
	* Syntax :-
	
		() -> {   }
		
		*Argument - List ()
		*Arrow-Token ->
		*body{   }
		
	 */
	
	interface IStatement
	{
		String show();
	}
	public static void main(String[] args) {
		
		
	//	 IStatement cannot be resolved to a type 
	// - The target type of this expression must be a functional interface
		
		IStatement s = () -> { return "Hello World...I'm Lambda Expression Without Parameter";};
		System.out.println(s.show());

	}

}
