package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpCommands
{
    public HelpCommands()
    {
        helpCommands();
    }
    
    private void helpCommands()
    {
        String output = "Commands is like Talk without the conversation part.\n"
                + "You can type a command of something you would like to happen to Project GoldStars X.\n"
                + "For example, you can try typing 'multiply 2 numbers' or 'view notes' in Commands.";
        JOptionPane.showMessageDialog(null, output, "Commands", JOptionPane.INFORMATION_MESSAGE);
    }
}