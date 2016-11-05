package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToMillimeters
{
    public CalcFeetToMillimeters()
    {
        feetToMillimeters();
    }
    
    private void feetToMillimeters()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Millimeters", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 304.8;
        output = firstNumber + " Feet =\n" + secondNumber + " Millimeters";
        JOptionPane.showMessageDialog(null, output, "Feet to Millimeters", JOptionPane.INFORMATION_MESSAGE);
    }
}