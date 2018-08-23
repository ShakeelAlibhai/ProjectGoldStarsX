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
        this.add(new StandardMenuItem("About", new ListenersProgramsAction.AboutListener()));
        this.add(new StandardMenuItem("Help", new ListenersProgramsAction.HelpListener()));
        this.add(new StandardMenuItem("Notifications", new ListenersProgramsAction.NotificationsListener()));
        this.add(new StandardMenuItem("Settings", new ListenersProgramsAction.SettingsListener()));
        this.add(new JSeparator());
        this.add(new StandardMenuItem("Exit Project GoldStars X", new ExitListener()));
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