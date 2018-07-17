package projectgoldstarsx;
import java.awt.GridLayout;
public class HelpTheme
{
    public HelpTheme()
    {
        helpTheme();
    }
    
    private void helpTheme()
    {
        InformationWindow helpWindow = new InformationWindow("About Calendar");
        helpWindow.setLayout(new GridLayout(1, 1));
        helpWindow.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output;
        if("1".equals(ProjectGoldStarsX.language))
        {
            output = "You can customize Project GoldStars X by changing the theme.\n\n"
                    + "Changing the theme will change the color(s) on the home screen of Project GoldStars X and in many apps. "
                    + "Many themes also have wallpapers associated with them.\n\n"
                    + "To change the theme, go to Settings > Change Theme. "
                    + "You can then click on a theme, or you can click \"Solid Color\" to just choose a background color instead.\n\n"
                    + "Note: You will have to restart Project GoldStars X after choosing a theme or color for the change to take place.";
        }
        else
        {
            output = "You can customise Project GoldStars X by changing the theme.\n\n"
                    + "Changing the theme will change the colour(s) on the home screen of Project GoldStars X and in many apps. "
                    + "Many themes also have wallpapers associated with them.\n\n"
                    + "To change the theme, go to Settings > Change Theme. "
                    + "You can then click on a theme, or you can click \"Solid Colour\" to just choose a background colour instead.\n\n"
                    + "Note: You will have to restart Project GoldStars X after choosing a theme or colour for the change to take place.";
        }
        helpWindow.addText(ProjectGoldStarsX.bodyText1, output);
        helpWindow.makeVisible();
    }
}