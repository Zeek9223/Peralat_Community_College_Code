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
public class ShapeTester 

{
    
 public static void main(String[] args)
 {
    Shape[] s = new Shape [4];
   s[0] = new Point(1,1,1);
   s[1] = new Line(new Point(1,2,3),new Point(3,4,5));
   s[2] = new Circle(new Point(1,2,3),2);
   s[3] = new Sphere(new Point(2,2,2),3);
   for(int i=0;i<s.length;i++){
    System.out.println(s[i]);
   }
   System.out.println("\nMove 2,2,2 \nShapes:");
   for(int i=0;i<s.length;i++){
    s[i].move(2,2,2);
    System.out.println(s[i]);
   }
   System.out.println("\nDimentions:");
   for(int i=0;i<s.length;i++)
   {
   if(s[i] instanceof OneDimenShape){
     OneDimenShape ods = (OneDimenShape)s[i];
     System.out.printf("%s ,and length is %f\n",
              ods,ods.getLength());
   }
   if(s[i] instanceof TwoDimenShape)
   {
    TwoDimenShape tds = (TwoDimenShape)s[i];
     System.out.printf("The circle's area is %f\n",tds.getArea());
   }
   if(s[i] instanceof ThreeDimenShape)
   {
     ThreeDimenShape tds = (ThreeDimenShape)s[i];
     
     System.out.printf("The sphere's area is %f\n",tds.getArea());
     System.out.printf("The sphere's volume is %f",tds.getVolume());
   }
   
  }
   
 }
 
}
/*

The id of this point is 12 and x is 1 and y is 1 and z is 1
The id of this line is 13
The id of this circle is 14 and the x,y,z of the point is 1,2,3.
The id of this sphere is 15 and the x,y,z of the point is 2,2,2.
Move 2,2,2 
Shapes:
The id of this point is 12 and x is 2 and y is 2 and z is 2
The id of this line is 13
The id of this circle is 14 and the x,y,z of the point is 2,2,2.
The id of this sphere is 15 and the x,y,z of the point is 2,2,2.
Dimentions:
The id of this line is 13 ,and length is 3.464102
The circle's area is 12.566371
The sphere's area is 113.097336
The sphere's volume is 113.097328

*/




   