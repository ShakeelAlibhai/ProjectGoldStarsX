package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersCalendar
{
    public static class CreateCalendarEventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalendarCreateEvent();
        }
    }
    
    public static class ViewCalendarEventsTodayListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalendarViewEventsToday();
        }
    }
    
    public static class ViewCalendarEventsTomorrowListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalendarViewEventsTomorrow();
        }
    }
    
    public static class CalendarSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalendarSettings();
        }
    }
    
    public static class AboutCalendarListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutCalendar();
        }
    }
}