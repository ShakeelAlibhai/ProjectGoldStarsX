package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToYards
{
    public CalcFeetToYards()
    {
        feetToYards();
    }
    
    private void feetToYards()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Yards", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber / 3;
        output = firstNumber + " Feet =\n" + secondNumber + " Yards";
        JOptionPane.showMessageDialog(null, output, "Feet to Yards", JOptionPane.INFORMATION_MESSAGE);
    }
}