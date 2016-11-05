package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCelsiusToFahrenheit
{
    public CalcCelsiusToFahrenheit()
    {
        calcCelsiusToFahrenheit();
    }
    
    private void calcCelsiusToFahrenheit()
    {
        double startingTemp = 0;
        double newTemp;
        //Ask the user to enter the temperature in degrees Celsius.
        //The temperature in degrees Celsius is stored as a String.
        String temp = "Please enter the temperature in degrees Celsius:";
        String output = JOptionPane.showInputDialog(null, temp, "Celsius to Fahrenheit", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the temperature in degrees Celsius from a String to a Double.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            startingTemp = Double.parseDouble(output);
        }
        catch(Exception e)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator");
            JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        newTemp = startingTemp * 9;
        newTemp = newTemp / 5;
        newTemp = newTemp + 32;
        output = startingTemp + " degrees Celsius = " + newTemp + " degrees Fahrenheit";
        JOptionPane.showMessageDialog(null, output, "Celsius to Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
    }
}