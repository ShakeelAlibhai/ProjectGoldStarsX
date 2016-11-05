package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToCentimeters
{
    public CalcFeetToCentimeters()
    {
        feetToCentimeters();
    }
    
    private void feetToCentimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Centimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 30.48;
        output = firstNumber + " Feet =\n" + secondNumber + " Centimeters";
        JOptionPane.showMessageDialog(null, output, "Feet to Centimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}