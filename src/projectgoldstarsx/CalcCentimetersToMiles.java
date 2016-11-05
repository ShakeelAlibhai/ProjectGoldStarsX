package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCentimetersToMiles
{
    public CalcCentimetersToMiles()
    {
        centimetersToMiles();
    }
    
    private void centimetersToMiles()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of centimeters:", "Centimeters to Miles", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.00000621;
        output = firstNumber + " Centimeters =\n" + secondNumber + " Miles";
        JOptionPane.showMessageDialog(null, output, "Centimeters to Miles", JOptionPane.INFORMATION_MESSAGE);
    }
}