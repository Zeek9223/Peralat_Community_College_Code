/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiSphere;
import java.util.Scanner;
public class MultiSphere
package sphere4_1;
import java.text.Decimalformat;
/**
 *
 * @author Zeek
 */
public class Multisphere {
    
    public static void main(String[] args){
        double r = 0;
        Decimalformat fmt = new Decimalformat();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a diameter of a sphere: ");
        r = scan.nextdouble();
        
        scan.close();
        
        Sphere sphere = new Sphere(r);
        
        System.out.println(fmt.format(sphere.getVolume()));
        System.out.println(fmt.format(sphere.getArea()));
        
    }
    
}


