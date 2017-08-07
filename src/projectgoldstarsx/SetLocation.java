package projectgoldstarsx;
import java.awt.GridLayout;
public class SetLocation
{
    public static ProgramWindow themeFrame;
    
    public SetLocation()
    {
        setLocation();
    }
    
    private void setLocation()
    {
        themeFrame = new ProgramWindow("Set Location");
        themeFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        themeFrame.setLayout(new GridLayout(8, 1));
        themeFrame.setInstructionsMenuBar("Which of the following best describes your location?");
        themeFrame.add(Components.standardButton("North America", new ListenersLocations.NorthAmericaListener()));
        themeFrame.add(Components.standardButton("South America", new ListenersLocations.SouthAmericaListener()));
        themeFrame.add(Components.standardButton("Europe", new ListenersLocations.EuropeListener()));
        themeFrame.add(Components.standardButton("Africa", new ListenersLocations.AfricaListener()));
        themeFrame.add(Components.standardButton("The Middle East", new ListenersLocations.TheMiddleEastListener()));
        themeFrame.add(Components.standardButton("Asia", new ListenersLocations.AsiaListener()));
        themeFrame.add(Components.standardButton("Oceania", new ListenersLocations.OceaniaListener()));
        themeFrame.add(Components.standardButton("Other/I don't want to say", new ListenersLocations.OtherListener()));
        themeFrame.makeVisible();
    }
}