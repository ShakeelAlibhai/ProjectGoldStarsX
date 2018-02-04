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
        InformationWindow currentSettingsFrame = new InformationWindow("Commands");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Commands is like Talk without the conversation part and with a different interface.\n"
                + "You can type a command of something you would like to happen to Project GoldStars X.\n"
                + "For example, you can try typing 'multiply 2 numbers' or 'view notes' in Commands.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}