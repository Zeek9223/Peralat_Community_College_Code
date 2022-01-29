/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogramdemo;

/**
 *
 * @author Student
 */
public class Histogram {
    int numberOfCounter = 0;
    int[] counters;
    int countersAcum = 0;
    double min;
    double max;
    int[] countersAcumAry;
    
    public Histogram(int numberOfCounter, double min, double max) {
        this.min = min;
        this.max = max;
        this.numberOfCounter = numberOfCounter;
        counters = new int[numberOfCounter];
        countersAcumAry = new int[numberOfCounter];
    }
    
    public Histogram(double min, double max) {
        this(10, min, max);
        counters = new int[numberOfCounter];
    }
    
    public double classWidth() {
        return ((max - min) / numberOfCounter);
    }
    
    public void add(double x) {
        for(int i = 0 ; i < numberOfCounter; i++) {
            if((x > (i * classWidth())) && (x <= ((i * classWidth()) + classWidth()))) {
                counters[i] += 1;
                countersAcumAry[i] += counters[i];
            }
        }
    }
    
    public void print() {
        for(int i = 0; i < counters.length; i++) {
            System.out.println("at index " + i + " " + counters[i]);
        }
    }
    
      public void printHistogram() {
          for(int i = 0; i < counters.length; i++) {
              System.out.print(i + 1 + "\t" + classWidth() * (i)  +
                      "--" + classWidth() * (i + 1) + "\t");
              for(int j = 0; j < counters[i]; j++) {
                  System.out.print("*");
              }
              System.out.print(counters[i]);
              System.out.println();
          }
    }  
      
    public void printHistogramAcum() {
          for(int i = 0; i < counters.length; i++) {
              System.out.print(i + 1 + "\t" + classWidth() * (i)  + "--" + 
                      classWidth() * (i + 1) + "\t");
              for(int j = 0; j < counters[i]; j++) {
                  System.out.print("*");
              }
              System.out.print(counters[i]);
              System.out.println();
          }
    }   
}
