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
public class Circle extends TwoDimenShape {
     private Point a;
    private double radius;
    private static float PI = (float)3.141592653;
 
    public Circle(Point a,double radius ) 
    {
        super();
        this.shapeID ++;
        this.a=a;
        this.radius=radius;
    }
     
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
     
    @Override
    public void move(int x,int y,int z)
    {
        this.a.x= x;
        this.a.y= y;
        this.a.z= z;   
    }
    @Override
    public double getArea() 
    {
       return Math.PI*Math.pow(getRadius(), 2);
    }
 
    @Override
    public String toString() 
    {
        return "the ID of this Circle id" + (this.shapeID+3)+
         " and the X,Y,Z of the point is" + this.a.x + ", " +
                this.a.y + ", " = this.a.z + "." ;
                
    }
     
     
}
