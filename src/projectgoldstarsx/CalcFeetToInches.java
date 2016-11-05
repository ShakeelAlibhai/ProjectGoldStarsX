package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToInches
{
    public CalcFeetToInches()
    {
        feetToInches();
    }
    
    private void feetToInches()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Inches", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 12;
        output = firstNumber + " Feet =\n" + secondNumber + " Inches";
        JOptionPane.showMessageDialog(null, output, "Feet to Inches", JOptionPane.INFORMATION_MESSAGE);
    }
}