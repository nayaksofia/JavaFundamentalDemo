/*
 * Author:: Sofia Nayak
 * Date :: 4-3-2022
 * 
 * Assignment-2:: Alphabet Pattern
 * Write a program , whose output is as following ::
 * A
 * A B 
 * A B C
 * A B C D
 * 
 * Reference:: 
 * For More Pattern To Explore, Refer the following link
 * https://www.javainterviewpoint.com/alphabet-pattern-program/
 */


package sofi;

public class AssignmentTwoAlphabetPattern {

	public static void main(String[] args) {
		int alphabet = 65; //Decimal value of ASCII Char A is 65 and so on...
		System.out.println("*** Printing the Pattern ***");
		
		for(int i=0; i <=5 ; i++) {
			for (int j=0; j<=i ; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}

	}

}
