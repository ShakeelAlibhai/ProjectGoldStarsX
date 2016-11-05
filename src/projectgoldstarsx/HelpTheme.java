package projectgoldstarsx;
import javax.swing.JOptionPane;
public class HelpTheme
{
    public HelpTheme()
    {
        helpTheme();
    }
    
    private void helpTheme()
    {
        String output;
        if("1".equals(ProjectGoldStarsX.language))
        {
        output = "You can customize Project GoldStars X by changing the theme.\n"
                + "Changing the theme will change the color(s) on the home screen of Project GoldStars X and in some apps.\n"
                + "To change the theme, go to Settings > Change Theme.\n"
                + "You can then click on a theme, or you can click Solid Color to just choose a background color instead.\n"
                + "You will have to restart Project GoldStars X after choosing a theme or color for the change to take place.";
        JOptionPane.showMessageDialog(null, output, "Change the Theme", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            output = "You can customise Project GoldStars X by changing the theme.\n"
                + "Changing the theme will change the colour(s) on the home screen of Project GoldStars X and in some apps.\n"
                + "To change the theme, go to Settings > Change Theme.\n"
                + "You can then click on a theme, or you can click Solid Colour to just choose a background colour instead.\n"
                + "You will have to restart Project GoldStars X after choosing a theme or colour for the change to take place.";
        JOptionPane.showMessageDialog(null, output, "Change the Theme", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}