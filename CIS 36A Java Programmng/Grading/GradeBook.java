/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeek
 */
//  GradeBookTest.java
// GradeBook constructor used to specify the course name at the
// time each GradeBook object is created.

public class GradeBookTest
{
    // main method begins program execution
    public static void main( String args[] )
    {
        // create GradeBook object and initialize data
        GradeBook gradeBook1 = new GradeBook( "ENG Cisp401 Programming", "Sonny Hunag" );
        
        // display change instructor name
        System.out.printf( "\nChanging instructor name from %s to Sonny Huang\n", gradeBook1.getInstructorName());
        // call setInstructorName function to set a new name.
        gradeBook1.setInstructorName( "Sonny Huang" );
        
        //display change course name
        System.out.printf( "Changing course name from %s to CISP401 Object Oriented Programming with JAVA\n\n", gradeBook1.getCourseName());
        // call setCourseName function to set a new name.
        gradeBook1.setCourseName( "CISP401 Object Oriented Programming with JAVA" );
        
        gradeBook1.displayMessage(); // display welcome message
    } // end main
    
} // end class GradeBookTest
// GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook

   // constructor initializes courseName with String supplied as argument
   public GradeBook( String name )
   {
      courseName = name; // initializes courseName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
   } // end method displayMessage

} // end class GradeBook

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeek
 */
// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators
// and equality operators.
import java.io.PrintStream;
import java.util.Scanner; // program uses class Scanner
import static java.util.stream.IntStream.range;

public class Comparison
{
    // main method begins execution of Java application
    public static void main( String args[] )
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        
        int number1; // first number to compare
        int number2; // second number to compare
        int number3; // third number to compare
        int largestnumber = 0;
        int smallestnumber = 0;
        int range;
        int sum;
        int average;
        int product;
        int quotient;
        float remainder;
        
        
        
        
        
        System.out.print( "Enter first integer: " ); // prompt
        number1 = input.nextInt(); // read first number from user
        
        System.out.print( "Enter second integer: " ); // prompt
        number2 = input.nextInt(); // read second number from user
        
        System.out.print( "Enter third integer: " ); // prompt
        number3 = input.nextInt(); // read second number from user
        
        System.out.println("For the numbers " + number1 +" , "+ number2+" and " + number3 );
        
        if ( number1 > number2 && number1 > number3 ){
            largestnumber = number1;
            System.out.printf( "The largest number is " + number1 );
        }  else if (number2 > number1 && number2 > number3){
            largestnumber = number2;
            System.out.printf( "The largest number is " + number2);
        }  else if (number3 > number1 && number3 > number2){
            largestnumber = number3;
            System.out.printf( "the largest number is " + number3);
        }
        for smallestnumber);
        if ( number1 < number2 && number1 < number3 ){
            smallestnumber = 1;
            System.out.printf( "The samllest number is " + number1 );
        }  else if (number2 < number1 && number2 < number3){
            smallestnumber = 2;
            System.out.printf( "The smallest number is " + number2);
        }  else if (number3 < number1 && number3 < number2){
            smallestnumber = 3;
            System.out.printf( "the smallest number is " + number3);
            
        }
        
        
        { range = largestnumber / smallestnumber;
            System.out.println("Range is " + range);
        }
        
        { sum = (number1 + number2 + number3);
            System.out.println("The sum is " + sum);
        }
        
        { product = (number1 * number2 * number3);
            System.out.println("The product is " + product);
        }
        
        { average = (number1 + number2 + number3)/3;
            System.out.println("The average is " + average);
        }
        
        {quotient = (largestnumber / smallestnumber);
            System.out.println(" Quotient of the largest divided by the msallest is " + quotient);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeek
 */
//  GradeBookTest.java
// GradeBook constructor used to specify the course name at the
// time each GradeBook object is created.

public class GradeBookTest
{
    // main method begins program execution
    public static void main( String args[] )
    {
        // create GradeBook object and initialize data
        GradeBook gradeBook1 = new GradeBook( "ENG Cisp401 Programming", "Sonny Hunag" );
        
        // display change instructor name
        System.out.printf( "\nChanging instructor name from %s to Sonny Huang\n", gradeBook1.getInstructorName());
        // call setInstructorName function to set a new name.
        gradeBook1.setInstructorName( "Sonny Huang" );
        
        //display change course name
        System.out.printf( "Changing course name from %s to CISP401 Object Oriented Programming with JAVA\n\n", gradeBook1.getCourseName());
        // call setCourseName function to set a new name.
        gradeBook1.setCourseName( "CISP401 Object Oriented Programming with JAVA" );
        
        gradeBook1.displayMessage(); // display welcome message
    } // end main
    
} // end class GradeBookTest


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeek
 *
 *
 */


public class GradeBook {
    
    public GradeBook(String eng_cs_60_JAVA_Programming, String judy_Jones) {
    }
    
    Object[] getInstructorName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void setInstructorName(String sonny_Huang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Object[] getCourseName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void setCourseName(String cisP401_Object_Oriented_Programming_with_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void displayMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
