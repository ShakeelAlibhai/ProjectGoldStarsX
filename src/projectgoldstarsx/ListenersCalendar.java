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
            CalendarCreateEvent cce = new CalendarCreateEvent();
        }
    }
    
    public static class ViewCalendarEventsTodayListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalendarViewEventsToday vcet = new CalendarViewEventsToday();
        }
    }
    
    public static class CalendarSettingsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalendarSettings cs = new CalendarSettings();
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