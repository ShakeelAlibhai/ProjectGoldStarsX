package projectgoldstarsx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ChangeLanguage
{
    public ChangeLanguage()
    {
        changeLanguage();
    }
    
    private boolean changeLanguage()
    {
        String output;
        try
        {
            output = "";
            if("1".equals(ProjectGoldStarsX.language))
            {
                output += "The current language is American English.\n";
            }
            else
            {
                output += "The current language is British English.\n";
            }
            output += "Please choose a language:";
            Object[] options = {"American English", "British English"};
            String choice = (String)JOptionPane.showInputDialog(null, output, "Change Language", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(choice == null)
            {
                return false;
            }
            switch(choice)
            {
                case "American English": default:
                {
                    ProjectGoldStarsX.language = "1";
                    output = "Language set to American English.";
                    JOptionPane.showMessageDialog(null, output, "Change Language", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                case "British English":
                {
                    ProjectGoldStarsX.language = "2";
                    output = "Language set to British English.";
                    JOptionPane.showMessageDialog(null, output, "Change Language", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            //Save the language choice to the user's Snow OS folder.
            File languageTemp = new File(ProjectGoldStarsX.systemFolder, "language.txt");
            PrintWriter out;
            try
            {
                out = new PrintWriter(languageTemp);
                out.append(ProjectGoldStarsX.language);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            return true;
        }
        catch(Exception error)
        {
            return false;
        }
    }
}