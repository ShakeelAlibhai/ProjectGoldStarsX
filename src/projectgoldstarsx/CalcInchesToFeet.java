package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToFeet
{
    public CalcInchesToFeet()
    {
        inchesToFeet();
    }
    
    private void inchesToFeet()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Feet", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber / 12;
        output = firstNumber + " Inches =\n" + secondNumber + " Feet";
        JOptionPane.showMessageDialog(null, output, "Inches to Feet", JOptionPane.INFORMATION_MESSAGE);
    }
}