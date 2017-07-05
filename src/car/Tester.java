package car;

/**
 * This class is designed to run/test the car
 *
 * @author sahil verma
 */
import java.lang.*;
import javax.swing.JOptionPane;

public class Tester {

    /**
     * @param args the command line arguments
     * @throws car.MyException
     */
    public static void main(String[] args) throws MyException {

        JOptionPane.showMessageDialog(null, " So, lets fill in some properties of car ");

        int MIN_ENGINEOILLEVEL = Integer.parseInt(JOptionPane.showInputDialog(" Minimum Engine oil level ?"));
        int MAX_ENGINEOILLEVEL = Integer.parseInt(JOptionPane.showInputDialog(" Maximum Engine oil level ?"));
        int engineOil = Integer.parseInt(JOptionPane.showInputDialog(" how much engine oil you want to fill in liters ?"));
        int MIN_GASLEVEL = Integer.parseInt(JOptionPane.showInputDialog(" Minimum gas level ?"));
        int MAX_GASLEVEL = Integer.parseInt(JOptionPane.showInputDialog(" Maximum gas level ?"));
        int gasLevel = Integer.parseInt(JOptionPane.showInputDialog(" how much gas level you want to fill in liters ?"));
        double distanceCovered = Integer.parseInt(JOptionPane.showInputDialog(" how much distance you want to cover in kilometers?"));
        int speed = Integer.parseInt(JOptionPane.showInputDialog(" at what speed you want to drive your car ?"));
        String currentGear = null;

        Car car1 = new Car(engineOil, MAX_ENGINEOILLEVEL, MIN_ENGINEOILLEVEL, gasLevel, MAX_GASLEVEL, MIN_GASLEVEL, currentGear, speed);

        String dName = JOptionPane.showInputDialog("What is the name of the driver ?");
        car1.setName(dName);
        JOptionPane.showMessageDialog(null, "Hello " + dName);

        String cName = JOptionPane.showInputDialog(dName + " which car you want to drive ?");
        JOptionPane.showMessageDialog(null, dName + " your car " + cName + " is ready for test drive");

        String stateOfPerson = JOptionPane.showInputDialog("Right now what is your state " + dName + ", are you in or outside the car:");
        car1.setPersonsState(stateOfPerson);

        JOptionPane.showMessageDialog(null, "state of doors " + ((car1.getStateOfDoors()) ? "close" : "open"));

        car1.setMIN_ENGINEOILLEVEL(MIN_ENGINEOILLEVEL);
        car1.setMAX_ENGINEOILLEVEL(MAX_ENGINEOILLEVEL);
        car1.setEngineOil(engineOil);

        String stateOfEngine = JOptionPane.showInputDialog("would you like to turn the engine on or off ?");
        car1.setStateOfEngine(stateOfEngine);

        car1.setMIN_GASLEVEL(MIN_GASLEVEL);
        car1.setMAX_GASLEVEL(MAX_GASLEVEL);
        car1.setGasLevel(gasLevel);

        car1.setDistance(distanceCovered);

        car1.setSpeed(speed);
        currentGear = JOptionPane.showInputDialog("In which gear would you like to drive the car ?");
        car1.setCurrentGear('N');

        String userInput = JOptionPane.showInputDialog("would you like to increase or decrease the speed ?");
        if (JOptionPane.showInputDialog("would you like to enter the speed yourself?").equalsIgnoreCase("no")) {
            if (userInput.equalsIgnoreCase("increase")) {
                car1.accerlate();
            } else {
                car1.decerlate();
            }
        } else {
            speed = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount by which to increase the speed?"));
            if (userInput.equalsIgnoreCase("increase")) {
                car1.accerlate(speed);
            } else {
                car1.decerlate(speed);
            }
        }

    }

}
