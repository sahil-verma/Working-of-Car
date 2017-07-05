package car;

/**
 *This class defines the structure of body of a car
 * @author sahil verma
 */
public class Body {
    // instance variable
    private boolean stateOfDoors; // true = doors closed, false = doors open
    private Car car;// car object is called from the Car class
    private boolean personsState;
    
    public Body() throws MyException {     
//        setStateOfDoors("Close");
    }
    
    
    /**
     * Constructor to create objects of class Body
     * 
     * @param car
     *        to set the car object from the class Car
     * @param stateOfDoors
     *        to set the doors of a car
     * @param personsState
     *        to set the state of a person
     * @throws car.MyException
     */	
    public Body(Car car, String stateOfDoors, String personsState) throws MyException {
        this.car = car; 
        setPersonsState(personsState);  
        setStateOfDoors(stateOfDoors);
    }

    /**
     * This method sets/changes the doors of a car
     * 
     * @param stateOfDoors
     *             to set the doors of a car
     * @throws MyException if car is moving and doors are open
    */
    protected void setStateOfDoors(String stateOfDoors) throws MyException {
        if ( car.getCarMoving() == true ) { throw new MyException((stateOfDoors.equalsIgnoreCase("open") ? "Cannot open the doors while the car is moving" : "Cannot close the doors while the car is moving")); }
        this.stateOfDoors = stateOfDoors.equalsIgnoreCase("close");
        
    }
    
    /**
     * This method returns the stateOfDoors of the body
     * 
     * @return the stateOfDoors of the body
     */
    protected boolean getStateOfDoors(){
        return stateOfDoors;
    } 
    
    /**
     * This method sets/changes the state of a person
     * 
     * @param personsState
     *             to set the state of a person
     * @throws MyException if car is moving and doors are open
     */
    protected void setPersonsState(String personsState) throws MyException {
        
        if(personsState.equalsIgnoreCase("out")){
            
            setStateOfDoors("open");
            
        }
        
        this.personsState = personsState.equalsIgnoreCase("In");
        
    }
    
    /**
     * This method returns the persons state
     * 
     * @return the persons state
     */
    protected boolean getPersonsState(){
        
        return personsState;
        
    }
    
}
