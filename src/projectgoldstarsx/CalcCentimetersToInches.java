package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToInches
{
    public CalcCentimetersToInches()
    {
        centimetersToInches();
    }
    
    private void centimetersToInches()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Inches", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.39370079;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Inches";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Inches", JOptionPane.INFORMATION_MESSAGE);
    }
}