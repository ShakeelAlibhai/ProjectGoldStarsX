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
        InformationWindow helpWindow = new InformationWindow("The Error Log");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "The Error Log is a list of some or all of the errors that Project GoldStars X may have encountered\n"
                + "since the last time you started Project GoldStars X.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}