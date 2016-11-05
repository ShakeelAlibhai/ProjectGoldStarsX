package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcInchesToMiles
{
    public CalcInchesToMiles()
    {
        inchesToMiles();
    }
    
    private void inchesToMiles()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of inches:", "Inches to Miles", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = firstNumber * 0.00001578;
        output = firstNumber + " Inches =\n" + secondNumber + " Miles";
        JOptionPane.showMessageDialog(null, output, "Inches to Miles", JOptionPane.INFORMATION_MESSAGE);
    }
}