package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class SetLocation
{
    public static JInternalFrame themeFrame;
    
    public SetLocation()
    {
        setLocation();
    }
    
    private void setLocation()
    {
        themeFrame = new JInternalFrame("Set Location");
        ProjectGoldStarsX.desktop.add(themeFrame);
        themeFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        themeFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        themeFrame.setLayout(new GridLayout(8, 1));
        themeFrame.setJMenuBar(menuBar());
        themeFrame.add(Components.standardButton("North America", new ListenersLocations.NorthAmericaListener()));
        themeFrame.add(Components.standardButton("South America", new ListenersLocations.SouthAmericaListener()));
        themeFrame.add(Components.standardButton("Europe", new ListenersLocations.EuropeListener()));
        themeFrame.add(Components.standardButton("Africa", new ListenersLocations.AfricaListener()));
        themeFrame.add(Components.standardButton("The Middle East", new ListenersLocations.TheMiddleEastListener()));
        themeFrame.add(Components.standardButton("Asia", new ListenersLocations.AsiaListener()));
        themeFrame.add(Components.standardButton("Oceania", new ListenersLocations.OceaniaListener()));
        themeFrame.add(Components.standardButton("Other/I don't want to say", new ListenersLocations.OtherListener()));
        themeFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(instructionsLabel());
        return menuBar;
    }
    
    private JLabel instructionsLabel()
    {
        JLabel instructionsLabel = new JLabel("Which of the following best describes your location?");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        return instructionsLabel;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            themeFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(themeFrame);
        }
    }
}