package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartSystem
{
    public StartSystem()
    {
        getLanguage();
        getLocation();
        getTheme();
        getUsername();
        getNickname();
    }
    
    /*
     * Attempt to import the saved language choice from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will use American English and save this to the Project GoldStars X folder.
     * American English is designated as "1" in Project GoldStars X.
     */
    private static void getLanguage()
    {
        File languageTemp = new File(ProjectGoldStarsX.systemFolder, "language.txt");
        try
        {
            Scanner s4 = new Scanner(languageTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.language = s4.next();
            s4.close();
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.systemFolder, "language.txt");
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
     * Attempt to import the saved location choice from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will use the "Other/I don't want to say" choice and save this to the Project GoldStars X folder.
     */
    private static void getLocation()
    {
        File locationTemp = new File(ProjectGoldStarsX.systemFolder, "location.txt");
        try
        {
            Scanner newS = new Scanner(locationTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.location = newS.next();
            newS.close();
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.systemFolder, "location.txt");
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
     * Attempt to import the saved theme choice from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will use the "Project GoldStars X" theme and save this to the Project GoldStars X folder.
     */
    private static void getTheme()
    {
        File themeTemp = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
        try
        {
            Scanner s15 = new Scanner(themeTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.theme = s15.next();
            s15.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.theme = "Snow";
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
        File colorTemp = new File(ProjectGoldStarsX.systemFolder, "color.txt");
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
    
    //Attempt to import the saved username of the user from the Project GoldStars X folder.
    private static void getUsername()
    {
        File usernameTemp = new File(ProjectGoldStarsX.systemFolder, "username.txt");
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
     * Attempt to import the saved nickname of the user from the Project GoldStars X folder.
     * If nothing has been saved, the user's username will be used as the "nickname."
     */
    private static void getNickname()
    {
        File nicknameTemp = new File(ProjectGoldStarsX.systemFolder, "nickname.txt");
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