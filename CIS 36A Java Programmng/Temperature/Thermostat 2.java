/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thermostat;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana
 */
public class Thermostat extends Exception {

    private int minTemp;
    private int maxTemp;
    private int roomTemp;

    public Thermostat() {

        this.minTemp = 0;
        this.maxTemp = 100;

    }

    public Thermostat(int aMin, int aMax) {

        minTemp = aMin;
        maxTemp = aMax;

    }

    public void setTemp(int tem) throws TemperatureTooHigh, TemperatureTooLow {

        if (tem > maxTemp) {
            
            throw new TemperatureTooHigh(tem);
            
        } else if (tem < minTemp) {

            throw new TemperatureTooLow(tem);
            
        } else {
            
            roomTemp = tem;
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TemperatureOutOfRange {
        
        try {
            
            Thermostat t = new Thermostat(0, 100);
            
           t.setTemp(150);
            
            t.setTemp(-50);
            
        }
        catch (TemperatureTooHigh ex) {
            System.out.println(
                    "We caught exception " + ex.getClass() + 
                            " in TempureTooHighException Block" +
                            "\nMessage: " + ex.getMessage()
            );
            
        } catch (TemperatureTooLow ex) {
            System.out.println(
                    "We caught exception " + ex.getClass() + 
                            " in TempureTooLowException Block" +
                            "\nMessage: " + ex.getMessage()
            );
            
        } catch (TemperatureOutOfRange ex) {
            System.out.println(
                    "We caught exception " + ex.getClass() + 
                            " in TempureOutOfRangeException Block" +
                            "\nMessage: " + ex.getMessage()
            );
            
        }
        

    }

}


/*

for t.temp(150)
 We caught exception class thermostat.TemperatureTooHigh in TempureTooHighException Block
Message:  Temerature 150.0 Too high.CORRECT!

for t.temp(-50)
We caught exception class thermostat.TemperatureTooLow in TempureTooLowException Block
Message:  Temerature -50.0 Too low.CORRECT!
*/