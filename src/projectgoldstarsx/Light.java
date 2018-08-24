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
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(new StandardButton("Blue", new ListenersLight.BlueListener()));
        menuBar.add(new StandardButton("Cyan", new ListenersLight.CyanListener()));
        menuBar.add(new StandardButton("Dark Green", new ListenersLight.DarkGreenListener()));
        menuBar.add(new StandardButton("Gray", new ListenersLight.GrayListener()));
        menuBar.add(new StandardButton("Green", new ListenersLight.GreenListener()));
        menuBar.add(new StandardButton("Light Gray", new ListenersLight.LightGrayListener()));
        menuBar.add(new StandardButton("Light Red", new ListenersLight.LightRedListener()));
        menuBar.add(new StandardButton("Orange", new ListenersLight.OrangeListener()));
        menuBar.add(new StandardButton("Pink", new ListenersLight.PinkListener()));
        menuBar.add(new StandardButton("Red", new ListenersLight.RedListener()));
        menuBar.add(new StandardButton("Turquoise", new ListenersLight.TurquoiseListener()));
        menuBar.add(new StandardButton("White", new ListenersLight.WhiteListener()));
        menuBar.add(new StandardButton("Yellow", new ListenersLight.YellowListener()));
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