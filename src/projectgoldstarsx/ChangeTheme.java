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
        themeFrame.setLayout(new GridLayout(10, 1));
        themeFrame.setJMenuBar(menuBar());
        themeFrame.add(darkTheme());
        themeFrame.add(fireTheme());
        themeFrame.add(forestTheme());
        themeFrame.add(grassTheme());
        themeFrame.add(mountainTheme());
        themeFrame.add(skyTheme());
        themeFrame.add(snowTheme());
        themeFrame.add(waterTheme());
        themeFrame.add(projectGoldStarsXTheme());
        themeFrame.add(solidColor());
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
        JLabel instructionsLabel = new JLabel("Please choose a theme:");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        return instructionsLabel;
    }
    
    private JButton darkTheme()
    {
        JButton darkTheme = new JButton("Dark");
        darkTheme.setFont(ProjectGoldStarsX.mediumText2);
        darkTheme.setBackground(Color.black);
        darkTheme.setForeground(Color.lightGray);
        darkTheme.addActionListener(new ListenersThemes.DarkThemeListener());
        return darkTheme;
    }
    
    private JButton fireTheme()
    {
        JButton fireTheme = new JButton("Fire");
        fireTheme.setFont(ProjectGoldStarsX.mediumText2);
        fireTheme.setBackground(Color.red);
        fireTheme.setForeground(Color.yellow);
        fireTheme.addActionListener(new ListenersThemes.FireThemeListener());
        return fireTheme;
    }
    
    private JButton forestTheme()
    {
        JButton forestTheme = new JButton("Forest");
        forestTheme.setFont(ProjectGoldStarsX.mediumText2);
        forestTheme.setBackground(new Color(0x00, 0x80, 0x00));
        forestTheme.setForeground(Color.white);
        forestTheme.addActionListener(new ListenersThemes.ForestThemeListener());
        return forestTheme;
    }
    
    private JButton grassTheme()
    {
        JButton grassTheme = new JButton("Grass");
        grassTheme.setFont(ProjectGoldStarsX.mediumText2);
        grassTheme.setBackground(Color.green);
        grassTheme.setForeground(new Color(0x00, 0x80, 0x00));
        grassTheme.addActionListener(new ListenersThemes.GrassThemeListener());
        return grassTheme;
    }
    
    private JButton mountainTheme()
    {
        JButton mountainTheme = new JButton("Mountain");
        mountainTheme.setFont(ProjectGoldStarsX.mediumText2);
        mountainTheme.setBackground(Color.darkGray);
        mountainTheme.setForeground(Color.white);
        mountainTheme.addActionListener(new ListenersThemes.MountainThemeListener());
        return mountainTheme;
    }
    
    private JButton skyTheme()
    {
        JButton skyTheme = new JButton("Sky");
        skyTheme.setFont(ProjectGoldStarsX.mediumText2);
        skyTheme.setBackground(Color.white);
        skyTheme.setForeground(Color.blue);
        skyTheme.addActionListener(new ListenersThemes.SkyThemeListener());
        return skyTheme;
    }
    
    private JButton snowTheme()
    {
        JButton snowTheme = new JButton("Snow");
        snowTheme.setFont(ProjectGoldStarsX.mediumText2);
        snowTheme.setBackground(Color.white);
        snowTheme.setForeground(Color.gray);
        snowTheme.addActionListener(new ListenersThemes.SnowThemeListener());
        return snowTheme;
    }
    
    private JButton waterTheme()
    {
        JButton waterTheme = new JButton("Water");
        waterTheme.setFont(ProjectGoldStarsX.mediumText2);
        waterTheme.setBackground(new Color(0x00, 0x00, 0xC0));
        waterTheme.setForeground(Color.green);
        waterTheme.addActionListener(new ListenersThemes.WaterThemeListener());
        return waterTheme;
    }
    
    private JButton projectGoldStarsXTheme()
    {
        JButton projectGoldStarsXTheme = new JButton("Project GoldStars X (Default Theme)");
        projectGoldStarsXTheme.setFont(ProjectGoldStarsX.mediumText2);
        projectGoldStarsXTheme.setBackground(Color.cyan);
        projectGoldStarsXTheme.setForeground(Color.blue);
        projectGoldStarsXTheme.addActionListener(new ListenersThemes.ProjectGoldStarsXThemeListener());
        return projectGoldStarsXTheme;
    }
    
    private JButton solidColor()
    {
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
        return solidColor;
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