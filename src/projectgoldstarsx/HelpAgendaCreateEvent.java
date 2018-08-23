package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpAgendaCreateEvent
{
    public HelpAgendaCreateEvent()
    {
        helpLanguage();
    }
    
    private void helpLanguage()
    {
        InformationWindow helpWindow = new InformationWindow("Create an Event");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "To create an event, you can open the Agenda and then click the \"Create an Event\" button. Then fill out the year, month, "
                + "date, and event fields, and then press the \"Create\" button or press Enter to save the event!\n\n"
                + "Note: Make sure that you use numbers to represent the month in the month field. Also, please enter the year in "
                + "a 4-digit format (ie. \"2018\" as opposed to \"18\").\n\n"
                + "Tip: You can also launch the window to create an event by typing \"create an event\" in Search, Talk, or Commands, "
                + "or from the \"Actions\" section of the Menu on the main menu bar!";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}