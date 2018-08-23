package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpTalkIntro
{
    public HelpTalkIntro()
    {
        helpTalkIntro();
    }
    
    private void helpTalkIntro()
    {
        InformationWindow helpWindow = new InformationWindow("What is Talk?");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Talk is a personal assistant. "
                + "You can have a conversation with Talk, or you can ask it to do stuff for you!\n\n"
                + "For more information on what you can say to Talk, see the \"What can I say to Talk?\" section of Help.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}