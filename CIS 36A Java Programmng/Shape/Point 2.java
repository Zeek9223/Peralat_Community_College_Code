/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Ana
 */
public class Point extends ZeroDimenShape {
    
    public int x, y,z;
    
    public Point(int dx, int dy,int dz) 
    {
        super();
    }
 
   // Getters and Setters
   
    public int getX() {return x;}
    

    public int getY() {return y;}

    public int getZ() {return y;}

     
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    
    public void setZ(int z) {this.z = z;}

   // Return "(x,y)"@Override
    @Override
    public String toString() 
    {return "(" + this.x + "," + this.y + ")";}

    @Override
    public void move(int x, int y, int z) {
        this.x+=x;
        this.y+=y;
        this.z+=z;
        
    }

   
}
    
    

