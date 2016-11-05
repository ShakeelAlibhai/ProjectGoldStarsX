package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToYards
{
    public CalcMetersToYards()
    {
        metersToYards();
    }
    
    private void metersToYards()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Yards", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 1.0936133;
        output = firstNumber + " Meters =\n" + secondNumber + " Yards";
        JOptionPane.showMessageDialog(null, output, "Meters to Yards", JOptionPane.INFORMATION_MESSAGE);
    }
}