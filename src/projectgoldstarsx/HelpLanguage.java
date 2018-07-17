package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpLanguage
{
    public HelpLanguage()
    {
        helpLanguage();
    }
    
    private void helpLanguage()
    {
        InformationWindow helpWindow = new InformationWindow("Change the Language");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can change the language of Project GoldStars X in Settings > Change Language. "
                + "You can choose between American English and British English.\n\n"
                + "Note: The language change is not guaranteed to take place in every part of Project GoldStars X.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}