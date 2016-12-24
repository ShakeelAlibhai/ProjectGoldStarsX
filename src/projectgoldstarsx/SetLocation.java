package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class SetLocation
{
    public SetLocation()
    {
        setLocation();
    }
    
    private void setLocation()
    {
        Object[] options = new Object[]
        {
            "North America", "South America", "Europe", "Africa",
            "The Middle East", "Asia", "Oceania", "Other/I don't want to say"
        };
        String output = "Which of the following best describes your location?";
        String tempLocation = (String)JOptionPane.showInputDialog(null, output, "Set Location", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(tempLocation == null)
        {
            return;
        }
        else
        {
            ProjectGoldStarsX.location = tempLocation;
            //Save the location to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "location.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.location);
                out.close();
            }
            catch(FileNotFoundException e)
            {
                
            }
        }
        output = "Location saved!";
        JOptionPane.showMessageDialog(null, output, "Set Location", JOptionPane.INFORMATION_MESSAGE);
    }
}