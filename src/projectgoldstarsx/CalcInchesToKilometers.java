package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToKilometers
{
    public CalcInchesToKilometers()
    {
        inchesToKilometers();
    }
    
    private void inchesToKilometers()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Kilometers", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.0000254;
        output = firstNumber + " Inches =\n" + secondNumber + " Kilometers";
        JOptionPane.showMessageDialog(null, output, "Inches to Kilometers", JOptionPane.INFORMATION_MESSAGE);
    }
}