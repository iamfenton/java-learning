public class methods {

	// methods are essentially functions.
	// methods must be declared in a class.
	// the method below will print "Hello, world!"
	// to the terminal once called.

	static void helloMethod() {
		System.out.println("Hello, world!");
	}

	// the method below takes a string variable
	// called 'name' as the parameter. once the
	// name is passed into the method it is 
	// concatenated with a phrase which reads 
	// "is epic!".

	static void isEpic(String name) {
		System.out.println(name + " is epic!");
	}

	// the method below takes an integer variable 
	// in the parentheses then adds '5' to it.
	// the method then returns the result and 
	// prints it to the terminal.

	static int additionCalc(int num) {
		return 5 + num;
	}

	public static void main (String[] args) {

		// calling the 'helloMethod()' method.
		// the code below will write "Hello, world!"
		// to the terminal.

		helloMethod();

		// calling the 'isEpic()' method.
		// the code below will take the name
		// in the parentheses and concatenate
		// "is epic!" at the end. it will output
		// to the terminal "Fenton is epic!".

		isEpic("Fenton");
		isEpic("Jamie-lee");

		// calling the 'additionCalc' method.
		// the code below will take an integer
		// in the parentheses and add 5 to it.
		// it will output to the terminal '10'.

		System.out.println(additionCalc(10));

	}
}