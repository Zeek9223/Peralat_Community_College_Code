/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import java.util.*;

public abstract class Shape {

static int shapeID=1;
//private int x,y,z;

public Shape()
{ 
    shapeID ++;

}

// public void setX(int a){x = a;}
// public void setY(int b){y = b;}
// public void setz(int c){z = c;};
//
//    
// public int getX(){return x;};
// public int getY(){return y;};
// public int getz(){return z;}; 
 public int getID(){ return shapeID;};
 
//abstract move class

public abstract void move(int x, int y, int z);

}






    
