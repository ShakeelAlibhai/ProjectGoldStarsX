package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpTalkIntro
{
    public HelpTalkIntro()
    {
        helpTalkIntro();
    }
    
    private void helpTalkIntro()
    {
        String output = "Talk is a personal assistant.\n"
                + "You can have a conversation with Talk, or ask it to do stuff for you!\n"
                + "For more information on what you can say to Talk, see the 'What can I say to Talk?' section of Help.";
        JOptionPane.showMessageDialog(null, output, "What is Talk?", JOptionPane.INFORMATION_MESSAGE);
    }
}