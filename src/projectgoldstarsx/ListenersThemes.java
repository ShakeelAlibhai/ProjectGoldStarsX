package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ListenersThemes
{
    public static class FireThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Fire";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class ForestThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Forest";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class GrassThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Grass";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static class MountainThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Mountain";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class SkyThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Sky";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class SnowThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Snow";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class Snow2ThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Snow 2";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class SnowDarkThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Snow (Dark)";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class Snow2DarkThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Snow 2 (Dark)";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class WaterThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.theme = "Water";
            //Save the theme to the user's Snow OS folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            String output = "Choice saved.\n"
                    + "You can restart Snow OS to apply the theme now or later.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class SolidColorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(changeBackgroundColor())
            {
                ProjectGoldStarsX.theme = "Solid Color";
                //Save the theme to the user's Snow OS folder.
                PrintWriter out;
                try
                {
                    File file = new File(ProjectGoldStarsX.systemFolder, "theme.txt");
                    out = new PrintWriter(file);
                    out.append(ProjectGoldStarsX.theme);
                    out.close();
                }
                catch(FileNotFoundException e2)
                {

                }
                String output = "Choice saved.\n"
                        + "You can restart Snow OS to apply the theme now or later.";
                JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public static boolean changeBackgroundColor()
    {
        Object[] options = new Object[18];
        options[0] = "Black";
        options[1] = "Blue";
        options[2] = "Cyan";
        options[3] = "Dark Blue";
        options[4] = "Dark Gray";
        options[5] = "Dark Green";
        options[6] = "Gray";
        options[7] = "Green";
        options[8] = "Light Gray";
        options[9] = "Light Red";
        options[10] = "Magenta";
        options[11] = "Orange";
        options[12] = "Pink";
        options[13] = "Red";
        options[14] = "Very Dark Green";
        options[15] = "Very Dark Blue";
        options[16] = "White";
        options[17] = "Yellow";
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
            chooseColorTitle = "Choose a Background Color";
        }
        else
        {
            chooseColorTitle = "Choose a Background Colour";
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
        //Save the color to the user's Snow OS folder.
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.systemFolder, "color.txt");
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