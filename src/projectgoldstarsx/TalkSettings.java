package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class TalkSettings
{
    public TalkSettings()
    {
        talkSettings();
    }
    
    private void talkSettings()
    {
        String tempNickname = JOptionPane.showInputDialog(null, "What would you like Talk to call you?", "Talk Settings", JOptionPane.QUESTION_MESSAGE);
        if(tempNickname == null)
        {
            return;
        }
        else
        {
            ProjectGoldStarsX.nickname = tempNickname;
            //Save the nickname to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "nickname.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.nickname);
                out.close();
            }
            catch(FileNotFoundException e)
            {
                
            }
        }
        String output = "Nickname updated!";
        JOptionPane.showMessageDialog(null, output, "Talk Settings", JOptionPane.INFORMATION_MESSAGE);
    }
}