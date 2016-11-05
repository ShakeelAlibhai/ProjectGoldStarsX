package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToMillimeters
{
    public CalcCentimetersToMillimeters()
    {
        centimetersToMillimeters();
    }
    
    private void centimetersToMillimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Millimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 10;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Millimeters";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Millimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}