package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToInches
{
    public CalcMetersToInches()
    {
        metersToInches();
    }
    
    private void metersToInches()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Inches", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 39.3700787;
        output = firstNumber + " Meters =\n" + secondNumber + " Inches";
        JOptionPane.showMessageDialog(null, output, "Meters to Inches", JOptionPane.INFORMATION_MESSAGE);
    }
}