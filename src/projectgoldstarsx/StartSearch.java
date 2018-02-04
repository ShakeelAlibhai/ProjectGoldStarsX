package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartSearch
{
    public StartSearch()
    {
        getSearchCaseSensitivitySetting();
    }
    
    /*
     * Attempt to import the saved choice of whether Search is case-sensitive from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for Search and save this to the Project GoldStars X folder.
     */
    private static void getSearchCaseSensitivitySetting()
    {
        File scsTemp = new File(ProjectGoldStarsX.SEARCH_FOLDER, "searchCaseSensitive.txt");
        try
        {
            Scanner s9 = new Scanner(scsTemp).useDelimiter("\\Z");
            String temp = s9.next();
            s9.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.searchCaseSensitive = true;
            }
            else
            {
                ProjectGoldStarsX.searchCaseSensitive = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.SEARCH_FOLDER, "searchCaseSensitive.txt");
            ProjectGoldStarsX.searchCaseSensitive = false;
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