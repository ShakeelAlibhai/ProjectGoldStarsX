package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcTangent
{
    public CalcTangent()
    {
        tangent();
    }
    
    private void tangent()
    {
        String output;
        double input;
        output = JOptionPane.showInputDialog(null, "Please enter the number of radians to find the tangent of:", "Tangent", JOptionPane.QUESTION_MESSAGE);
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
        double tangent = Math.tan(input);
        output = "The tangent of " + input + " radians is: " + tangent;
        JOptionPane.showMessageDialog(null, output, "Tangent", JOptionPane.INFORMATION_MESSAGE);
    }
}