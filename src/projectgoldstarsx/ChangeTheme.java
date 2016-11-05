package projectgoldstarsx;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class ChangeTheme
{
    public static boolean continueColorChange = true;
    public static String output;
    public static JInternalFrame themeFrame;
    
    public ChangeTheme()
    {
        changeTheme();
    }
    
    private void changeTheme()
    {
        themeFrame = new JInternalFrame("Settings");
        ProjectGoldStarsX.desktop.add(themeFrame);
        themeFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        themeFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        themeFrame.setLayout(new GridLayout(11, 1));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        JLabel instructionsLabel = new JLabel("Please choose a theme:");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        menuBar.add(instructionsLabel);
        themeFrame.setJMenuBar(menuBar);
        JButton fireTheme = new JButton("Fire");
        fireTheme.setFont(ProjectGoldStarsX.mediumText2);
        fireTheme.setBackground(Color.red);
        fireTheme.setForeground(Color.yellow);
        fireTheme.addActionListener(new ListenersThemes.FireThemeListener());
        themeFrame.add(fireTheme);
        JButton forestTheme = new JButton("Forest");
        forestTheme.setFont(ProjectGoldStarsX.mediumText2);
        forestTheme.setBackground(new Color(0x00, 0x80, 0x00));
        forestTheme.setForeground(Color.white);
        forestTheme.addActionListener(new ListenersThemes.ForestThemeListener());
        themeFrame.add(forestTheme);
        JButton grassTheme = new JButton("Grass");
        grassTheme.setFont(ProjectGoldStarsX.mediumText2);
        grassTheme.setBackground(Color.green);
        grassTheme.setForeground(new Color(0x00, 0x80, 0x00));
        grassTheme.addActionListener(new ListenersThemes.GrassThemeListener());
        themeFrame.add(grassTheme);
        JButton mountainTheme = new JButton("Mountain");
        mountainTheme.setFont(ProjectGoldStarsX.mediumText2);
        mountainTheme.setBackground(Color.darkGray);
        mountainTheme.setForeground(Color.white);
        mountainTheme.addActionListener(new ListenersThemes.MountainThemeListener());
        themeFrame.add(mountainTheme);
        JButton skyTheme = new JButton("Sky");
        skyTheme.setFont(ProjectGoldStarsX.mediumText2);
        skyTheme.setBackground(Color.white);
        skyTheme.setForeground(Color.blue);
        skyTheme.addActionListener(new ListenersThemes.SkyThemeListener());
        themeFrame.add(skyTheme);
        JButton snowTheme = new JButton("Snow");
        snowTheme.setFont(ProjectGoldStarsX.mediumText2);
        snowTheme.setBackground(Color.cyan);
        snowTheme.setForeground(Color.blue);
        snowTheme.addActionListener(new ListenersThemes.SnowThemeListener());
        themeFrame.add(snowTheme);
        JButton snow2Theme = new JButton("Snow 2");
        snow2Theme.setFont(ProjectGoldStarsX.mediumText2);
        snow2Theme.setBackground(Color.white);
        snow2Theme.setForeground(Color.gray);
        snow2Theme.addActionListener(new ListenersThemes.Snow2ThemeListener());
        themeFrame.add(snow2Theme);
        JButton snowDarkTheme = new JButton("Snow (Dark)");
        snowDarkTheme.setFont(ProjectGoldStarsX.mediumText2);
        snowDarkTheme.setBackground(Color.black);
        snowDarkTheme.setForeground(Color.cyan);
        snowDarkTheme.addActionListener(new ListenersThemes.SnowDarkThemeListener());
        themeFrame.add(snowDarkTheme);
        JButton snow2DarkTheme = new JButton("Snow 2 (Dark)");
        snow2DarkTheme.setFont(ProjectGoldStarsX.mediumText2);
        snow2DarkTheme.setBackground(Color.black);
        snow2DarkTheme.setForeground(Color.lightGray);
        snow2DarkTheme.addActionListener(new ListenersThemes.Snow2DarkThemeListener());
        themeFrame.add(snow2DarkTheme);
        JButton waterTheme = new JButton("Water");
        waterTheme.setFont(ProjectGoldStarsX.mediumText2);
        waterTheme.setBackground(new Color(0x00, 0x00, 0xC0));
        waterTheme.setForeground(Color.green);
        waterTheme.addActionListener(new ListenersThemes.WaterThemeListener());
        themeFrame.add(waterTheme);
        JButton solidColor;
        if("1".equals(ProjectGoldStarsX.language))
        {
            solidColor = new JButton("Solid Color");
        }
        else
        {
            solidColor = new JButton("Solid Colour");
        }
        solidColor.setFont(ProjectGoldStarsX.mediumText2);
        solidColor.setBackground(Color.white);
        solidColor.setForeground(Color.black);
        solidColor.addActionListener(new ListenersThemes.SolidColorListener());
        themeFrame.add(solidColor);
        themeFrame.setVisible(true);
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