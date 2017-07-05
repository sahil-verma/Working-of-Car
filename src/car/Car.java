package car;

/**
 *This class defines the structure of a car 
 * @author sahil verma
 */
public class Car {

    //instance variables
    String name;//name of the driver
    private boolean carMoving;// state of the car
    private Body carBody;// state of the doors 
    private Engine carEngine;// state of the engine
    private GasTank carTank;// state of gas
    private Transmission carTransmission;// motion of the car
    private double distance = 0;// distamce tp be travelled by the car
    
    
    /**
     * Constructor to create objects of class car
     * 
     * @param engineOil
     *        to set the engine oil in the engine
     * @param MAX_ENGINEOILLEVEL
     *        to set the maximum engine oil level
     * @param MIN_ENGINEOILLEVEL
     *        to set the minimum engine oil level
     * @param gasLevel
     *        to set the gas level of the gas tank
     * @param MAX_GASLEVEL
     *        to set the maximum gas level of the gas tank
     * @param MIN_GASLEVEL
     *        to set the minimum gas level of the gas tank
     * @param currentGear
     *        to set the current gear of a car
     * @param speed
     *        to set the speed of a car
     * @throws car.MyException
     */
    public Car(int engineOil,int MAX_ENGINEOILLEVEL, int MIN_ENGINEOILLEVEL, int gasLevel, int MAX_GASLEVEL, int MIN_GASLEVEL, String currentGear, int speed) throws MyException {
        setCarMoving(false);
        carBody = new Body(this, "close", "in");
        carEngine = new Engine(this,"on", engineOil, MAX_ENGINEOILLEVEL, MIN_ENGINEOILLEVEL);
        carTank = new GasTank(this, gasLevel,  MAX_GASLEVEL, MIN_GASLEVEL);
        carTransmission = new Transmission(this, currentGear, speed);
    }
    
    /**
     * This method sets the name of a person
     * 
     * @param name
     *             to set the name of a person
     */
    public  void setName(String name){
        this.name = name;
    }
    
    /**
     * This method returns the name of the person
     * 
     * @return the name of the person
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method sets the motion of a car
     * 
     * @param carMoving 
     *             to set the motion of the car
     */
    public void setCarMoving(boolean carMoving) {
        this.carMoving = carMoving;
    }
    
    /**
     * This method returns the motion of the car
     * 
     * @return the motion of the car
     */
    protected boolean getCarMoving() {
        return carMoving;
    }
    
    /**
     * This method sets the state of a doors
     * 
     * @param stateOfDoors
     *             to set the state of the doors
     */
    public void setStateOfDoors(String stateOfDoors) throws MyException {
        carBody.setStateOfDoors(stateOfDoors);
    }
    
    /**
     * This method returns the state of the doors
     * 
     * @return the state of doors
     */
    public boolean getStateOfDoors() {
        return carBody.getStateOfDoors();
    }
    
    /**
     * This method sets the state of a person
     * 
     * @param personsState
     *             to set the state of the person
     * @throws car.MyException
     */
    public void setPersonsState(String personsState) throws MyException{
        carBody.setPersonsState(personsState);
    }
    
    /**
     * This method returns the state of the person
     * 
     * @return the state of person
     */
    public boolean getPersonsState() {
        return carBody.getPersonsState();
    }

    /**
     * This method sets the minimum oil level of the engine
     * 
     * @param MIN_ENGINEOILLEVEL
     *             to set the minimum oil level of the engine
     * @throws car.MyException
     */
    public void setMIN_ENGINEOILLEVEL(int MIN_ENGINEOILLEVEL) throws MyException{
        carEngine.setEngineOilLevel(MIN_ENGINEOILLEVEL);
    }
    
    /**
     * This method returns the minimum level of the engine
     * 
     * @return the minimum level of the engine
     */
    public int getMIN_ENGINEOILLEVEL() {
        return carEngine.getMIN_ENGINEOILLEVEL();
    }
    
    /**
     * This method sets the maximum oil level of the engine
     * 
     * @param MAX_ENGINEOILLEVEL
     *             to set the maximum oil level of the engine
     * @throws car.MyException
     */
    public void setMAX_ENGINEOILLEVEL(int MAX_ENGINEOILLEVEL) throws MyException{
        carEngine.setEngineOilLevel(MAX_ENGINEOILLEVEL);
    }
    
    /**
     * This method returns the maximum level of the engine
     * 
     * @return the maximum level of the engine
     */
    public int getMAX_ENGINEOILLEVEL() {
        return carEngine.getMAX_ENGINEOILLEVEL();
    }
    
    /**
     * This method sets the engine oil
     * 
     * @param engineOil
     *             to set the engine oil 
     * @throws car.MyException
     */
    public void setEngineOil(int engineOil) throws MyException{
        carEngine.setEngineOil(engineOil);
    }
    
    /**
     * This method returns the engine oil
     * 
     * @return the engine oil
     */
    public int getEngineOil() {
        return carEngine.getEngineOil();
    }
    
    /**
     * This method sets the state of engine
     * 
     * @param stateOfEngine
     *             to set the engine oil 
     * @throws car.MyException
     */
    public void setStateOfEngine(String stateOfEngine) throws MyException{
        carEngine.setStateOfEngine(stateOfEngine);
    }
    
    /**
     * This method returns the state of the engine 
     * 
     * @return the state of the engine 
     */
    public boolean getStateOfEngine(){
        return carEngine.getStateOfEngine();
    }   
    
    /**
     * This method sets the minimum level of the gas in a gas tank
     * 
     * @param MIN_GASLEVEL
     *             to set the minimum gas level of gas tank
     * @throws car.MyException
     */
    public void setMIN_GASLEVEL(int MIN_GASLEVEL) throws MyException{
        carTank.setStateOfGas(MIN_GASLEVEL);
    }
   
    /**
     * This method returns the minimum level of gas in a gas tank
     * 
     * @return the minimum level of gas in a gas tank 
     */
    public int getMIN_GASLEVEL() {
        return carTank.getMIN_GASLEVEL();
    }
    
    /**
     * This method sets the maximum level of the gas in a gas tank
     * 
     * @param MAX_GASLEVEL
     *             to set the maximum gas level of gas tank
     * @throws car.MyException
     */
    public void setMAX_GASLEVEL(int MAX_GASLEVEL) throws MyException{
        carTank.setStateOfGas(MAX_GASLEVEL);
    }
   
    /**
     * This method returns the maximum level of gas in a gas tank
     * 
     * @return the maximum level of gas in a gas tank 
     */
    public int getMAX_GASLEVEL() {
        return carTank.getMAX_GASLEVEL();
    }
    
    /**
     * This method sets the level of the gas in a gas tank
     * 
     * @param gasLevel
     *             to set the gas level of gas tank in a gas tank
     * @throws car.MyException
     */
    public void setGasLevel(int gasLevel) throws MyException{
        carTank.setGasLevel(gasLevel);
    }
    
    /**
     * This method returns the level of gas in a gas tank
     * 
     * @return the level of gas in a gas tank 
     */
    public int getGasLevell() {
        return carTank.getGasLevel();
    }
    
    /**
     * This method sets the distance to be traveled by the car
     * 
     * @param distance
     *             to set the distance to be traveled by the car
     * @throws car.MyException
     */
    public  void setDistance(double distance){
        this.distance = distance;
    }
   
    /**
     * This method returns the distance to be traveled by the car
     * 
     * @return the distance to be traveled by the car 
     */
    public double getDistance(){
        return distance;
    }
    
    /**
     * This method sets the gear of a car
     * 
     * @param gear
     *             to set the gear of a car
     * @throws car.MyException
     */
    public void setCurrentGear(char gear) throws MyException{
        carTransmission.setCurrentGear(gear);
    }
    
    /**
     * This method returns the current gear of a car
     * 
     * @return the current gear of a car
     */
    public String getCurrrentGear(){
        return carTransmission.getGear();
    }
    
    /**
     * This method sets the speed of a car
     * 
     * @param speed
     *             to set the speed of a car
     * @throws car.MyException
     */
    public void setSpeed(int speed) throws MyException{
        carTransmission.setSpeed(speed);
    }
    
    /**
     * This method returns the speed of a car
     * 
     * @return the speed of a car
     */
    public int getSpeed(){
        return carTransmission.getSpeed();
    }
    
    /**
     * This method accerlate the car
     * 
     */
    public void accerlate(){
        carTransmission.accelerate();
    }
    
    /**
     * This method changes the speed of a car
     * 
     * @param speedChange
     *             to change the speed of a car
     */
    public void accerlate(int speedChange){
        carTransmission.accelerate(speedChange);
    }
    
    /**
     * This method decerlate the car
     * 
     */
    public void decerlate(){
        carTransmission.decelerate();
    }
    
    /**
     * This method changes the speed of a car
     * 
     * @param speedChange
     *             to change the speed of a car
     */
    public void decerlate(int speedChange){
        carTransmission.decelerate(speedChange);
    }
}
  