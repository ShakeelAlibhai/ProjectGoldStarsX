package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToMillimeters
{
    public CalcMetersToMillimeters()
    {
        metersToMillimeters();
    }
    
    private void metersToMillimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Millimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 1000;
        output = firstNumber + " Meters =\n" + secondNumber + " Millimeters";
        JOptionPane.showMessageDialog(null, output, "Meters to Millimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}