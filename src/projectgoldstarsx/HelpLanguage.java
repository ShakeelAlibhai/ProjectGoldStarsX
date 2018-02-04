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
        InformationWindow currentSettingsFrame = new InformationWindow("Change the Language");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can change the language of Project GoldStars X from Settings > Change Language.\n"
                + "You can choose between American English and British English.\n"
                + "Note: The language change is not guaranteed to take place in every part of Project GoldStars X.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}