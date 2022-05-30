import java.util.Scanner;
import java.util.Random;

public class ConvertToBooleans {
	
 public static void main( String [] args ) {
	 
   int [][] numbers;
   Scanner scan = new Scanner( System.in );
 
// Get two positive numbers from user
   
   int rows, columns;
	 
   do {
	   
     System.out.print( "Enter a number of rows for the array > " );
     rows = scan.nextInt( );
     
     System.out.print( "Enter a number of columns for the array > " );
     columns = scan.nextInt( );
     
   } 
   
   while ( rows < 1 || columns < 1 );
   
// instantiate and generate array numbers
   
   numbers = new int[rows][columns];     
   generateArray( numbers );   
   
   System.out.println( "The resulting array is:\n" + toString( numbers ) );

// convert all array elements to boolean values   
   
   boolean [][] binaryValues = convertToArrayOfBooleans( numbers );
   
   System.out.println( "The resulting array is:\n" + toString( binaryValues ) );
	 
 }

// This method runs in O( p * q ) where p = number of rows in arr q = 
// number of columns in arr
 
 public static boolean[][] convertToArrayOfBooleans( int [][] arr ) {
	 
   boolean [][] result;
   result = new boolean[arr.length][];
   int count = 0;
   
   for ( int i = 0; i < arr.length; i++ ) {
     result[i] = new boolean[arr[i].length];
     for ( int j = 0; j < arr[i].length; j++ ){
       result[i][j] = ( arr[i][j] >= 0 );
       count++;
       
     }
   } 

   System.out.println( "Number of statements executed inside innermost loop: " + count );
   return result;
   
 }

 public static String toString( boolean [][] arr ) {
	 
   String result = "";
   
   for ( int i = 0; i < arr.length; i++ ) {
     for ( int j = 0; j < arr[i].length; j++ ) {
       result += arr[i][j] + " ";
     result += "\n"; 
	     
   }
   }
     
   return result;
   
   }

 public static String toString( int [][] arr ) {
	 
   String result = "";
   for ( int i = 0; i < arr.length; i++ ) {
     for ( int j = 0; j < arr[i].length; j++ ) {
       result += arr[i][j] + " ";
     result += "\n"; 
   }
   }
     
   return result;
   
   }

 public static void generateArray( int [][] arr ) {
	 
   Random rand = new Random( );
   for ( int i = 0; i < arr.length; i++ ) {
     for ( int j = 0; j < arr[i].length; j++ ) {
       arr[i][j] = -100 + rand.nextInt( 200 ); 
   }
 }

 }
}
