/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Student
 */
public class ID {
    private static int tempID = 1001;
    
    public int addID() {
        return tempID++;
    }
}
