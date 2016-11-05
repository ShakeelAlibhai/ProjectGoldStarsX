package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcExponents
{
    public CalcExponents()
    {
        exponent();
    }
    
    private void exponent()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number that will be raised to a power:", "Exponents", JOptionPane.QUESTION_MESSAGE);
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
        String output2 = "Please enter the number of the power to raise " + firstNumber + " to: ";
        output = JOptionPane.showInputDialog(null, output2, "Exponents", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            secondNumber = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator");
            JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        output = firstNumber + " ^ " + secondNumber + " = " + Math.pow(firstNumber,secondNumber);
        JOptionPane.showMessageDialog(null, output, "Exponents", JOptionPane.INFORMATION_MESSAGE);
    }
}