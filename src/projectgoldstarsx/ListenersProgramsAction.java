package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersProgramsAction
{
    public static class AgendaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Agenda();
        }
    }
    
    public static class BrowserListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Browser();
        }
    }
    
    public static class CalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Calculator();
        }
    }
    
    public static class NotesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Notes();
        }
    }
    
    public static class PhotosListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Photos();
        }
    }
    
    public static class EducationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Education();
        }
    }
    
    public static class LightListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light();
        }
    }
    
    public static class SettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Settings();
        }
    }
    
    public static class CommandsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Commands();
        }
    }
    
    public static class ErrorLogListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new ErrorLog();
        }
    }
    
    public static class ErrorLogSearchListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new ErrorLogSearch();
        }
    }
    
    public static class HelpListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Help();
        }
    }
    
    public static class AboutListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new About();
        }
    }
    
    public static class TalkListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double r = Math.random();
            int randomResponse = (int)(r * 2);
            if(randomResponse == 0)
            {
                new Talk("Hello, how are you?");
                ProjectGoldStarsX.howAreYouDisplayed = true;
            }
            else
            {
                new Talk("Hi, " + ProjectGoldStarsX.nickname + "!");
                ProjectGoldStarsX.howAreYouDisplayed = false;
            }
        }
    }
    
    public static class StoriesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new StoryWindow("Stories", "Stories", 0);
        }
    }
    
    public static class FilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Files();
        }
    }
    
    public static class NotificationsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Notifications();
        }
    }
}