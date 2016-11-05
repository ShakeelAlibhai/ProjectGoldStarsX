package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcCubeRoot
{
    public CalcCubeRoot()
    {
        cubeRoot();
    }
    
    private void cubeRoot()
    {
        String output;
        double cbrt;
        output = JOptionPane.showInputDialog(null, "Please enter the number to find the cube root of: ", "Cube Root", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            cbrt = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator");
            JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cbrt < 0)
        {
            ProjectGoldStarsX.errors.add("Error: Calculator\n"
                    + "Error Description: Tried to find the cube root of a negative number.");
            output = "ERROR:\n"
                    + "The cube root of a negative number is not a real number.";
            JOptionPane.showMessageDialog(null, output, "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        output = "The cube root of " + cbrt + " is: " + Math.cbrt(cbrt);
        JOptionPane.showMessageDialog(null, output, "Cube Root", JOptionPane.INFORMATION_MESSAGE);
    }
}