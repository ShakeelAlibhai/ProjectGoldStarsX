package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcRadiansToDegrees
{
    public CalcRadiansToDegrees()
    {
        radiansToDegrees();
    }
    
    private void radiansToDegrees()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of radians:", "Radians to Degrees", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = Math.toDegrees(firstNumber);
        output = firstNumber + " Radians ≈\n" + secondNumber + " Degrees";
        JOptionPane.showMessageDialog(null, output, "Radians to Degrees", JOptionPane.INFORMATION_MESSAGE);
    }
}