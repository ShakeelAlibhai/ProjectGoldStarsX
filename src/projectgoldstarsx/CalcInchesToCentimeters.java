package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToCentimeters
{
    public CalcInchesToCentimeters()
    {
        inchesToCentimeters();
    }
    
    private void inchesToCentimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Centimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 2.54;
        output = firstNumber + " Inches =\n" + secondNumber + " Centimeters";
        JOptionPane.showMessageDialog(null, output, "Inches to Centimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}