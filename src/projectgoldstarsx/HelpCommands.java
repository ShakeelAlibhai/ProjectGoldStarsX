package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpCommands
{
    public HelpCommands()
    {
        helpCommands();
    }
    
    private void helpCommands()
    {
        InformationWindow helpWindow = new InformationWindow("Commands");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Commands is like Talk with some differences; for example, Commands is not conversational "
                + "like Talk, and Commands has a different interface.\n\n"
                + "In Commands, you can type a command of something you would like to happen to Project GoldStars X. "
                + "For example, you can try typing \"multiply 2 numbers\" or \"view notes\" in Commands.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}