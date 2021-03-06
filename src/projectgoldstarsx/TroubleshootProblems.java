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
        String output = "If you encounter a problem in Project GoldStars X, there are a few options that you can take.\n"
                + "\n"
                + "OPTION 1: RESTART PROJECT GOLDSTARS X\n"
                + "Sometimes, a quick restart of Project GoldStars X can solve the problem!\n"
                + "\n"
                + "OPTION 2: CHECK THE ERROR LOG\n"
                + "You can check the Error Log to see where something went wrong.\n"
                + "Tip: If you know the program that the error occured in, you can search the Error Log for the name of that program.\n"
                + "\n"
                + "OPTION 3: RESET PROJECT GOLDSTARS X\n"
                + "You can reset Project GoldStars X by going to your home folder and deleting the folder named \"Project GoldStars X.\"\n"
                + "WARNING: Doing this will delete all your Project GoldStars X data and reset all your Project GoldStars X settings!";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}