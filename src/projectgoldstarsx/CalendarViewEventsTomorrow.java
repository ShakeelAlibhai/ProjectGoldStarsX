package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class CalendarViewEventsTomorrow
{
    public CalendarViewEventsTomorrow()
    {
        viewCalendarEventsTomorrow();
    }
    
    static String output;
    public static JInternalFrame calendarFrame;
    
    private void viewCalendarEventsTomorrow()
    {
        calendarFrame = new JInternalFrame("Calendar Events");
        ProjectGoldStarsX.desktop.add(calendarFrame);
        calendarFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        calendarFrame.setJMenuBar(menuBar());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        //Create an Array List of Strings to store tomorrow's calendar events in.
        ArrayList<String> eventsTomorrow = new ArrayList<String>();
        /*
         * Search the list of saved calendar events for events with tomorrow's date.
         * Store tomorrow's calendar events in the "eventsTomorrow" ArrayList.
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
                eventsTomorrow.add(event);
            }
        }
        //If there are no calendar events tomorrow
        if(eventsTomorrow.isEmpty())
        {
            eventsTomorrow.add("You don't have any calendar events tomorrow!");
        }
        //Display tomorrow's calendar events.
        calendarFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        calendarFrame.setResizable(true);
        calendarFrame.setLayout(new GridLayout(eventsTomorrow.size(), 1));
        for(int i = 0; i < eventsTomorrow.size(); i++)
        {
            JLabel event = new JLabel(eventsTomorrow.get(i));
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