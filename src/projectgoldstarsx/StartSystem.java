package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartSystem
{
    public StartSystem()
    {
        new StartMenuBar();
        getLanguage();
        getLocation();
        getTheme();
        getUsername();
        getNickname();
    }
    
    /*
     * Attempt to import the saved language choice from the System folder.
     * If nothing has been saved, Project GoldStars X will use American English and save this to the System folder.
     * American English is designated as "1" in Project GoldStars X.
     */
    private static void getLanguage()
    {
        File languageTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "language.txt");
        try
        {
            Scanner s4 = new Scanner(languageTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.language = s4.next();
            s4.close();
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "language.txt");
            ProjectGoldStarsX.language = "1";
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.language);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
    
    /*
     * Attempt to import the saved location choice from the System folder.
     * If nothing has been saved, Project GoldStars X will use the "Other/I don't want to say" choice and save this to the System folder.
     */
    private static void getLocation()
    {
        File locationTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "location.txt");
        try
        {
            Scanner newS = new Scanner(locationTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.location = newS.next();
            newS.close();
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "location.txt");
            ProjectGoldStarsX.location = "Other/I don't want to say";
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.location);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
    
    /*
     * Attempt to import the saved theme choice from the System folder.
     * If nothing has been saved, Project GoldStars X will use the "Project GoldStars X" theme and save this to the System folder.
     */
    private static void getTheme()
    {
        File themeTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "theme.txt");
        try
        {
            Scanner s15 = new Scanner(themeTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.theme = s15.next();
            s15.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.theme = "Project GoldStars X";
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "theme.txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
        File colorTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "color.txt");
        try
        {
            Scanner s16 = new Scanner(colorTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.color = s16.next();
            s16.close();
        }
        catch(FileNotFoundException e)
        {
            
        }
    }
    
    //Attempt to import the saved username of the user from the System folder.
    private static void getUsername()
    {
        File usernameTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "username.txt");
        try
        {
            Scanner s12 = new Scanner(usernameTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.username = s12.next();
            s12.close();
        }
        catch(FileNotFoundException e)
        {
            
        }
    }
    
    /*
     * Attempt to import the saved nickname of the user from the System folder.
     * If nothing has been saved, the user's username will be used as the "nickname."
     */
    private static void getNickname()
    {
        File nicknameTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "nickname.txt");
        try
        {
            Scanner s13 = new Scanner(nicknameTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.nickname = s13.next();
            s13.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.nickname = ProjectGoldStarsX.username;
        }
    }
}