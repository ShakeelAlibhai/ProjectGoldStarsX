package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToKilometers
{
    public CalcCentimetersToKilometers()
    {
        centimetersToKilometers();
    }
    
    private void centimetersToKilometers()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Kilometers", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            firstNumber = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator");
            JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        secondNumber = firstNumber * 0.00001;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Kilometers";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Kilometers", JOptionPane.INFORMATION_MESSAGE);
    }
}