package projectgoldstarsx;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
public class Notifications
{
    public Notifications()
    {
        notifications();
    }
    
    public static JFrame notificationsFrame;
    
    private void notifications()
    {
        notificationsFrame = new JFrame("Notifications");
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenResolution = t.getScreenSize();
        notificationsFrame.setSize(300 * ProjectGoldStarsX.multiplier, screenResolution.height);
        notificationsFrame.setLayout(new GridLayout(6, 1));
        notificationsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        notificationsFrame.setUndecorated(true);
        URL url = getClass().getResource("/images/ProjectGoldStarsXIcon.png");
        Image im = Toolkit.getDefaultToolkit().getImage(url);
        notificationsFrame.setIconImage(im);
        notificationsFrame.setJMenuBar(menuBar());
        notificationsFrame.add(title());
        notificationsFrame.add(calendarNotification());
        notificationsFrame.add(notesNotification());
        notificationsFrame.add(photosNotification());
        notificationsFrame.add(errorsNotification());
        notificationsFrame.add(Components.standardButton("System Information", new ListenersProgramsAction.SystemInformationListener()));
        notificationsFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        menuBar.setBorder(rightBorder);
        menuBar.add(Components.closeButton(new CloseListener()));
        return menuBar;
    }
    
    private JLabel title()
    {
        JLabel title = new JLabel("Notifications", SwingConstants.CENTER);
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        title.setBorder(rightBorder);
        title.setFont(ProjectGoldStarsX.largeHeader);
        title.setForeground(ProjectGoldStarsX.color2);
        return title;
    }
    
    private JLabel calendarNotification()
    {
        JLabel calendarNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        calendarNotification.setBorder(rightBorder);
        calendarNotification.setFont(ProjectGoldStarsX.mediumText1);
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> eventsToday = new ArrayList<String>();
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
        if(eventsToday.isEmpty())
        {
            calendarNotification.setText("No calendar events today.");
        }
        if(!eventsToday.isEmpty())
        {
            if(eventsToday.size() == 1)
            {
                calendarNotification.setText(eventsToday.size() + " Calendar Event Today");
            }
            if(eventsToday.size() != 1)
            {
                calendarNotification.setText(eventsToday.size() + " Calendar Events Today");
            }
        }
        calendarNotification.setForeground(ProjectGoldStarsX.color2);
        return calendarNotification;
    }
    
    private JLabel notesNotification()
    {
        JLabel notesNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        notesNotification.setBorder(rightBorder);
        notesNotification.setFont(ProjectGoldStarsX.mediumText1);
        if(ProjectGoldStarsX.notes.size() == 1)
        {
            notesNotification.setText(ProjectGoldStarsX.notes.size() + " Note Saved");
        }
        if(ProjectGoldStarsX.notes.size() != 1)
        {
            notesNotification.setText(ProjectGoldStarsX.notes.size() + " Notes Saved");
        }
        notesNotification.setForeground(ProjectGoldStarsX.color2);
        return notesNotification;
    }
    
    private JLabel photosNotification()
    {
        JLabel photosNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        photosNotification.setBorder(rightBorder);
        photosNotification.setFont(ProjectGoldStarsX.mediumText1);
        if(ProjectGoldStarsX.photoNames.size() == 1)
        {
            photosNotification.setText(ProjectGoldStarsX.photoNames.size() + " Photo Saved");
        }
        if(ProjectGoldStarsX.photoNames.size() != 1)
        {
            photosNotification.setText(ProjectGoldStarsX.photoNames.size() + " Photos Saved");
        }
        photosNotification.setForeground(ProjectGoldStarsX.color2);
        return photosNotification;
    }
    
    private JLabel errorsNotification()
    {
        JLabel errorsNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        errorsNotification.setBorder(rightBorder);
        errorsNotification.setFont(ProjectGoldStarsX.mediumText1);
        if(ProjectGoldStarsX.errors.size() == 1)
        {
            errorsNotification.setText(ProjectGoldStarsX.errors.size() + " Error Reported");
        }
        if(ProjectGoldStarsX.errors.size() != 1)
        {
            errorsNotification.setText(ProjectGoldStarsX.errors.size() + " Errors Reported");
        }
        errorsNotification.setForeground(ProjectGoldStarsX.color2);
        return errorsNotification;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            notificationsFrame.dispose();
        }
    }
}