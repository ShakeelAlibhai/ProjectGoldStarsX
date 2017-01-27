package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
public class Settings
{
    public Settings()
    {
        settings();
    }
    
    public static JInternalFrame settingsFrame;
    
    private void settings()
    {
        settingsFrame = new JInternalFrame("Settings");
        ProjectGoldStarsX.desktop.add(settingsFrame);
        settingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        settingsFrame.setSize(900 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(4, 4));
        settingsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        settingsFrame.setJMenuBar(menuBar());
        settingsFrame.add(Components.headerLabel("General Settings:"));
        settingsFrame.add(action("Change Language", new ChangeLanguageListener()));
        settingsFrame.add(action("Change Theme", new ChangeThemeListener()));
        settingsFrame.add(action("Change Username", new ChangeUsernameListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(action("Set Location", new SetLocationListener()));
        settingsFrame.add(action("Menu Bar Settings", new MenuBarSettingsListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(Components.headerLabel("App Settings:"));
        settingsFrame.add(action("Calendar Settings", new CalendarSettingsListener()));
        settingsFrame.add(action("Notes Settings", new NotesSettingsListener()));
        settingsFrame.add(action("Photos Settings", new PhotosSettingsListener()));
        settingsFrame.add(new JLabel());
        settingsFrame.add(action("Talk Settings", new TalkSettingsListener()));
        settingsFrame.add(action("Search Settings", new SearchSettingsListener()));
        settingsFrame.add(action("Error Log Settings", new ErrorLogSettingsListener()));
        settingsFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Current Settings", new CurrentSettingsListener()));
        return menuBar;
    }
    
    private JLabel action(String actionName, MouseListener mouseListener)
    {
        JLabel action = new JLabel(actionName, SwingConstants.CENTER);
        action.setForeground(ProjectGoldStarsX.color2);
        action.setFont(ProjectGoldStarsX.mediumText2);
        action.addMouseListener(mouseListener);
        return action;
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
    
    public static class CurrentSettingsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            CurrentSettings cs = new CurrentSettings();
        }
    }
    
    public static class ChangeLanguageListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            ChangeLanguage cl = new ChangeLanguage();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class ChangeThemeListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            ChangeTheme ct = new ChangeTheme();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class ChangeUsernameListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            ChangeUsername cu = new ChangeUsername();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class SetLocationListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            SetLocation sl = new SetLocation();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class MenuBarSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new MenuBarSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class CalendarSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            CalendarSettings cs = new CalendarSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class NotesSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            NotesSettings ns = new NotesSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class PhotosSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            PhotosSettings ps = new PhotosSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class TalkSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            TalkSettings ts = new TalkSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class SearchSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            SearchSettings ss = new SearchSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class ErrorLogSettingsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            ErrorLogSettings els = new ErrorLogSettings();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
}