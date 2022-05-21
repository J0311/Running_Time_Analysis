import java.util.Scanner;
import java.util.Random;

public class ArrayAverage{
	
 public static void main( String [] args ) {
	 
   int [] numbers;
   Scanner scan = new Scanner( System.in );

   // Get a positive number from user
   
   int size;
   do {
     System.out.print( "Enter a number of elements for the array > " );
     size = scan.nextInt( );
     
   } while ( size < 1 );
   
   // instantiate and generate array numbers
   
   numbers = new int[size];     
   generateArray( numbers ); 
   
   // print array
   
   System.out.println( "The array values are: " );
   
   for ( int i = 0; i < numbers.length; i++ ) {
      System.out.print( numbers[i] + " " );
   }
   
   System.out.println( );  
      
   // calculate average of all array elements   
   
   double avg = average( numbers );
   
   System.out.println( "The average of all the elements in the array is " + avg );
   
 	}

 // This method runs in O( n ) where n = number of elements in arr
  
 public static double average( int [] arr ) {
	 
   int sum = 0;
   int count = 0;
   for ( int i = 0; i < arr.length; i++ ) {
     sum += arr[i];
     count++;
   
 }
   
   System.out.println( "Number of statements executed inside innermost loop: " + count );
   
   if ( arr.length != 0 ) {
     return ( double ) sum / arr.length;
   }
   
   else {
	   
     return 0.0;
   }
   
   }

 public static void generateArray( int [] arr ) {
	 
   Random rand = new Random( );
   for ( int i = 0; i < arr.length; i++ ) {
     arr[i] = rand.nextInt( 100 ); 
   }
   
 }

}