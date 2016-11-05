package projectgoldstarsx;
import javax.swing.JOptionPane;
public class ErrorLog
{
    public ErrorLog()
    {
        errorLog();
    }
    
    private void errorLog()
    {
        String output;
        int errorLogChoice;
        //Display a message if no errors have been reported yet.
        if(ProjectGoldStarsX.errors.isEmpty())
        {
            output = "There are currently no errors reported!";
            JOptionPane.showMessageDialog(null, output, "Error Log", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else if(ProjectGoldStarsX.errors.size() == 1)
        {
            output = JOptionPane.showInputDialog(ProjectGoldStarsX.errors.size() + " error has been reported.\n"
                + "Please enter the number of the error you would like to see.");
        }
        else
        {
            output = JOptionPane.showInputDialog(ProjectGoldStarsX.errors.size() + " errors have been reported.\n"
                + "Please enter the number of the error you would like to see.");
        }
        if(("0".equals(output)) || (output == null))
        {
            return;
        }
        output = output.toLowerCase();
        try
        {
            errorLogChoice = Integer.parseInt(output);
            output = ProjectGoldStarsX.errors.get(errorLogChoice - 1);
            JOptionPane.showMessageDialog(null, output, "Error Log", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.errors.add("Error: Error Log");
            JOptionPane.showMessageDialog(null, "ERROR", "Error Log", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}