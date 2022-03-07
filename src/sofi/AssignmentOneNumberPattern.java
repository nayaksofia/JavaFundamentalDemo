/*
 * Author :: Sofia Nayak
 * Date :: 4-3-2022
 * 
 * 
 * Assignment-1: Number Pattern
 * Write a java program, whose output is as following:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5 
 */

package sofi;

public class AssignmentOneNumberPattern {

	public static void main(String[] args) {
		
     int i ;
     int j ;
     
     for(i=1 ; i<=5 ; i++) {
    	 for(j=1 ; j <=i ; j++) {
    		 System.out.print(j + " ");
    	 }
    	 
    	 System.out.println();
     }
		
		
	}

}
