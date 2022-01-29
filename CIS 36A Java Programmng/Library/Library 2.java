/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;
import java.util.ArrayList;

/**
 *
 * @author Ana
 */
public class Library 
{
    
 private ArrayList<Book> book;

 public Library() 
   {
   this.book = new ArrayList<Book>();
   
    }

    public void addBook(Book newBook) 
    {
        this.book.add(newBook);
    }

    public void printBooks() 
    {
        for (Book bb : book) 
        {
            System.out.println(bb);
        }
    }
//    Search by Subject method
    
    public ArrayList<Book> searchBySubject(String subject) 
    {
        ArrayList<Book> copy = new ArrayList<Book>();

        for (int i = 0; i < this.book.size(); i++) 
        {
          if (StringUtils.included(this.book.get(i).getSubject(),subject )) 
          {
              
          
            copy.add(this.book.get(i));
            System.out.println( "Title:"+this.book.get(i).getTitle() +"," +
                    "Author:"+this.book.get(i).getAuthor() + "," +
                    "Lib Catalog # : "+this.book.get(i).getCatNum());
          
           }
        }
        return copy;
    }
}

    

