package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class CalendarHome
{
    public static ProgramWindow calendarFrame;
    public static JTextField calendarSearchTextField;
    
    public CalendarHome()
    {
        calendar();
    }
    
    private void calendar()
    {
        calendarFrame = new ProgramWindow("Calendar");
        calendarFrame.setJMenuBar(menuBar());
        calendarFrame.setSize(850 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        calendarFrame.setLayout(new GridLayout(3, 1));
        calendarFrame.add(Components.titleLabel("Today is:"));
        calendarFrame.add(row2());
        calendarFrame.add(row3());
        calendarFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(calendarFrame.getCloseButton());
        menuBar.add(calendarFrame.getMaximizeButton());
        menuBar.add(calendarFrame.getWindowMenu());
        menuBar.add(Components.settingsButton("Calendar Settings", new ListenersCalendar.CalendarSettingsListener()));
        setupSearchField();
        menuBar.add(calendarSearchTextField);
        menuBar.add(Components.standardButton("Search", new SearchCalendarListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Calendar", new ListenersCalendar.AboutCalendarListener()));
        return menu.getMenu();
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
    
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.color1);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(date());
        row2.add(time());
        return row2;
    }
    
    private JLabel date()
    {
        JLabel dateLabel = new JLabel();
        dateLabel.setBackground(ProjectGoldStarsX.color1);
        dateLabel.setForeground(ProjectGoldStarsX.color2);
        dateLabel.setFont(ProjectGoldStarsX.mediumText1);
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        Calendar calendar = java.util.Calendar.getInstance();
        String[] days = new String[]
        {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        switch(ProjectGoldStarsX.calendarFormat)
        {
            case "Format 1": default:
            {
                ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
                ses.scheduleAtFixedRate(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        String output = days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                        output += ((calendar.get(java.util.Calendar.MONTH) + 1) + "/") + (calendar.get(java.util.Calendar.DATE)) + "/" + (calendar.get(java.util.Calendar.YEAR));
                        dateLabel.setText(output);
                    }
                }, 0, 1, TimeUnit.SECONDS);
                break;
            }
            case "Format 2":
            {
                ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
                ses.scheduleAtFixedRate(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        String output = days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                        output += (calendar.get(java.util.Calendar.DATE)) + "/" + ((calendar.get(java.util.Calendar.MONTH) + 1) + "/") + (calendar.get(java.util.Calendar.YEAR));
                        dateLabel.setText(output);
                    }
                }, 0, 1, TimeUnit.SECONDS);
                break;
            }
        }
        return dateLabel;
    }
    
    private JLabel time()
    {
        JLabel timePanel = new JLabel();
        timePanel.setBackground(ProjectGoldStarsX.color1);
        timePanel.setForeground(ProjectGoldStarsX.color2);
        timePanel.setFont(ProjectGoldStarsX.mediumText1);
        timePanel.setHorizontalAlignment(SwingConstants.CENTER);
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                Date time = new Date();
                timePanel.setText(" " + DateFormat.getTimeInstance(DateFormat.FULL).format(time) + " ");
            }
        }, 0, 1, TimeUnit.SECONDS);
        return timePanel;
    }
    
    private JPanel row3()
    {
        JPanel row3 = new JPanel();
        row3.setBackground(ProjectGoldStarsX.color1);
        row3.setLayout(new GridLayout(1, 2));
        row3.add(Components.standardButton("Create a Calendar Event", new ListenersCalendar.CreateCalendarEventListener()));
        row3.add(Components.standardButton("View Calendar Events Today", new ListenersCalendar.ViewCalendarEventsTodayListener()));
        return row3;
    }
    
    public static class SearchCalendarListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new CalendarSearch(calendarSearchTextField.getText());
            calendarSearchTextField.setText("");
        }
    }
}