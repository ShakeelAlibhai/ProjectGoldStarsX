package projectgoldstarsx;
import java.awt.GridLayout;
public class TroubleshootProblems
{
    public TroubleshootProblems()
    {
        troubleshootProblems();
    }
    
    private void troubleshootProblems()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("Troubleshoot Problems");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(900 * ProjectGoldStarsX.multiplier, 500 * ProjectGoldStarsX.multiplier);
        String output = "If you encounter a problem in Project GoldStars X, there are 2 options that you can take.\n"
                + "OPTION 1: RESTART PROJECT GOLDSTARS X\n"
                + "Sometimes, a quick restart of Project GoldStars X can solve the problem!\n"
                + "OPTION 2: CHECK THE ERROR LOG\n"
                + "You can check the Error Log to see where something went wrong.\n"
                + "Tip: If you know the program that the error occured in, you can search the Error Log for the name of that program.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}