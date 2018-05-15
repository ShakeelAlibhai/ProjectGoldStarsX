package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class AgendaViewEventsToday
{
    public AgendaViewEventsToday()
    {
        viewEventsToday();
    }
    
    static String output;
    public static JInternalFrame frame;
    
    private void viewEventsToday()
    {
        frame = new JInternalFrame("Events");
        ProjectGoldStarsX.desktop.add(frame);
        frame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        frame.setJMenuBar(menuBar());
        Calendar calendar = Calendar.getInstance();
        //Create an Array List of Strings to store today's events in.
        ArrayList<String> eventsToday = new ArrayList<String>();
        /*
         * Search the list of saved events for events with today's date.
         * Store today's events in the "eventsToday" ArrayList.
         */
        for(int i = 0; i < ProjectGoldStarsX.events.size(); i++)
        {
            String temp = ProjectGoldStarsX.events.get(i);
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
        //If there are no events today
        if(eventsToday.isEmpty())
        {
            eventsToday.add("You don't have any events today!");
        }
        //Display today's events.
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(eventsToday.size(), 1));
        for(int i = 0; i < eventsToday.size(); i++)
        {
            JLabel event = new JLabel(eventsToday.get(i));
            event.setFont(ProjectGoldStarsX.bodyText2);
            frame.getContentPane().add(event);
        }
        frame.setVisible(true);
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
            frame.dispose();
        }
    }
}