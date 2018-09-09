package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class MenuBarSettings
{
    public static ProgramWindow settingsFrame;
    
    public MenuBarSettings()
    {
        menuBarSettings();
    }
    
    private void menuBarSettings()
    {
        settingsFrame = new ProgramWindow("Menu Bar Settings");
        settingsFrame.setSize(850 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 1));
        settingsFrame.setStandardMenuBar();
        settingsFrame.add(Components.headerLabel("Settings in Main Menu Bar"));
        settingsFrame.add(Components.questionHeaderLabel("Do you want the Settings button to be in the main menu bar?"));
        settingsFrame.add(settingsButtonMainMenuBarChoices());
        settingsFrame.makeVisible();
    }
    
    private JPanel settingsButtonMainMenuBarChoices()
    {
        JPanel settingsButtonMainMenuBarChoices = new JPanel();
        settingsButtonMainMenuBarChoices.setLayout(new GridLayout(1, 2));
        settingsButtonMainMenuBarChoices.add(new StandardButton("Yes", new SettingsButtonMainMenuBarYesListener()));
        settingsButtonMainMenuBarChoices.add(new StandardButton("No", new SettingsButtonMainMenuBarNoListener()));
        return settingsButtonMainMenuBarChoices;
    }
    
    public static class SettingsButtonMainMenuBarYesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.errorLogSearchCaseSensitive = true;
            //Save the Settings button on the main menu bar choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.MENU_BAR_FOLDER, "settingsButtonMainMenuBar.txt");
                out = new PrintWriter(file);
                out.append("1");
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            String output = "Choice saved.\n"
                    + "Please restart Project GoldStars X for this change to take effect.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class SettingsButtonMainMenuBarNoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.errorLogSearchCaseSensitive = false;
            //Save the Settings button on the main menu bar choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.MENU_BAR_FOLDER, "settingsButtonMainMenuBar.txt");
                out = new PrintWriter(file);
                out.append("0");
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            String output = "Choice saved.\n"
                    + "Please restart Project GoldStars X for this change to take effect.";
            JOptionPane.showMessageDialog(null, output, "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}