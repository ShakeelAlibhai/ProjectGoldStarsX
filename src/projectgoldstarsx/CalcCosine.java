package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCosine
{
    public CalcCosine()
    {
        cosine();
    }
    
    private void cosine()
    {
        String output;
        double input;
        output = JOptionPane.showInputDialog(null, "Please enter the number of radians to find the cosine of:", "Cosine", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            input = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator");
            JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double cosine = Math.cos(input);
        output = "The cosine of " + input + " radians is: " + cosine;
        JOptionPane.showMessageDialog(null, output, "Cosine", JOptionPane.INFORMATION_MESSAGE);
    }
}