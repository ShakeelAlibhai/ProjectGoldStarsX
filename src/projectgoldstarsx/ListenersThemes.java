package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ListenersThemes
{
    public static class DarkThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Dark");
        }
    }
    
    public static class DesertThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Desert");
        }
    }
    
    public static class FireThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Fire");
        }
    }
    
    public static class ForestThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Forest");
        }
    }
    
    public static class GrassThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Grass");
        }
    }

    public static class MountainThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Mountain");
        }
    }
    
    public static class SilverThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Silver");
        }
    }
    
    public static class SkyThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Sky");
        }
    }
    
    public static class SnowThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Snow");
        }
    }
    
    public static class WaterThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Water");
        }
    }
    
    public static class ProjectGoldStarsXThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Project GoldStars X");
        }
    }
    
    public static class SolidColorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(changeBackgroundColor())
            {
                processThemeChoice("Solid Color");
            }
        }
    }
    
    private static void processThemeChoice(String themeName)
    {
        ProjectGoldStarsX.theme = themeName;
        //Save the theme to the user's Project GoldStars X folder.
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "theme.txt");
            out = new PrintWriter(file);
            out.append(ProjectGoldStarsX.theme);
            out.close();
        }
        catch(FileNotFoundException e2)
        {

        }
        String output = "Choice saved.\n"
                + "You can restart Project GoldStars X to apply the theme now or later.";
        JOptionPane.showMessageDialog(null, output, "Change Theme", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean changeBackgroundColor()
    {
        Object[] options = new Object[]
        {
            "Black", "Blue", "Cyan", "Dark Blue", "Dark Gray", "Dark Green", "Gray", "Green", "Light Gray",
            "Light Red", "Magenta", "Orange", "Pink", "Red", "Turquoise", "Very Dark Green", "Very Dark Blue", "White", "Yellow"
        };
        String output;
        if("1".equals(ProjectGoldStarsX.language))
        {
            output = "Please choose a background color:";
        }
        else
        {
            output = "Please choose a background colour:";
        }
        String chooseColorTitle;
        if("1".equals(ProjectGoldStarsX.language))
        {
            chooseColorTitle = "Solid Color";
        }
        else
        {
            chooseColorTitle = "Solid Colour";
        }
        String colorChoice = (String)JOptionPane.showInputDialog(null, output, chooseColorTitle, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(colorChoice == null)
        {
            return false;
        }
        else
        {
            ProjectGoldStarsX.color = colorChoice;
        }
        //Save the color to the user's Project GoldStars X folder.
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "color.txt");
            out = new PrintWriter(file);
            out.append(ProjectGoldStarsX.color);
            out.close();
        }
        catch(FileNotFoundException e2)
        {
            
        }
        return true;
    }
}