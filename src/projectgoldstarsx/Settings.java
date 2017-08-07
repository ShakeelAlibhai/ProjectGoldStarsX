package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class Settings
{
    public Settings()
    {
        settings();
    }
    
    public static ProgramWindow settingsFrame;
    
    private void settings()
    {
        settingsFrame = new ProgramWindow("Settings");
        settingsFrame.setSize(900 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(4, 4));
        settingsFrame.setJMenuBar(menuBar());
        settingsFrame.add(Components.headerLabel("General Settings:"));
        settingsFrame.add(Components.actionLabel("Change Language", new ListenersSettings.ChangeLanguageListener()));
        settingsFrame.add(Components.actionLabel("Change Theme", new ListenersSettings.ChangeThemeListener()));
        settingsFrame.add(Components.actionLabel("Change Username", new ListenersSettings.ChangeUsernameListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(Components.actionLabel("Menu Bar Settings", new ListenersSettings.MenuBarSettingsListener()));
        settingsFrame.add(Components.actionLabel("Set Location", new ListenersSettings.SetLocationListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(Components.headerLabel("App Settings:"));
        settingsFrame.add(Components.actionLabel("Calendar Settings", new ListenersSettings.CalendarSettingsListener()));
        settingsFrame.add(Components.actionLabel("Notes Settings", new ListenersSettings.NotesSettingsListener()));
        settingsFrame.add(Components.actionLabel("Photos Settings", new ListenersSettings.PhotosSettingsListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(Components.actionLabel("Talk Settings", new ListenersSettings.TalkSettingsListener()));
        settingsFrame.add(Components.actionLabel("Search Settings", new ListenersSettings.SearchSettingsListener()));
        settingsFrame.add(Components.actionLabel("Error Log Settings", new ListenersSettings.ErrorLogSettingsListener()));
        settingsFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(settingsFrame.getCloseButton());
        menuBar.add(settingsFrame.getMaximizeButton());
        menuBar.add(settingsFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Current Settings", new CurrentSettingsListener()));
        return menuBar;
    }
    
    public static class CurrentSettingsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new CurrentSettings();
        }
    }
}