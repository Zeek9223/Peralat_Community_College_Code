/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecalculator;

/**
 *
 * @author Ana
 * import
 */

import java.util.Scanner;

public class ChangeCalculator 
{
    
    public static void main(String[] args) 
    {
        String name;
        int price,change,quarters,dimes,nickles;
        Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the name of the item");
        name=input.nextLine();
        System.out.println("Enter price of item");
        price=input.nextInt();
        
        change=100-price;
        quarters=change/25;
        change%=25;
        dimes=change/10;
        change%=10;
        nickles=change/5;  
                
        System.out.println("You bought an item for"+price+" cents and gave me "
                + "a dollar");
        System.out.println("So your change is:");
        System.out.println(quarters+" quarters");
        System.out.println(dimes+" dimes");
        System.out.println(nickles+" nickles");
        
        
    }
    
}


     /* output 

run:
Enter the name of the item
 fish
Enter price of item
80
You bought an item for80 cents and gave me a dollar
So your change is:
0 quarters
2 dimes
0 nickles
BUILD SUCCESSFUL (total time: 45 seconds)
*/
