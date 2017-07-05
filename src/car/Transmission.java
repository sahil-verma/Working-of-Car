/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *this class defines the motion of the car
 * @author Sahil Verma
 */
public class Transmission {
   
    //local variables
    private Car car;// car object is called from the Car class
    String[] gear = {"Drive", "Parking", "Neutral", "Reverse"};// array object of string type to store the gears
    String currentGear;// to set the current gear of the car
    int speed;// to set the speed
    private final int SPEED_CHANGE = 10;// to the speed change of the car
    
    
//    trying with HashMap, but lack of time
//    HashMap<String, String> gears = new HashMap<String, String>();

    /**
     * Constructor to create objects of class tranmission
     * 
     * @param car
     *                 to set the car object from the class Car
     * @param cuurentGear
     *            to set the current gear of the car
     * @param speed
     *            to set the speed of the car
     * @throws car.MyException
     */
    public Transmission(Car car, String cuurentGear, int speed) throws MyException {
        setCurrentGear('N');
        setSpeed(0);
    }
    
    /**
     * This method sets the gear of the car
     *
     * @param gear
     * @throws car.MyException
     */
    public void setCurrentGear(char gear) throws MyException{
        if( getSpeed() != 0 && gear != 'N'){
            throw new MyException("to change the gear speed should be 0 ");
        }
        
        switch (gear) {
            
            case 'D' : this.currentGear = this.gear[0]; break;
            case 'P' : this.currentGear = this.gear[1]; break;
            case 'R' : this.currentGear = this.gear[3]; break;
            default  : this.currentGear = this.gear[2];
            
        }
        
    }
    
    /**
     * This method returns gear of a car
     * 
     * @return the gear of a car
     */
    public String getGear() {
        return this.currentGear;
    }
    
    /**
     * This method sets the speed of the car
     *
     * @param speed
     *           to set the speed of a car
     */
    protected void setSpeed(int speed){
        this.speed = speed;
    }
    
    /**
     * This method returns speed of a car
     * 
     * @return the speed of a car
     */
    protected int getSpeed(){
        return speed;
    }
    
    /**
     * This method accelerate the car
     *
     */
    protected void accelerate() {
        this.speed += SPEED_CHANGE;
    }
    
    /**
     * This method returns acceleration of a car
     * 
     * @param speedChange
     *              to change the speed of a car
     */
    protected void accelerate(int speedChange) {
        this.speed += speedChange;
    }
    
    /**
     * This method decelerate the car
     */
    protected void decelerate() {
        this.speed -= SPEED_CHANGE;
    }
    
    /**
     * This method returns deceleration of a car
     * @param speedChange
     *                to change the speed of a car
     */
    protected void decelerate(int speedChange) {
        this.speed -= speedChange;
    }
 
}
