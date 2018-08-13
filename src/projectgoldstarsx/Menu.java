package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JSeparator;
public class Menu extends StandardMenu
{    
    public Menu()
    {
        super("Menu");
        this.add(menuWelcome());
        this.add(new JSeparator());
        this.add(new ActionsMenu());
        this.add(new ProgramsMenu());
        this.add(new JSeparator());
        this.add(Components.standardMenuItem("About", new ListenersProgramsAction.AboutListener()));
        this.add(Components.standardMenuItem("Help", new ListenersProgramsAction.HelpListener()));
        this.add(Components.standardMenuItem("Notifications", new ListenersProgramsAction.NotificationsListener()));
        this.add(Components.standardMenuItem("Settings", new ListenersProgramsAction.SettingsListener()));
        this.add(new JSeparator());
        this.add(Components.standardMenuItem("Exit Project GoldStars X", new ExitListener()));
    }
    
    private JLabel menuWelcome()
    {
        JLabel welcomeLabel = new JLabel("Welcome, " + ProjectGoldStarsX.username + "!");
        welcomeLabel.setFont(ProjectGoldStarsX.mediumText3);
        return welcomeLabel;
    }
    
    public class ExitListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}