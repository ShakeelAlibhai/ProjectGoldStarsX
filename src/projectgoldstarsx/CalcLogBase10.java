package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcLogBase10
{
    public CalcLogBase10()
    {
        logBase10();
    }
    
    private void logBase10()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number to find the log base 10 of:", "Log Base 10", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = Math.log10(firstNumber);
        output = "The log base 10 of " + firstNumber + " is: " + secondNumber;
        JOptionPane.showMessageDialog(null, output, "Log Base 10", JOptionPane.INFORMATION_MESSAGE);
    }
}