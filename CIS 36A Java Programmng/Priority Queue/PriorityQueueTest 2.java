/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class PriorityQueueTest

{
    public static void main(String [] args)
    {
        PriorityQueue P = new PriorityQueue ();
        P.add("X",10);
        P.add("Y",1);
        P.add("Z",3);
        
        System.out.println(" " + P.remove());// remove top priority element X
        System.out.println(" " + P.remove());// After removing X,
                                             //Z becomes top priority element
        
        System.out.println(" " + P.remove());//After X & Z removal,
                                              //Y become top priority element 
        
    }//main
            
}// PriorityQueueTest

/*

OUTPUT

run:
 X
 Z
 Y
BUILD SUCCESSFUL (total time: 0 seconds)
*/