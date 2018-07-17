package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
public class AgendaViewEventsTomorrow
{
    public AgendaViewEventsTomorrow()
    {
        viewEventsTomorrow();
    }
    
    static String output;
    public static JInternalFrame frame;
    
    private void viewEventsTomorrow()
    {
        frame = new JInternalFrame("Events");
        ProjectGoldStarsX.desktop.add(frame);
        frame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        frame.setJMenuBar(menuBar());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        //Create an Array List of Strings to store tomorrow's events in.
        ArrayList<String> eventsTomorrow = new ArrayList<String>();
        /*
         * Search the list of saved events for events with tomorrow's date.
         * Store tomorrow's events in the "eventsTomorrow" ArrayList.
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
                eventsTomorrow.add(event);
            }
        }
        //If there are no events tomorrow
        if(eventsTomorrow.isEmpty())
        {
            eventsTomorrow.add("You don't have any events tomorrow!");
        }
        //Display tomorrow's events.
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(eventsTomorrow.size(), 1));
        for(int i = 0; i < eventsTomorrow.size(); i++)
        {
            JLabel event = new JLabel(eventsTomorrow.get(i));
            event.setFont(ProjectGoldStarsX.bodyText2);
            frame.getContentPane().add(event);
        }
        frame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
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