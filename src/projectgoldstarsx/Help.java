package projectgoldstarsx;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class Help
{
    public static ProgramWindow helpFrame;
    
    public Help()
    {
        help();
    }
    
    private void help()
    {
        helpFrame = new ProgramWindow("Help");
        helpFrame.setSize(1300 * ProjectGoldStarsX.multiplier, 725 * ProjectGoldStarsX.multiplier);
        helpFrame.setLayout(new GridLayout(4, 4));
        helpFrame.setJMenuBar(menuBar());
        helpFrame.add(Components.headerLabel("Agenda:"));
        helpFrame.add(Components.actionLabel("Create an Event", new ListenersHelpMouse.AgendaCreateEventListener()));
        helpFrame.add(Components.actionLabel("View Events", new ListenersHelpMouse.AgendaViewEventsListener()));
        helpFrame.add(new JLabel());
        if("1".equals(ProjectGoldStarsX.language))
        {
            helpFrame.add(Components.headerLabel("Customize Project GoldStars X:"));
        }
        else
        {
            helpFrame.add(Components.headerLabel("Customise Project GoldStars X:"));
        }
        helpFrame.add(Components.actionLabel("Change the Language", new ListenersHelpMouse.LanguageListener()));
        helpFrame.add(Components.actionLabel("Change the Theme", new ListenersHelpMouse.ThemeListener()));
        helpFrame.add(Components.actionLabel("Set a Location", new ListenersHelpMouse.LocationListener()));
        helpFrame.add(Components.headerLabel("Talk:"));
        helpFrame.add(Components.actionLabel("What is Talk?", new ListenersHelpMouse.TalkIntroListener()));
        helpFrame.add(Components.actionLabel("What can I say to Talk?", new ListenersHelpMouse.TalkSuggestionsListener()));
        helpFrame.add(Components.actionLabel("Set a Nickname", new ListenersHelpMouse.NicknameListener()));
        helpFrame.add(Components.headerLabel("Advanced Tools:"));
        helpFrame.add(Components.actionLabel("The Error Log", new ListenersHelpMouse.ErrorsLogListener()));
        helpFrame.add(Components.actionLabel("Commands", new ListenersHelpMouse.CommandsListener()));
        helpFrame.makeVisible();
    }
    
    //Returns the JMenuBar that will be added to the ProgramWindow
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(helpFrame.getCloseButton());
        menuBar.add(helpFrame.getMaximizeButton());
        menuBar.add(helpFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Troubleshoot Problems", new ListenersHelpAction.TroubleshootProblemsListener()));
        return menuBar;
    }
}