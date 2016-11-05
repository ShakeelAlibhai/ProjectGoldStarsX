package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToMeters
{
    public CalcFeetToMeters()
    {
        feetToMeters();
    }
    
    private void feetToMeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Meters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.3048;
        output = firstNumber + " Feet =\n" + secondNumber + " Meters";
        JOptionPane.showMessageDialog(null, output, "Feet to Meters", JOptionPane.INFORMATION_MESSAGE);
    }
}