package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcMetersToMiles
{
    public CalcMetersToMiles()
    {
        metersToMiles();
    }
    
    private void metersToMiles()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of meters:", "Meters to Miles", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.00062137;
        output = firstNumber + " Meters =\n" + secondNumber + " Miles";
        JOptionPane.showMessageDialog(null, output, "Meters to Miles", JOptionPane.INFORMATION_MESSAGE);
    }
}