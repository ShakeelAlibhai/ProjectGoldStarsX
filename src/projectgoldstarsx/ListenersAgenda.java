package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersAgenda
{
    public static class CreateEventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new AgendaCreateEvent();
        }
    }
    
    public static class ViewEventsTodayListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new AgendaViewEventsToday();
        }
    }
    
    public static class ViewEventsTomorrowListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new AgendaViewEventsTomorrow();
        }
    }
    
    public static class AgendaSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new AgendaSettings();
        }
    }
    
    public static class AboutAgendaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutAgenda();
        }
    }
}