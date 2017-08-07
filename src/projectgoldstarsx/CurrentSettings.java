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
        output = "Language: " + language() + "\n";
        output += "Theme: " + ProjectGoldStarsX.theme + "\n";
        output += "Username: " + ProjectGoldStarsX.username + "\n";
        output += "Location: " + ProjectGoldStarsX.location + "\n";
        output += "Settings Button on the Main Menu Bar: " + settingsButtonMainMenuBar();
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        output = "Calendar Format: " + ProjectGoldStarsX.calendarFormat + "\n";
        output += "Notes Search Case Sensitive: " + notesSearchCaseSensitive() + "\n";
        output += "Photos Search Case Sensitive: " + photosSearchCaseSensitive() + "\n";
        output += "Talk Nickname: " + ProjectGoldStarsX.nickname + "\n";
        output += "Search Case Sensitive: " + searchCaseSensitive() + "\n";
        output += "Error Log Search Case Sensitive: " + errorLogSearchCaseSensitive();
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
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
    
    private String notesSearchCaseSensitive()
    {
        if(ProjectGoldStarsX.notesSearchCaseSensitive)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }
    
    private String photosSearchCaseSensitive()
    {
        if(ProjectGoldStarsX.photosSearchCaseSensitive)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }
    
    private String searchCaseSensitive()
    {
        if(ProjectGoldStarsX.searchCaseSensitive)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }
    
    private String errorLogSearchCaseSensitive()
    {
        if(ProjectGoldStarsX.errorLogSearchCaseSensitive)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }
}