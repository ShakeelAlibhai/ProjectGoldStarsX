package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
public class CurrentSettings
{
    static ProgramWindow currentSettingsFrame;
    
    public CurrentSettings()
    {
        currentSettings();
    }
    
    private void currentSettings()
    {
        currentSettingsFrame = new ProgramWindow("Current Settings");
        currentSettingsFrame.setLayout(new GridLayout(1, 2));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        currentSettingsFrame.setJMenuBar(menuBar());
        String output;
        output = "Language: " + language() + "\n";
        output += "Theme: " + ProjectGoldStarsX.theme + "\n";
        output += "Username: " + ProjectGoldStarsX.username + "\n";
        output += "Location: " + ProjectGoldStarsX.location + "\n";
        output += "Settings Button on the Main Menu Bar: " + settingsButtonMainMenuBar();
        JTextArea textArea1 = new JTextArea(output);
        textArea1.setEditable(false);
        textArea1.setFont(ProjectGoldStarsX.bodyText1);
        currentSettingsFrame.add(textArea1);
        output = "Date Format: " + ProjectGoldStarsX.dateFormat + "\n";
        output += "Notes Search Case Sensitive: " + (ProjectGoldStarsX.notesSearchCaseSensitive ? "On" : "Off") + "\n";
        output += "Photos Search Case Sensitive: " + (ProjectGoldStarsX.photosSearchCaseSensitive ? "On" : "Off") + "\n";
        output += "Talk Nickname: " + ProjectGoldStarsX.nickname + "\n";
        output += "Search Case Sensitive: " + (ProjectGoldStarsX.searchCaseSensitive ? "On" : "Off") + "\n";
        output += "Error Log Search Case Sensitive: " + (ProjectGoldStarsX.errorLogSearchCaseSensitive ? "On" : "Off");
        JTextArea textArea2 = new JTextArea(output);
        textArea2.setEditable(false);
        textArea2.setFont(ProjectGoldStarsX.bodyText1);
        currentSettingsFrame.add(textArea2);
        currentSettingsFrame.add(textArea2);
        currentSettingsFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(currentSettingsFrame.getCloseButton());
        menuBar.add(currentSettingsFrame.getMaximizeButton());
        menuBar.add(currentSettingsFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Refresh", new RefreshListener()));
        return menuBar;
    }
    
    private String language()
    {
        if("1".equals(ProjectGoldStarsX.language))
        {
            return "American English";
        }
        else
        {
            return "British English";
        }
    }
    
    private String settingsButtonMainMenuBar()
    {
        if("1".equals(ProjectGoldStarsX.settingsButtonMainMenuBar))
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }
    
    public static class RefreshListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            currentSettingsFrame.dispose();
            new CurrentSettings();
        }
    }
}