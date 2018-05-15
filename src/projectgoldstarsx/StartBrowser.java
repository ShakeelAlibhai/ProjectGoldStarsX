package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartBrowser
{
    public StartBrowser()
    {
        getHomepage();
    }
    
    /*
     * Attempt to import the saved homepage from the Browser folder.
     * If nothing has been saved, Project GoldStars X will use http://google.com as the homepage and save this to the Browser folder.
     */
    private void getHomepage()
    {
        File homepageTemp = new File(ProjectGoldStarsX.BROWSER_FOLDER, "homepage.txt");
        try
        {
            Scanner s1 = new Scanner(homepageTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.homepage = s1.next();
            s1.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsX.homepage = "http://google.com";
            File file = new File(ProjectGoldStarsX.BROWSER_FOLDER, "homepage.txt");
            PrintWriter out;
            try
            {
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.homepage);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
}