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
public class Book 
{
    
    private String title;
    public String authors;
    public String libCatNum;
    public String subject;
    private String publisher;
    public  int yearOfPub;
    private  boolean circulation; 
    
    public Book()
    {
       title= " ";
      authors=" ";
      libCatNum = " ";
      subject = " ";
      publisher=" ";
      yearOfPub= 0;
      circulation = false;   
    }

    public Book( String aTitle, String auth,String catNum,String sub,
            String pub, int yr, boolean cir)
    {
        title = aTitle;
        authors = auth;
        libCatNum= catNum;
        subject = sub;
        publisher=pub;
        yearOfPub = yr;
        circulation =cir;
        
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor(){
        return authors;
        
    }
        
    public String getCatNum()
    {
        return libCatNum;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public String getPublisher()
    {
    return publisher;    
    }
    
    public int getYear()
    {
        return yearOfPub;
    }
    
    public boolean getCirrculation()
    {
        return circulation;
    }
    
    public String toString() 
    {
        return (getTitle() + ", " + getAuthor() + ", " + getCatNum()+"," +
            getSubject() + "," + getPublisher() +"," + getYear()+ ","+
             getCirrculation());
    }
        
                
}         
                
    
