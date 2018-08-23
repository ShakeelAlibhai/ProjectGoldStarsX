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
        InformationWindow helpWindow = new InformationWindow("Set a Location");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can set your location from Settings > Set Location.\n\n"
                + "Setting a location is optional. If you don't want to set your location, you can choose the "
                + "\"Other/I don't want to say\" option in the \"Set Location\" section of Settings.";
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}