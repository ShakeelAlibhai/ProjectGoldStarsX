package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToKilometers
{
    public CalcFeetToKilometers()
    {
        feetToKilometers();
    }
    
    private void feetToKilometers()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Kilometers", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.0003048;
        output = firstNumber + " Feet =\n" + secondNumber + " Kilometers";
        JOptionPane.showMessageDialog(null, output, "Feet to Kilometers", JOptionPane.INFORMATION_MESSAGE);
    }
}