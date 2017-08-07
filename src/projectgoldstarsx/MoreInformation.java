package projectgoldstarsx;
import java.awt.GridLayout;
public class MoreInformation
{
    public MoreInformation()
    {
        moreInformation();
    }
    
    private void moreInformation()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("More Information");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(900 * ProjectGoldStarsX.multiplier, 500 * ProjectGoldStarsX.multiplier);
        String output = "Screen Resolution: " + ProjectGoldStarsX.width + "x" + ProjectGoldStarsX.height + "\n"
                + "Time Project GoldStars X Last Started: " + ProjectGoldStarsX.startDate.toString();
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}