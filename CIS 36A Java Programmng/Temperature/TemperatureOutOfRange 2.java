/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thermostat;

/**
 *
 * @author Ana
 */
public class TemperatureOutOfRange extends Exception {

    /**
     * Creates a new instance of <code>TemperatureOutOfRange</code> without
     * detail message.
     */
    public TemperatureOutOfRange() {
    }

    /**
     * Constructs an instance of <code>TemperatureOutOfRange</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TemperatureOutOfRange(String msg) {
        super(msg);
    }
}
