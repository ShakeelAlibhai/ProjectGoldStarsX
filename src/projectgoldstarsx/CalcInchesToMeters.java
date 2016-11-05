package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToMeters
{
    public CalcInchesToMeters()
    {
        inchesToMeters();
    }
    
    private void inchesToMeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Meters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.0254;
        output = firstNumber + " Inches =\n" + secondNumber + " Meters";
        JOptionPane.showMessageDialog(null, output, "Inches to Meters", JOptionPane.INFORMATION_MESSAGE);
    }
}