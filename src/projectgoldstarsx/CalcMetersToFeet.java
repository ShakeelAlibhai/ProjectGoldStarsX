package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToFeet
{
    public CalcMetersToFeet()
    {
        metersToFeet();
    }
    
    private void metersToFeet()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Feet", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 3.2808399;
        output = firstNumber + " Meters =\n" + secondNumber + " Feet";
        JOptionPane.showMessageDialog(null, output, "Meters to Feet", JOptionPane.INFORMATION_MESSAGE);
    }
}