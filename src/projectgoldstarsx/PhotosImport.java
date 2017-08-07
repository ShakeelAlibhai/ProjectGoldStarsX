package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class PhotosImport
{
    public PhotosImport()
    {
        importPhotos();
    }
    
    private void importPhotos()
    {
        String output;
        Object[] options = {".jpg", ".png"};
        output = "First, place the photo that you want to import in the folder that Project GoldStars X is in.\n"
                + "Now, please choose whether the photo is a .jpg file or a .png file.";
        String type = (String)JOptionPane.showInputDialog(null, output, "Import Photos", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(type == null)
        {
            return;
        }
        output = "Next, please enter the name of the file (case sensitive):";
        String temp = JOptionPane.showInputDialog(null, output, "Import Photos", JOptionPane.QUESTION_MESSAGE);
        ProjectGoldStarsX.photoNames.add(temp + type);
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.photosFolder, "photo" + (ProjectGoldStarsX.photoNames.size() - 1) + ".txt");
            out = new PrintWriter(file);
            out.println(ProjectGoldStarsX.photoNames.get(ProjectGoldStarsX.photoNames.size() - 1));
            out.close();
        }
        catch(FileNotFoundException e2)
        {

        }
        Photos.viewPhotosFrame.close();
        new Photos();
    }
}