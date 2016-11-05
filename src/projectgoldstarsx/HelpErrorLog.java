package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpErrorLog
{
    public HelpErrorLog()
    {
        helpErrorLog();
    }
    
    private void helpErrorLog()
    {
        String output = "The Error Log is a list of some or all of the errors that Project GoldStars X may have encountered\n"
                + "since the last time you started Project GoldStars X.\n"
                + "There are few different ways to view errors in the Error Log:\n"
                + "1. Snow Menu > All Programs > Error Log; or\n"
                + "2. Click 'View Reported Errors' in System Information; or\n"
                + "3. Search for errors in the Project GoldStars X search box; or\n"
                + "4. Type 'error' in Talk; or\n"
                + "5. Type 'error' in Commands.\n"
                + "It is also possible to search the Error Log.";
        JOptionPane.showMessageDialog(null, output, "The Error Log", JOptionPane.INFORMATION_MESSAGE);
    }
}