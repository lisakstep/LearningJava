/**
 * 
 */
package practiceJava;

/**
 * @author Lisa
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		int [] mynum = new int [6];
		
		
		// print out a string of text: Here's some random math./n
		System.out.println ("Here's some random math." );  
		
		// now generate six random numbers between 1 and 10 inclusive and place in an array
		for ( int i = 0; i < 6; i++ ){
			mynum[i] = (int)(Math.random() * (10) + 1);
			//show me the numbers
			System.out.println ("number[" + i + "] = "+ mynum[i] );
			
		}
		
		/*Now I have some randomly generated numbers. Let's do some math.
		    perform the following operations and print them out in the form, "x - y = z" with the appropriate operator.
			Subtract the second number from the first number
			Multiply the third and fourth number
			Divide the fifth and sixth number	
		 */
		//First equation
		System.out.println (mynum[0] + " - " + mynum[1] + " = " + (mynum[0] - mynum[1]) );
		//Second equation
		System.out.println (mynum[2] + " * " + mynum[3] + " = " + (mynum[2] * mynum[3]) );
		//Third equation
		if (mynum[5] == 0) {
			System.out.println ("Sorry. Can't divide by 0" );
		} else {
		System.out.println (mynum[4] + " / " + mynum[5] + " = " + ((double)mynum[4] / (double)mynum[5]) );}

	}

}
