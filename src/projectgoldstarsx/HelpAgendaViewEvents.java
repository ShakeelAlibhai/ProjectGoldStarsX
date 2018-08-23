package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpAgendaViewEvents
{
    public HelpAgendaViewEvents()
    {
        helpLanguage();
    }
    
    private void helpLanguage()
    {
        InformationWindow helpWindow = new InformationWindow("View Events");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "To view events, you can go to Agenda and click the button to view events today or tomorrow. "
                + "You can also use the search bar in the Agenda window to search for events.\n\n"
                + "Tip: From the \"Actions\" section of the Menu on the main menu bar, you can go to Agenda "
                + "and then choose the options to view events today or tomorrow!";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}