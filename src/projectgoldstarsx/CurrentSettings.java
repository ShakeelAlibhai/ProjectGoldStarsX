package projectgoldstarsx;
import java.awt.GridLayout;
public class CurrentSettings
{
    public CurrentSettings()
    {
        currentSettings();
    }
    
    private void currentSettings()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("Current Settings");
        currentSettingsFrame.setLayout(new GridLayout(1, 2));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
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
        if("1".equals(ProjectGoldStarsX.settingsButtonMainMenuBar))
        {
            output += "Settings Button on the Main Menu Bar: On\n";
        }
        else
        {
            output += "Settings Button on the Main Menu Bar: Off\n";
        }
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
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
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}