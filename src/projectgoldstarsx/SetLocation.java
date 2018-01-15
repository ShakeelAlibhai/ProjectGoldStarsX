package projectgoldstarsx;
import java.awt.GridLayout;
public class SetLocation
{
    public static ProgramWindow locationFrame;
    
    public SetLocation()
    {
        setLocation();
    }
    
    private void setLocation()
    {
        locationFrame = new ProgramWindow("Set Location");
        locationFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        locationFrame.setLayout(new GridLayout(8, 1));
        locationFrame.setInstructionsMenuBar("Which of the following best describes your location?");
        locationFrame.add(Components.standardButton("North America", new ListenersLocations.NorthAmericaListener()));
        locationFrame.add(Components.standardButton("South America", new ListenersLocations.SouthAmericaListener()));
        locationFrame.add(Components.standardButton("Europe", new ListenersLocations.EuropeListener()));
        locationFrame.add(Components.standardButton("Africa", new ListenersLocations.AfricaListener()));
        locationFrame.add(Components.standardButton("The Middle East", new ListenersLocations.TheMiddleEastListener()));
        locationFrame.add(Components.standardButton("Asia", new ListenersLocations.AsiaListener()));
        locationFrame.add(Components.standardButton("Oceania", new ListenersLocations.OceaniaListener()));
        locationFrame.add(Components.standardButton("Other/I don't want to say", new ListenersLocations.OtherListener()));
        locationFrame.makeVisible();
    }
}