package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToKilometers
{
    public CalcMetersToKilometers()
    {
        metersToKilometers();
    }
    
    private void metersToKilometers()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Kilometers", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.001;
        output = firstNumber + " Meters =\n" + secondNumber + " Kilometers";
        JOptionPane.showMessageDialog(null, output, "Meters to Kilometers", JOptionPane.INFORMATION_MESSAGE);
    }
}