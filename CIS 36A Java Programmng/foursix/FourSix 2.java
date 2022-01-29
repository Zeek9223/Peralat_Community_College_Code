/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
/**
 *
 * @author Ana
 */
public class FourSix {
    
    private double quiz1, quiz2, quiz3, mid, fin,overallNumericGrade;
    private String finalLetterGrade;
    
    public FourSix()
    {
        quiz1=0;
        quiz2=0;
        quiz3=0;
        mid=0;
        fin=0;
        
    }
    
    public double getOverallNum()
    {
        calculateOverallNumericGrade();
        return overallNumericGrade;
    
    }
    
    public String getLetterGrade()
    {
        calculateOverallNumericGrade();
        calFinalGrade(overallNumericGrade);
        return finalLetterGrade;
    
    }
    
    public void setquiz1(double q1)
    {
        quiz1=q1;
    
    }
    
    public void setquiz2(double q2)
    {
        quiz2=q2;
        
    }
    
    public void setquiz3(double q3)
    {
        quiz3=q3;
        
    }
    
    public void setmid(double mid)
    {
        this.mid=mid;
        
    }
    public void setfinal(double fin)
    {
        this.fin=fin;
        
    }
    
    public boolean equals(FourSix obj)
    {
        calculateOverallNumericGrade();
        if(this.overallNumericGrade==obj.getOverallNum())
            return true;
        return false;
    }
    
    
    public void calculateOverallNumericGrade(){
        overallNumericGrade = fin*0.4 + mid*0.35 +(quiz1+quiz2+quiz3)*(1/4)*0.25;
    }
    
    
    public void calFinalGrade(double numGrade){
        
      if (numGrade>=90 ){
          finalLetterGrade ="A";    
      }
      else if (numGrade >=80)  {
          finalLetterGrade = "B";
      }   
      
      else if (numGrade >=70 ){
          finalLetterGrade = "C";
          
      }
      else if (numGrade >=60 ){
          finalLetterGrade = "D";
          
      }
      else {
          finalLetterGrade = "F";
      }
    }

      public void toSring()
      {
          calculateOverallNumericGrade();
          calFinalGrade(overallNumericGrade);
          System.out.println("overall Nummeric Grade is "+overallNumericGrade);
          System.out.println("overall letter Grade is "+finalLetterGrade);
          
      }
    
        
}
    
    
    // Result from tester file
/*
overall Nummeric Grade is 75.0
overall letter Grade is C
BUILD SUCCESSFUL (total time: 0 seconds)

    
*/
