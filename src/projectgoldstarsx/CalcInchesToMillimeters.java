package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToMillimeters
{
    public CalcInchesToMillimeters()
    {
        inchesToMillimeters();
    }
    
    private void inchesToMillimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Millimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 25.4;
        output = firstNumber + " Inches =\n" + secondNumber + " Millimeters";
        JOptionPane.showMessageDialog(null, output, "Inches to Millimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}