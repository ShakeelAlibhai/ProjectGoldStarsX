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
public class Agenda
{
    public static ProgramWindow agendaFrame;
    public static JTextField agendaSearchField;
    
    public Agenda()
    {
        agenda();
    }
    
    private void agenda()
    {
        agendaFrame = new ProgramWindow("Agenda");
        agendaFrame.setJMenuBar(menuBar());
        agendaFrame.setSize(850 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        agendaFrame.setLayout(new GridLayout(3, 1));
        agendaFrame.add(Components.titleLabel("Today is:"));
        agendaFrame.add(row2());
        agendaFrame.add(row3());
        agendaFrame.makeVisible();
    }
    
    //Returns the JMenuBar that will be added to the ProgramWindow
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(agendaFrame.getCloseButton());
        menuBar.add(agendaFrame.getMaximizeButton());
        menuBar.add(agendaFrame.getWindowMenu());
        menuBar.add(Components.settingsButton("Agenda Settings", new ListenersAgenda.AgendaSettingsListener()));
        setupSearchField();
        menuBar.add(agendaSearchField);
        menuBar.add(new StandardButton("Search", new SearchAgendaListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Agenda", new ListenersAgenda.AboutAgendaListener()));
        menu.add(helpMenu());
        return menu.getMenu();
    }
    
    private JMenu helpMenu()
    {
        JMenu menu = new JMenu("Agenda Help");
        menu.setFont(ProjectGoldStarsX.mediumText3);
        menu.add(Components.standardMenuItem("Create an Event", new ListenersHelpAction.AgendaCreateEventListener()));
        menu.add(Components.standardMenuItem("View Events", new ListenersHelpAction.AgendaViewEventsListener()));
        return menu;
    }
    
    private void setupSearchField()
    {
        agendaSearchField = new JTextField();
        agendaSearchField.setText("Search Agenda");
        agendaSearchField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            agendaSearchField.setForeground(ProjectGoldStarsX.secondaryColor);
        }
        else
        {
            agendaSearchField.setForeground(ProjectGoldStarsX.mainColor);
        }
        agendaSearchField.addActionListener(new SearchAgendaListener());
    }
    
    //Returns a JPanel containing the date and time
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.mainColor);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(date());
        row2.add(time());
        return row2;
    }
    
    //Returns a JLabel containing the date; this JLabel is then added to the JPanel row2
    private JLabel date()
    {
        JLabel dateLabel = new JLabel();
        dateLabel.setBackground(ProjectGoldStarsX.mainColor);
        dateLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        dateLabel.setFont(ProjectGoldStarsX.mediumText1);
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        Calendar agenda = java.util.Calendar.getInstance();
        String[] days = new String[]
        {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        switch(ProjectGoldStarsX.dateFormat)
        {
            case "Format 1": default:
            {
                ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
                ses.scheduleAtFixedRate(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        String output = days[agenda.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                        output += ((agenda.get(java.util.Calendar.MONTH) + 1) + "/") + (agenda.get(java.util.Calendar.DATE)) + "/" + (agenda.get(java.util.Calendar.YEAR));
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
                        String output = days[agenda.get(java.util.Calendar.DAY_OF_WEEK) - 1] + ", ";
                        output += (agenda.get(java.util.Calendar.DATE)) + "/" + ((agenda.get(java.util.Calendar.MONTH) + 1) + "/") + (agenda.get(java.util.Calendar.YEAR));
                        dateLabel.setText(output);
                    }
                }, 0, 1, TimeUnit.SECONDS);
                break;
            }
        }
        return dateLabel;
    }
    
    //Returns a JLabel containing the time; this JLabel is then added to the JPanel row2
    private JLabel time()
    {
        JLabel timePanel = new JLabel();
        timePanel.setBackground(ProjectGoldStarsX.mainColor);
        timePanel.setForeground(ProjectGoldStarsX.secondaryColor);
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
    
    //Returns a JPanel with three buttons
    private JPanel row3()
    {
        JPanel row3 = new JPanel();
        row3.setBackground(ProjectGoldStarsX.mainColor);
        row3.setLayout(new GridLayout(1, 2));
        row3.add(new StandardButton("Create an Event", new ListenersAgenda.CreateEventListener()));
        row3.add(new StandardButton("View Events Today", new ListenersAgenda.ViewEventsTodayListener()));
        row3.add(new StandardButton("View Events Tomorrow", new ListenersAgenda.ViewEventsTomorrowListener()));
        return row3;
    }
    
    public static class SearchAgendaListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new AgendaSearch(agendaSearchField.getText());
            agendaSearchField.setText("");
        }
    }
}