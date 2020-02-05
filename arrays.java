public class arrays {
	public static void main(String[] args) {

		// creating a string variable called 'albums' that
		// holds an array of strings.

		String[] albums = {"Slipknot", "Iowa", "Vol. 3: (The Subliminal Verses)", "All Hope is Gone", ".5 The Gray Chapter", "We Are Not Your Kind."};
	
		// creating an integer variable called 'numbers' that
		// holds an array of integers.

		int[] numbers = {1410, 1411, 1412, 1401};

		// array indexes start at '0' meaning the
		// first element in an array has a position
		// of [0]. the code below should output 'Slipknot'.

		System.out.println(albums[0]);

		// print the total number of items in the array 
		// to the terminal. 

		System.out.println(albums.length);

		// for loop that prints all of the elements in
		// the array to the terminal. 
		// creating an integer variable called 'x' and
		// giving it the value of 0. for the value of 'x'
		// being less than albums.length (which is 6) add
		// '1' to the 'x' variable and print the element
		// in that position in the arrary to the terminal.

		for ( int x = 0; x < albums.length; x++ ) {
			System.out.println(albums[x]);
		}

	}
}