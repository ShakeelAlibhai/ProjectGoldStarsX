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
        InformationWindow helpWindow = new InformationWindow("What can I say to Talk?");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "In addition to having a conversation with Talk, you can ask Talk to do things for you. "
                + "For example, you can try asking Talk to \"create a note\" or to \"open Stories.\"";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}