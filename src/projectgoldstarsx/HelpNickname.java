package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpNickname
{
    public HelpNickname()
    {
        helpNickname();
    }
    
    private void helpNickname()
    {
        InformationWindow helpWindow = new InformationWindow("Set a Nickname");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "From Talk Settings, you can choose a nickname for Talk to call you.\n"
                + "By default, Talk will call you by your username.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}