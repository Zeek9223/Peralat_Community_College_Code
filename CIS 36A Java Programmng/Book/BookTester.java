/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Ana
 */
public class BookTester 
{
    
    public static void main(String[] args)
    {
       Library lib = new Library ();
       
       lib.addBook(new Book(" The Vinchi Code","Dan Brown",
               "AA77","Novel", "Phanthom Publising",2007,false));
       
       
        lib.addBook(new Book ("Absolute Java", " W Savitch","CC77",
        "Java Book"," Pearson Publisihing",2013,true));
        
        lib.addBook(new Book ("Algorithms", " R Sedgewick","DD88",
        "Data Structure Book",
                "Addition Wesley Publisihing",2010,true));
        
        
        System.out.println("----------");
        for (Book book : lib.searchBySubject("java "))
        {
            System.out.println(book);
        }
          
        
    }
           
}
/*

run:
----------
Title:Absolute Java,Author: W Savitch,Lib Catalog # : CC77
Absolute Java,  W Savitch, CC77,Java Book, Pearson Publisihing,2013,true
BUILD SUCCESSFUL (total time: 0 seconds)

*/