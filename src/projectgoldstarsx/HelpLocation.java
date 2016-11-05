package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpLocation
{
    public HelpLocation()
    {
        helpLocation();
    }
    
    private void helpLocation()
    {
        String output = "You can set your location from Settings > Set Location.\n"
                + "Setting a location is optional. If you don't want to set your location, you can choose the 'Other/I don't want to say'\n"
                + "option in the Set Location section of Settings.";
        JOptionPane.showMessageDialog(null, output, "Set a Location", JOptionPane.INFORMATION_MESSAGE);
    }
}