package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToYards
{
    public CalcInchesToYards()
    {
        inchesToYards();
    }
    
    private void inchesToYards()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Yards", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber / 36;
        output = firstNumber + " Inches =\n" + secondNumber + " Yards";
        JOptionPane.showMessageDialog(null, output, "Inches to Yards", JOptionPane.INFORMATION_MESSAGE);
    }
}