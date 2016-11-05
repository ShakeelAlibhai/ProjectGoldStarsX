package projectgoldstarsx;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class CalendarViewEventsToday
{
    static String output;
    
    public CalendarViewEventsToday()
    {
        viewCalendarEventsToday();
    }
    
    private void viewCalendarEventsToday()
    {
        JFrame calendarFrame = new JFrame("Calendar Events");
        Calendar calendar = Calendar.getInstance();
        //Create an Array List of Strings to store today's calendar events in.
        ArrayList<String> eventsToday = new ArrayList<String>();
        /*
         * Search the list of saved calendar events for events with today's date.
         * Store today's calendar events in the "eventsToday" ArrayList.
         */
        for(int i = 0; i < ProjectGoldStarsX.calendarEvents.size(); i++)
        {
            String temp = ProjectGoldStarsX.calendarEvents.get(i);
            int year, month, date;
            year = Integer.parseInt(temp.substring(0, 4));
            month = Integer.parseInt(temp.substring(4, 6));
            date = Integer.parseInt(temp.substring(6, 8));
            String event = temp.substring(8);
            if(year == calendar.get(Calendar.YEAR) && month == (calendar.get(Calendar.MONTH) + 1) && date == calendar.get(Calendar.DATE))
            {
                eventsToday.add(event);
            }
        }
        //If there are no calendar events today
        if(eventsToday.isEmpty())
        {
            output = "You don't have any calendar events today!";
            JOptionPane.showMessageDialog(null, output, "Calendar Events", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //Display today's calendar events.
        calendarFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        calendarFrame.setLayout(new GridLayout(eventsToday.size(), 1));
        for(int i = 0; i < eventsToday.size(); i++)
        {
            JLabel event = new JLabel(eventsToday.get(i));
            event.setFont(ProjectGoldStarsX.bodyText2);
            calendarFrame.getContentPane().add(event);
        }
        calendarFrame.setVisible(true);
    }
}