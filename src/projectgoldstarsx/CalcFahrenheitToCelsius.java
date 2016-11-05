package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFahrenheitToCelsius
{
    public CalcFahrenheitToCelsius()
    {
        calcFahrenheitToCelsius();
    }
    
    private void calcFahrenheitToCelsius()
    {
        double startingTemp = 0;
        double newTemp;
        //Ask the user to enter the temperature in degrees Fahrenheit.
        //The temperature in degrees Fahrenheit is stored as a String.
        String temp = "Please enter the temperature in degrees Fahrenheit:";
        String output = JOptionPane.showInputDialog(null, temp, "Fahrenheit to Celsius", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the temperature in degrees Fahrenheit from a String to a Double.
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
        newTemp = startingTemp - 32;
        newTemp = newTemp * 5;
        newTemp = newTemp / 9;
        output = startingTemp + " degrees Fahrenheit = " + newTemp + " degrees Celsius";
        JOptionPane.showMessageDialog(null, output, "Fahrenheit to Celsius", JOptionPane.INFORMATION_MESSAGE);
    }
}