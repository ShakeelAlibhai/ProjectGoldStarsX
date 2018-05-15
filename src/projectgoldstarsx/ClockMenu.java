package projectgoldstarsx;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JSeparator;
public class ClockMenu
{
    public static JMenu clockMenu()
    {
        StandardMenu clockMenu = new StandardMenu();
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                Date time = new Date();
                clockMenu.setText(" " + DateFormat.getTimeInstance(DateFormat.SHORT).format(time) + " ");
            }
        }, 0, 1, TimeUnit.SECONDS);
        clockMenu.add(clockLabel());
        clockMenu.add(new JSeparator());
        clockMenu.add(Components.standardMenuItem("Create an Event", new ListenersAgenda.CreateEventListener()));
        clockMenu.add(Components.standardMenuItem("View Events Today", new ListenersAgenda.ViewEventsTodayListener()));
        clockMenu.add(new JSeparator());
        clockMenu.add(Components.standardMenuItem("Open Agenda", new ListenersProgramsAction.AgendaListener()));
        return clockMenu.getMenu();
    }
    
    private static JLabel clockLabel()
    {
        JLabel clockLabel = new JLabel();
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                Date time = new Date();
                clockLabel.setText(" " + DateFormat.getTimeInstance(DateFormat.LONG).format(time) + " ");
            }
        }, 0, 1, TimeUnit.SECONDS);
        clockLabel.setFont(ProjectGoldStarsX.mediumText3);
        return clockLabel;
    }
}