package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToFeet
{
    public CalcCentimetersToFeet()
    {
        centimetersToFeet();
    }
    
    private void centimetersToFeet()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Feet", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.0328084;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Feet";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Feet", JOptionPane.INFORMATION_MESSAGE);
    }
}