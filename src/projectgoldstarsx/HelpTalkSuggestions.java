package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpTalkSuggestions
{
    public HelpTalkSuggestions()
    {
        helpTalkSuggestions();
    }
    
    private void helpTalkSuggestions()
    {
        String output = "In addition to having a conversation with Talk, you can ask Talk to do things for you.\n"
                + "For example, you can try asking Talk to 'add 2 numbers' or to 'open Stories.'";
        JOptionPane.showMessageDialog(null, output, "What can I say to Talk?", JOptionPane.INFORMATION_MESSAGE);
    }
}