package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class MenuBarSettings
{
    public static JInternalFrame settingsFrame;
    public static String output;
    
    public MenuBarSettings()
    {
        menuBarSettings();
    }
    
    private void menuBarSettings()
    {
        settingsFrame = new JInternalFrame("Menu Bar Settings");
        ProjectGoldStarsX.desktop.add(settingsFrame);
        settingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        settingsFrame.setSize(850 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 1));
        settingsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        settingsFrame.setJMenuBar(menuBar);
        settingsFrame.add(Components.headerLabel("Settings in Main Menu Bar"));
        JLabel settingsButtonMainMenuBarQuestion = new JLabel("Do you want the Settings button to be in the main menu bar?", SwingConstants.CENTER);
        settingsButtonMainMenuBarQuestion.setForeground(ProjectGoldStarsX.color2);
        settingsButtonMainMenuBarQuestion.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(settingsButtonMainMenuBarQuestion);
        JPanel settingsButtonMainMenuBarChoices = new JPanel();
        settingsButtonMainMenuBarChoices.setLayout(new GridLayout(1, 2));
        settingsButtonMainMenuBarChoices.add(Components.standardButton("Yes", new SettingsButtonMainMenuBarYesListener()));
        settingsButtonMainMenuBarChoices.add(Components.standardButton("No", new SettingsButtonMainMenuBarNoListener()));
        settingsFrame.add(settingsButtonMainMenuBarChoices);
        settingsFrame.setVisible(true);
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            settingsFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(settingsFrame);
        }
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
                File file = new File(ProjectGoldStarsX.menuBarFolder, "settingsButtonMainMenuBar.txt");
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
                File file = new File(ProjectGoldStarsX.menuBarFolder, "settingsButtonMainMenuBar.txt");
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