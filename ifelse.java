public class ifelse{
	public static void main(String[] args) {

		// creating an integer variable called 'age'
		// and assiging the value of '17' to it.

		int age = 17;

		// if the age variable is equal to '17' then
		// write "You are the required age to drive."

		if ( age == 17 ) {
			System.out.println("You are the required age to drive.");
		
		// if the age variable is greater than '17' then
		// write "You are above the required age to drive."

		} else if ( age > 17 ) {
			System.out.println("You are above the required age to drive.");

		// if the age variable is any value that is 
		// lower than or, not equal to '17' then write
		// "You are below the required age to drive."

		} else {
			System.out.println("You are below the required age to drive.");
		}
	}
}