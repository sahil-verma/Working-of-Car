/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *this class defines the level of the gas of a car
 * @author sahil verma
 */
public class GasTank {
    
    private Car car;// car object is called from the Car class
    private int gasLevel;// to set the level of the gas
    private int stateOfGas;// to check the state of gas low or high
    final int MAX_GASLEVEL;// to set the max gas level
    final int MIN_GASLEVEL;//to set the minimum gas level
    
     /**
     * Constructor to create objects of class Engine
     * 
     * @param car
     *                 to set the car object from the class Car
     * @param gasLevel
     *                 to set the gas of the gas tank
     * @param MAX_GASLEVEL
     *                 to set the maximum gas of the gas tank
     * @param MIN_GASLEVEL
     *                 to set the minimum gas of the gas tank
     * @throws car.MyException
     */
    protected GasTank(Car car, int gasLevel, int MAX_GASLEVEL, int MIN_GASLEVEL) throws MyException{
        
        this.MAX_GASLEVEL = MAX_GASLEVEL;
        this.MIN_GASLEVEL = MIN_GASLEVEL;
        setGasLevel(gasLevel);
        
    }
    
    /**
     * This method set the gasLevel of the car
     *
     * @param gasLevel
     *             to set the gasLevel of the car
     * @throws car.MyException
     */
     protected void setGasLevel(int gasLevel) throws MyException{
         if(gasLevel <= MIN_GASLEVEL){
            throw new MyException("gas of the car should be refilled");
         }
         this.gasLevel = gasLevel;
     }
     
     /**
     * This method returns gasLevel of a gas tank
     * 
     * @return gasLevel of a gas tank
     */
     protected int getGasLevel(){
         return gasLevel;
     }
     
     /**
     * This method sets the gasLevel of the car
     *
     * @param stateOfGas
     *             to set the state of the gas 
     * @throws car.MyException
     */
     protected void setStateOfGas(int stateOfGas) throws MyException{
         this.stateOfGas = stateOfGas;
     }
     
     /**
     * This method returns state of gas of a gas tank
     * 
     * @return state of gas of a gas tank
     * @throws car.MyException
     */
     protected String getStateOfGas() throws MyException{
       return (getGasLevel() <= MIN_GASLEVEL)? "low" : ((getGasLevel() == MAX_GASLEVEL)? "maximum level" : "moderate");
    }
     
    /**
     * This method returns minimum gas level of a gas tank
     * 
     * @return minimum gas level of a gas tank
     */
    protected int getMIN_GASLEVEL(){
        return MIN_GASLEVEL;
    }
    
    /**
     * This method returns maximum gas level of a gas tank
     * 
     * @return maximum gas level of a gas tank
     */
    protected int getMAX_GASLEVEL(){
        return MAX_GASLEVEL;
    }
}
