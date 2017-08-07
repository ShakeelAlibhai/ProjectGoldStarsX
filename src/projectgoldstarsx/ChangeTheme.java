package projectgoldstarsx;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
public class ChangeTheme
{
    public static boolean continueColorChange = true;
    public static ProgramWindow themeFrame;
    
    public ChangeTheme()
    {
        changeTheme();
    }
    
    private void changeTheme()
    {
        themeFrame = new ProgramWindow("Change Theme");
        themeFrame.setSize(900 * ProjectGoldStarsX.multiplier, 500 * ProjectGoldStarsX.multiplier);
        themeFrame.setLayout(new GridLayout(12, 1));
        themeFrame.setInstructionsMenuBar("Please choose a theme:");
        themeFrame.add(darkTheme());
        themeFrame.add(desertTheme());
        themeFrame.add(fireTheme());
        themeFrame.add(forestTheme());
        themeFrame.add(grassTheme());
        themeFrame.add(mountainTheme());
        themeFrame.add(silverTheme());
        themeFrame.add(skyTheme());
        themeFrame.add(snowTheme());
        themeFrame.add(waterTheme());
        themeFrame.add(projectGoldStarsXTheme());
        themeFrame.add(solidColor());
        themeFrame.makeVisible();
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
    
    private JButton desertTheme()
    {
        JButton darkTheme = new JButton("Desert");
        darkTheme.setFont(ProjectGoldStarsX.mediumText2);
        darkTheme.setBackground(new Color(255, 228, 181));
        darkTheme.setForeground(new Color(255, 69, 0));
        darkTheme.addActionListener(new ListenersThemes.DesertThemeListener());
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
    
    private JButton silverTheme()
    {
        JButton skyTheme = new JButton("Silver");
        skyTheme.setFont(ProjectGoldStarsX.mediumText2);
        skyTheme.setBackground(Color.lightGray);
        skyTheme.setForeground(Color.darkGray);
        skyTheme.addActionListener(new ListenersThemes.SilverThemeListener());
        return skyTheme;
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
        waterTheme.setBackground(new Color(64, 224, 208));
        waterTheme.setForeground(Color.blue);
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
}