package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ChangeUsername
{
    public ChangeUsername()
    {
        changeUsername();
    }
    
    private void changeUsername()
    {
        String output;
        String oldUsername = ProjectGoldStarsX.username;
        try
        {
            ProjectGoldStarsX.username = JOptionPane.showInputDialog(null, "Your current username is: " + ProjectGoldStarsX.username + "\n"
                    + "Please enter your new username:", "Settings", JOptionPane.QUESTION_MESSAGE);
            if(ProjectGoldStarsX.username == null)
            {
                ProjectGoldStarsX.username = oldUsername;
                return;
            }
            while("".equals(ProjectGoldStarsX.username))
            {
                ProjectGoldStarsX.username = JOptionPane.showInputDialog(null, "ERROR:\n"
                        + "No Username Entered", "Settings", JOptionPane.QUESTION_MESSAGE);
            }
            output = "Congratulations! You have successfully changed your username from " + oldUsername + " to " + ProjectGoldStarsX.username + ".";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
            //Save the username to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "username.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.username);
                out.close();
            }
            catch(FileNotFoundException e)
            {

            }
        }
        catch(Exception error)
        {
            ProjectGoldStarsX.username = oldUsername;
            return;
        }
    }
}