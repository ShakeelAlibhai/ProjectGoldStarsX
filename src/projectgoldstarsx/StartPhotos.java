package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StartPhotos
{
    public StartPhotos()
    {
        getPhotos();
        getPhotosSearchCaseSensitivitySetting();
    }
    
    private static void getPhotos()
    {
        int photoNum = 0;
        while(photoNum != -1)
        {
            try
            {
                File file = new File(ProjectGoldStarsX.PHOTOS_FOLDER, "photo" + photoNum + ".txt");
                ProjectGoldStarsX.photoNames.add(new Scanner(file).useDelimiter("\\Z").next());
                photoNum++;
            }
            catch(FileNotFoundException e)
            {
                photoNum = -1;
            }
        }
    }
    
    /*
     * Attempt to import the saved choice of whether Photos Search is case-sensitive from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for Photos Search and save this to the Project GoldStars X folder.
     */
    private static void getPhotosSearchCaseSensitivitySetting()
    {
        File pscsTemp = new File(ProjectGoldStarsX.PHOTOS_FOLDER, "photosSearchCaseSensitive.txt");
        try
        {
            Scanner s8 = new Scanner(pscsTemp).useDelimiter("\\Z");
            String temp = s8.next();
            s8.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.photosSearchCaseSensitive = true;
            }
            else
            {
                ProjectGoldStarsX.photosSearchCaseSensitive = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.PHOTOS_FOLDER, "photosSearchCaseSensitive.txt");
            ProjectGoldStarsX.photosSearchCaseSensitive = false;
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