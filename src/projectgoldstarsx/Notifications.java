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
        notificationsFrame.setLayout(new GridLayout(5, 1));
        notificationsFrame.getContentPane().setBackground(ProjectGoldStarsX.mainColor);
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
        notificationsFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
        menuBar.setBorder(rightBorder);
        menuBar.add(Components.closeButton(new CloseListener()));
        return menuBar;
    }
    
    private JLabel title()
    {
        JLabel title = new JLabel("Notifications", SwingConstants.CENTER);
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
        title.setBorder(rightBorder);
        title.setFont(ProjectGoldStarsX.largeHeader);
        title.setForeground(ProjectGoldStarsX.secondaryColor);
        return title;
    }
    
    private JLabel calendarNotification()
    {
        JLabel calendarNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
        calendarNotification.setBorder(rightBorder);
        calendarNotification.setFont(ProjectGoldStarsX.mediumText1);
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> eventsToday = new ArrayList<String>();
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
        if(eventsToday.isEmpty())
        {
            calendarNotification.setText("No events today.");
        }
        if(!eventsToday.isEmpty())
        {
            if(eventsToday.size() == 1)
            {
                calendarNotification.setText(eventsToday.size() + " Event Today");
            }
            if(eventsToday.size() != 1)
            {
                calendarNotification.setText(eventsToday.size() + " Events Today");
            }
        }
        calendarNotification.setForeground(ProjectGoldStarsX.secondaryColor);
        return calendarNotification;
    }
    
    private JLabel notesNotification()
    {
        JLabel notesNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
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
        notesNotification.setForeground(ProjectGoldStarsX.secondaryColor);
        return notesNotification;
    }
    
    private JLabel photosNotification()
    {
        JLabel photosNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
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
        photosNotification.setForeground(ProjectGoldStarsX.secondaryColor);
        return photosNotification;
    }
    
    private JLabel errorsNotification()
    {
        JLabel errorsNotification = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.secondaryColor);
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
        errorsNotification.setForeground(ProjectGoldStarsX.secondaryColor);
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