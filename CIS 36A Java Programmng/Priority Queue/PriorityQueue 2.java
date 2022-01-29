/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Ana
 * 
 */
public class PriorityQueue 

  {
   private ArrayList  queueArray;
   private ArrayList queueWithPriorityArray;
   
      public PriorityQueue ()
        {
         queueArray = new ArrayList();
         queueWithPriorityArray = new ArrayList();     
        }
           
      //Add method
       public <T> void add(T itemToAdd,int priorityAssigned)
               
       {
           queueArray.add(itemToAdd);
           queueWithPriorityArray.add(priorityAssigned);
   
       } 
       
       // remove method remove element with max priority
       
       public <T> T remove()
               
       {
           int max=0;
           int topPriority=0;
           
            for(int i=0;i<queueArray.size();i++)
            {
               //int comp  = i; 
               int comp = (int) queueWithPriorityArray .get(i);
                int a = comp;
                if( a > topPriority)
                    
                {
	            max=i;
		    topPriority= a;
                }  
                    
            }// for
            
            queueWithPriorityArray.remove(max);
            return (T) queueArray.remove(max);
           
       }// remove
       
       //public static void main(String [] args) {}
   }// end Class
    
    

