package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpLocation
{
    public HelpLocation()
    {
        helpLocation();
    }
    
    private void helpLocation()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("Set a Location");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can set your location from Settings > Set Location.\n"
                + "Setting a location is optional. If you don't want to set your location, you can choose the\n"
                + "\"Other/I don't want to say\" option in the \"Set Location\" section of Settings.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}