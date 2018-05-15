package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartMenuBar
{
    public StartMenuBar()
    {
        getSettingsButtonMainMenuBar();
    }
    
    /*
     * Attempt to import the saved Settings button on the main menu bar choice from the Menu Bar folder folder.
     * If nothing has been saved, Project GoldStars X will use turn off this option and save this to the Menu Bar folder.
     */
    private static void getSettingsButtonMainMenuBar()
    {
        File languageTemp = new File(ProjectGoldStarsX.MENU_BAR_FOLDER, "settingsButtonMainMenuBar.txt");
        try
        {
            Scanner s4 = new Scanner(languageTemp).useDelimiter("\\Z");
            String temp = s4.next();
            s4.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.settingsButtonMainMenuBar = true;
            }
            else
            {
                ProjectGoldStarsX.settingsButtonMainMenuBar = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.MENU_BAR_FOLDER, "settingsButtonMainMenuBar.txt");
            ProjectGoldStarsX.settingsButtonMainMenuBar = false;
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println("0");
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
}