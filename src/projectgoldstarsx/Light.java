package projectgoldstarsx;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
public class Light
{
    public Light(Color c)
    {
        closeOldLightFrame();
        light(c);
    }
    
    public Light()
    {
        closeOldLightFrame();
        light(Color.yellow);
    }
    
    private static JInternalFrame lightFrame;
    
    private void light(Color color)
    {
        lightFrame = new JInternalFrame("Light");
        ProjectGoldStarsX.desktop.add(lightFrame);
        lightFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        lightFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(lightFrame);
        lightFrame.getContentPane().setBackground(color);
        lightFrame.setJMenuBar(menuBar());
        lightFrame.setResizable(true);
        lightFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.standardButton("Blue", new ListenersLight.BlueListener()));
        menuBar.add(Components.standardButton("Cyan", new ListenersLight.CyanListener()));
        menuBar.add(Components.standardButton("Dark Green", new ListenersLight.DarkGreenListener()));
        menuBar.add(Components.standardButton("Gray", new ListenersLight.GrayListener()));
        menuBar.add(Components.standardButton("Green", new ListenersLight.GreenListener()));
        menuBar.add(Components.standardButton("Light Gray", new ListenersLight.LightGrayListener()));
        menuBar.add(Components.standardButton("Light Red", new ListenersLight.LightRedListener()));
        menuBar.add(Components.standardButton("Orange", new ListenersLight.OrangeListener()));
        menuBar.add(Components.standardButton("Pink", new ListenersLight.PinkListener()));
        menuBar.add(Components.standardButton("Red", new ListenersLight.RedListener()));
        menuBar.add(Components.standardButton("Turquoise", new ListenersLight.TurquoiseListener()));
        menuBar.add(Components.standardButton("White", new ListenersLight.WhiteListener()));
        menuBar.add(Components.standardButton("Yellow", new ListenersLight.YellowListener()));
        return menuBar;
    }
    
    private void closeOldLightFrame()
    {
        try
        {
            lightFrame.dispose();
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            lightFrame.dispose();
        }
    }
}