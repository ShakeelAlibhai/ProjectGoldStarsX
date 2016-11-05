package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
public class CurrentSettings
{
    public static JInternalFrame currentSettingsFrame;
    
    public CurrentSettings()
    {
        currentSettings();
    }
    
    private void currentSettings()
    {
        currentSettingsFrame = new JInternalFrame("Current Settings");
        ProjectGoldStarsX.desktop.add(currentSettingsFrame);
        currentSettingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        currentSettingsFrame.setLayout(new GridLayout(1, 2));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        currentSettingsFrame.setJMenuBar(menuBar());
        JTextArea generalSettingsTextArea = new JTextArea();
        generalSettingsTextArea.setEditable(false);
        generalSettingsTextArea.setFont(ProjectGoldStarsX.bodyText1);
        String output;
        if("1".equals(ProjectGoldStarsX.language))
        {
            output = "Language: American English\n";
        }
        else
        {
            output = "Language: British English\n";
        }
        output += "Theme: " + ProjectGoldStarsX.theme + "\n";
        output += "Username: " + ProjectGoldStarsX.username + "\n";
        output += "Location: " + ProjectGoldStarsX.location + "\n";
        generalSettingsTextArea.setText(output);
        currentSettingsFrame.add(generalSettingsTextArea);
        JTextArea appSettingsTextArea = new JTextArea();
        appSettingsTextArea.setFont(ProjectGoldStarsX.bodyText1);
        output = "Calendar Format: " + ProjectGoldStarsX.calendarFormat + "\n";
        if(ProjectGoldStarsX.notesSearchCaseSensitive)
        {
            output += "Notes Search Case Sensitive: On\n";
        }
        else
        {
            output += "Notes Search Case Sensitive: Off\n";
        }
        if(ProjectGoldStarsX.passwordProtectedNotes)
        {
            output += "Password-Protected Notes: On\n";
        }
        else
        {
            output += "Password-Protected Notes: Off\n";
        }
        if(ProjectGoldStarsX.photosSearchCaseSensitive)
        {
            output += "Photos Search Case Sensitive: On\n";
        }
        else
        {
            output += "Photos Search Case Sensitive: Off\n";
        }
        if(ProjectGoldStarsX.passwordProtectedPhotos)
        {
            output += "Password-Protected Photos: On\n";
        }
        else
        {
            output += "Password-Protected Photos: Off\n";
        }
        output += "Talk Nickname: " + ProjectGoldStarsX.nickname + "\n";
        if(ProjectGoldStarsX.searchCaseSensitive)
        {
            output += "Search Case Sensitive: On\n";
        }
        else
        {
            output += "Search Case Sensitive: Off\n";
        }
        if(ProjectGoldStarsX.errorLogSearchCaseSensitive)
        {
            output += "Error Log Search Case Sensitive: On";
        }
        else
        {
            output += "Error Log Search Case Sensitive: Off";
        }
        appSettingsTextArea.setText(output);
        currentSettingsFrame.add(appSettingsTextArea);
        currentSettingsFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        return menuBar;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            currentSettingsFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(currentSettingsFrame);
        }
    }
}