
import java.util.Scanner;

public class Sphere {
    
    private double x,y,z,radius;
    
    public Sphere()//default
    {
        x=0;
        y=0;
        z=0;
        radius=0;
    
    }
    
    public Sphere(double x,double y, double z, double radius)//
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radius=radius;
    
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    
    public double getX()
    {
        return this.x;
    
    }
    
    public double calVol()
    {
        return 4*3.14*radius*radius*radius/3;
        
    }
    public static void main(String[] args){
        Sphere s1= new Sphere(2.0,2.0,2.0,0.0);
        //double volume = s1.calVol()
                System.out.println(s1);
        
    }
}

