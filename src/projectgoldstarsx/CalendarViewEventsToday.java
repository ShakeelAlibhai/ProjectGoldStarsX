package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
public class CalendarViewEventsToday
{
    public CalendarViewEventsToday()
    {
        viewCalendarEventsToday();
    }
    
    static String output;
    public static JInternalFrame calendarFrame;
    
    private void viewCalendarEventsToday()
    {
        calendarFrame = new JInternalFrame("Calendar Events");
        ProjectGoldStarsX.desktop.add(calendarFrame);
        calendarFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        calendarFrame.setJMenuBar(menuBar());
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
            eventsToday.add("You don't have any calendar events today!");
        }
        //Display today's calendar events.
        calendarFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        calendarFrame.setResizable(true);
        calendarFrame.setLayout(new GridLayout(eventsToday.size(), 1));
        for(int i = 0; i < eventsToday.size(); i++)
        {
            JLabel event = new JLabel(eventsToday.get(i));
            event.setFont(ProjectGoldStarsX.bodyText2);
            calendarFrame.getContentPane().add(event);
        }
        calendarFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        return menuBar;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calendarFrame.dispose();
        }
    }
}