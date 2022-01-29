/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Ana
 */
import java.lang.String;

public class Person {

    private String fName;
    private String lName;
    private static int id=1000;
    private static int personelID;
    
    // constructor,
    
    Person(String first,String last, int id)
    {
        fName=first;
        lName=last;
        personelID=++id;           
    }
            
    // Accessor with get
      public String getname()
      {
          return fName;
      }
              
    public String getLast()
      {
          return lName;
      }
    
    public void getfullName()
      {
         System.out.println("fname" + "lName");
                           
      }
    
    public int getID()
      {
          return personelID;
      }
    
    //method for print
    public void printfname()
    {
        System.out.println("First name is :"+ fName);
    }
    
    public void printlname()
    {
        System.out.println("Lastname is :"+ lName);
    }
    public void printID()
    {
        System.out.println("ID Number is :"+ personelID);
    }
    
   public String toString() {
        return  "Person(" + fName + ',' + lName + ',' + ")";
    }
     
   // Main method
   
    public static void main(String[] args) {
        
        Person N1= new Person("Rick","Martin",personelID);
        
         N1.getfullName("Rick"+ "martin");
        
        //System.out.println(N1);
        
    }
    
}
