package car;

/**
 *This method inherits the constructor class of Exception 
 * which will throws message if an error occur
 * @author sahil verma
 */
public class MyException extends Exception{
    
    public MyException(String message)
    {
        super(message);
    }
}
