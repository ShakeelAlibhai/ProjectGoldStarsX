package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpLanguage
{
    public HelpLanguage()
    {
        helpLanguage();
    }
    
    private void helpLanguage()
    {
        String output = "You can change the language of Project GoldStars X from Settings > Change Language.\n"
                + "You can choose between American English and British English.\n"
                + "Note: The language change is not guaranteed to take place in every part of Project GoldStars X.";
        JOptionPane.showMessageDialog(null, output, "Change the Language", JOptionPane.INFORMATION_MESSAGE);
    }
}