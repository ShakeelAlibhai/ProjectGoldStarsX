package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToCentimeters
{
    public CalcMetersToCentimeters()
    {
        metersToCentimeters();
    }
    
    private void metersToCentimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Centimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 100;
        output = firstNumber + " Meters =\n" + secondNumber + " Centimeters";
        JOptionPane.showMessageDialog(null, output, "Meters to Centimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}