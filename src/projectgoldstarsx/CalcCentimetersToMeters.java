package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToMeters
{
    public CalcCentimetersToMeters()
    {
        centimetersToMeters();
    }
    
    private void centimetersToMeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Meters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.01;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Meters";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Meters", JOptionPane.INFORMATION_MESSAGE);
    }
}