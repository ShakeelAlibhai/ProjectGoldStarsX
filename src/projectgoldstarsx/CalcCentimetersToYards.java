package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToYards
{
    public CalcCentimetersToYards()
    {
        centimetersToYards();
    }
    
    private void centimetersToYards()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Yards", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.01093613;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Yards";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Yards", JOptionPane.INFORMATION_MESSAGE);
    }
}