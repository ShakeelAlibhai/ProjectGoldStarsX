package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class CalendarHome
{
    public CalendarHome()
    {
        calendar();
    }
    
    public static JInternalFrame calendarFrame;
    public static JTextField calendarSearchTextField;
    
    private void calendar()
    {
        calendarFrame = new JInternalFrame("Calendar");
        ProjectGoldStarsX.desktop.add(calendarFrame);
        calendarFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        calendarFrame.setJMenuBar(menuBar());
        calendarFrame.setSize(850 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        calendarFrame.setLayout(new GridLayout(3, 1));
        calendarFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        calendarFrame.add(Components.titleLabel("Today is:"));
        calendarFrame.add(date());
        calendarFrame.add(row2());
        calendarFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.settingsButton("Calendar Settings", new ListenersCalendar.CalendarSettingsListener()));
        setupSearchField();
        menuBar.add(calendarSearchTextField);
        menuBar.add(Components.standardButton("Search", new SearchCalendarListener()));
        return menuBar;
    }
    
    private void setupSearchField()
    {
        calendarSearchTextField = new JTextField();
        calendarSearchTextField.setText("Search the Calendar");
        calendarSearchTextField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            calendarSearchTextField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            calendarSearchTextField.setForeground(ProjectGoldStarsX.color1);
        }
        calendarSearchTextField.addActionListener(new SearchCalendarListener());
    }
    
    private JLabel date()
    {
        Calendar calendar = java.util.Calendar.getInstance();
        String[] days = new String[]
        {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        String output;
        switch(ProjectGoldStarsX.calendarFormat)
        {
            case "Format 1": default:
            {
                output = days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                output += ((calendar.get(java.util.Calendar.MONTH) + 1) + "/") + (calendar.get(java.util.Calendar.DATE)) + "/" + (calendar.get(java.util.Calendar.YEAR));
                break;
            }
            case "Format 2":
            {
                output = days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                output += (calendar.get(java.util.Calendar.DATE)) + "/" + ((calendar.get(java.util.Calendar.MONTH) + 1) + "/") + (calendar.get(java.util.Calendar.YEAR));
                break;
            }
        }
        JLabel dateLabel = new JLabel(output, SwingConstants.CENTER);
        dateLabel.setForeground(ProjectGoldStarsX.color2);
        dateLabel.setFont(ProjectGoldStarsX.mediumText1);
        return dateLabel;
    }
    
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.color1);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(Components.standardButton("Create a Calendar Event", new ListenersCalendar.CreateCalendarEventListener()));
        row2.add(Components.standardButton("View Calendar Events Today", new ListenersCalendar.ViewCalendarEventsTodayListener()));
        return row2;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calendarFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(calendarFrame);
        }
    }
    
    public static class SearchCalendarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            CalendarSearch sc = new CalendarSearch(calendarSearchTextField.getText());
            calendarSearchTextField.setText("");
        }
    }
}