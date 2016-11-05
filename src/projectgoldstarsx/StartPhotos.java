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
        getPasswordProtectedPhotosSetting();
        getPhotosSearchCaseSensitivitySetting();
    }
    
    private static void getPhotos()
    {
        int photoNum = 0;
        while(photoNum != -1)
        {
            try
            {
                File file = new File(ProjectGoldStarsX.photosFolder, "photo" + photoNum + ".txt");
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
     * Attempt to import the saved choice of whether the password protection of photos is turned on or off from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off password protected photos and save this to the Project GoldStars X folder.
     */
    private static void getPasswordProtectedPhotosSetting()
    {
        File pppTemp = new File(ProjectGoldStarsX.photosFolder, "passwordProtectedPhotos.txt");
        try
        {
            Scanner s7 = new Scanner(pppTemp).useDelimiter("\\Z");
            String temp = s7.next();
            s7.close();
            if("1".equals(temp))
            {
                ProjectGoldStarsX.passwordProtectedPhotos = true;
            }
            else
            {
                ProjectGoldStarsX.passwordProtectedPhotos = false;
            }
        }
        catch(FileNotFoundException e)
        {
            File file = new File(ProjectGoldStarsX.photosFolder, "passwordProtectedPhotos.txt");
            ProjectGoldStarsX.passwordProtectedPhotos = false;
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
    
    /*
     * Attempt to import the saved choice of whether Photos Search is case-sensitive from the Project GoldStars X folder.
     * If nothing has been saved, Project GoldStars X will turn off case sensitivity for Photos Search and save this to the Project GoldStars X folder.
     */
    private static void getPhotosSearchCaseSensitivitySetting()
    {
        File pscsTemp = new File(ProjectGoldStarsX.photosFolder, "photosSearchCaseSensitive.txt");
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
            File file = new File(ProjectGoldStarsX.photosFolder, "photosSearchCaseSensitive.txt");
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