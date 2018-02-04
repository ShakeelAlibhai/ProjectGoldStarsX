package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpTalkSuggestions
{
    public HelpTalkSuggestions()
    {
        helpTalkSuggestions();
    }
    
    private void helpTalkSuggestions()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("What can I say to Talk?");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "In addition to having a conversation with Talk, you can ask Talk to do things for you.\n"
                + "For example, you can try asking Talk to \"create a note\" or to \"open Stories.\"";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}