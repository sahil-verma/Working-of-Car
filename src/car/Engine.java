package car;

/**
 *This class defines the structure of engine of a car
 * @author sahil verma
 */
public class Engine {
    private Car car;// car object is called from the Car class
    private boolean stateOfEngine;// true = engine on, false = engine off
    private int engineOil;// engine oil in the engine
    private int engineOilLevel;// level of the engine oil in engine
    final int MAX_ENGINEOILLEVEL;//the maximum quantity of engine oil stored in the engine
    final int MIN_ENGINEOILLEVEL;//the minimum quantity of engine oil stored in the engine
    
    
    /**
     * Constructor to create objects of class Engine
     * 
     * @param car
     *                 to set the car object from the class Car
     * @param engineOil
     *                 to set the oil of the engine
     * @param stateOfEngine
     *                 to set the engine on or off of a car
     * @param MAX_ENGINEOILLEVEL
     *                 to set the maximum engine oil in the engine of a car
     * @param MIN_ENGINEOILLEVEL
     *                 to set the minimum engine oil in the engine of a car
     * @throws car.MyException
     */
    public Engine(Car car, String stateOfEngine, int engineOil, int MAX_ENGINEOILLEVEL, int MIN_ENGINEOILLEVEL) throws MyException{
        this.engineOil = engineOil;
        this.MAX_ENGINEOILLEVEL = MAX_ENGINEOILLEVEL;
        this.MIN_ENGINEOILLEVEL = MIN_ENGINEOILLEVEL;
        setStateOfEngine(stateOfEngine);
      }
    
    /**
     * This method sets/changes the engine of a car to on or off
     * 
     * @param stateOfEngine
     *             to set the engine of a car to on or off
     * @throws MyException if engineOilLevel = low.
     */
    
    public void setStateOfEngine(String stateOfEngine) throws MyException{
      
        if(getEngineOil() == 0)
            throw new MyException("engine oil should be refilled");
       this.stateOfEngine = ( stateOfEngine.equalsIgnoreCase("on") );
    }
    
    /**
     * This method returns stateOfEngine of a engine
     * 
     * @return the stateOfEngine of a engine
     */
    
    protected boolean getStateOfEngine(){
        return stateOfEngine;
    }
    
    /**
     * This method sets the engineOil of a Engine
     *
     * @param engineOil
     * @throws car.MyException
     */
    protected void setEngineOil(int engineOil)throws MyException{
        this.engineOil = engineOil;
    }
    
    /**
     * This method returns engineOil of a engine
     * 
     * @return the engineOil of a engine
     */
    public int getEngineOil(){
        return this.engineOil;
    }
   
    /**
     * This method sets the engineOillevel of a Engine
     *
     * @param engineOilLevel
     * @throws car.MyException
     */
    protected void setEngineOilLevel(int engineOilLevel)throws MyException{
        this.engineOilLevel = engineOilLevel;
    } 
    
    /**
     * This method returns engineOilLevel of a engine
     * 
     * @return the engineOilLevel of a engine
     * @throws MyException if engine oil <= MIN_ENGINEOILLEVEL : low,
     * engine oil <= MAX_ENGINEOILLEVEL : maximum , else engine oil should be moderate
     */ 
    protected String getEngineOilLevel() throws MyException{
       return (getEngineOil() <= MIN_ENGINEOILLEVEL)? "low" : ((getEngineOil() == MAX_ENGINEOILLEVEL)? "maximum level" : "moderate");
    }
    
    /**
     * This method returns minimum engineOilLevel of a engine
     * 
     * @return the minimum engineOilLevel of a engine
     */
    protected int getMIN_ENGINEOILLEVEL(){
        return MIN_ENGINEOILLEVEL;
    }
    
    /**
     * This method returns maximum engineOilLevel of a engine
     * 
     * @return the maximum engineOilLevel of a engine
     */
    protected int getMAX_ENGINEOILLEVEL(){
        return MAX_ENGINEOILLEVEL;
    }

}
