package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcFeetToMiles
{
    public CalcFeetToMiles()
    {
        feetToMiles();
    }
    
    private void feetToMiles()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of feet:", "Feet to Miles", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.00018939;
        output = firstNumber + " Feet =\n" + secondNumber + " Miles";
        JOptionPane.showMessageDialog(null, output, "Feet to Miles", JOptionPane.INFORMATION_MESSAGE);
    }
}