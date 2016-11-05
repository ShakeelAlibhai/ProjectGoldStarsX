package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartErrorLog
{
    public StartErrorLog()
    {
        getErrorLogSearchCaseSensitivitySetting();
    }
    
    /*
     * Attempt to import the saved choice of whether the Error Log Search is case-sensitive from the Error Log folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for the Error Log Search and save this to the Error Log folder.
     */
    private static void getErrorLogSearchCaseSensitivitySetting()
    {
        File elscsTemp = new File(ProjectGoldStarsX.errorLogFolder, "errorLogSearchCaseSensitive.txt");
        try
        {
            Scanner s10 = new Scanner(elscsTemp).useDelimiter("\\Z");
            String temp = s10.next();
            s10.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.errorLogSearchCaseSensitive = true;
            }
            else
            {
                ProjectGoldStarsX.errorLogSearchCaseSensitive = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.errorLogFolder, "errorLogSearchCaseSensitive.txt");
            ProjectGoldStarsX.errorLogSearchCaseSensitive = false;
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