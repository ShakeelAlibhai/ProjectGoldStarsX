package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpErrorLog
{
    public HelpErrorLog()
    {
        helpErrorLog();
    }
    
    private void helpErrorLog()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("The Error Log");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "The Error Log is a list of some or all of the errors that Project GoldStars X may have encountered\n"
                + "since the last time you started Project GoldStars X.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}