package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class ListenersLocations
{
    public static class NorthAmericaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("North America");
        }
    }
    
    public static class SouthAmericaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("South America");
        }
    }
    
    public static class EuropeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Europe");
        }
    }
    
    public static class AfricaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Africa");
        }
    }

    public static class TheMiddleEastListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("The Middle East");
        }
    }
    
    public static class AsiaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Asia");
        }
    }
    
    public static class OceaniaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Oceania");
        }
    }
    
    public static class OtherListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Other/I don't want to say");
        }
    }
    
    private static void processThemeChoice(String themeName)
    {
        ProjectGoldStarsX.location = themeName;
        //Save the location to the user's Project GoldStars X folder.
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.systemFolder, "location.txt");
            out = new PrintWriter(file);
            out.append(ProjectGoldStarsX.location);
            out.close();
        }
        catch(FileNotFoundException e2)
        {

        }
        String output = "Location saved!";
        JOptionPane.showMessageDialog(null, output, "Set Location", JOptionPane.INFORMATION_MESSAGE);
    }
}