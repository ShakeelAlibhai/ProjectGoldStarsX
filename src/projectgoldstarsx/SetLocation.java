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
        locationFrame.add(new StandardButton("North America", new ListenersLocations.NorthAmericaListener()));
        locationFrame.add(new StandardButton("South America", new ListenersLocations.SouthAmericaListener()));
        locationFrame.add(new StandardButton("Europe", new ListenersLocations.EuropeListener()));
        locationFrame.add(new StandardButton("Africa", new ListenersLocations.AfricaListener()));
        locationFrame.add(new StandardButton("The Middle East", new ListenersLocations.TheMiddleEastListener()));
        locationFrame.add(new StandardButton("Asia", new ListenersLocations.AsiaListener()));
        locationFrame.add(new StandardButton("Oceania", new ListenersLocations.OceaniaListener()));
        locationFrame.add(new StandardButton("Other/I don't want to say", new ListenersLocations.OtherListener()));
        locationFrame.makeVisible();
    }
}