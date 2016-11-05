package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpNickname
{
    public HelpNickname()
    {
        helpNickname();
    }
    
    private void helpNickname()
    {
        String output = "From Talk Settings, you can choose a nickname for Talk to call you.\n"
                + "By default, Talk will call you by your username.";
        JOptionPane.showMessageDialog(null, output, "Set a Nickname", JOptionPane.INFORMATION_MESSAGE);
    }
}