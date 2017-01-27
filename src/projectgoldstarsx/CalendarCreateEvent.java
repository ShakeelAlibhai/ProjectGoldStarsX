package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalendarCreateEvent
{
    static JInternalFrame qeFrame;
    static JTextField yearField, monthField, dateField, eventField;
    
    public CalendarCreateEvent()
    {
        createCalendarEvent();
    }
    
    private void createCalendarEvent()
    {
        qeFrame = new JInternalFrame("Create a Calendar Event");
        ProjectGoldStarsX.desktop.add(qeFrame);
        qeFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        qeFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        qeFrame.setLayout(new GridLayout(5, 2));
        qeFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        JLabel instructions1 = new JLabel("Please enter the following information about the event:");
        instructions1.setForeground(ProjectGoldStarsX.color2);
        instructions1.setFont(ProjectGoldStarsX.mediumText1);
        menuBar.add(instructions1);
        qeFrame.setJMenuBar(menuBar);
        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setFont(ProjectGoldStarsX.bodyText1);
        yearLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel monthLabel = new JLabel("Month (ex. January is 01):");
        monthLabel.setFont(ProjectGoldStarsX.bodyText1);
        monthLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel dateLabel = new JLabel("Date (ex. 01, 02, 03...31):");
        dateLabel.setFont(ProjectGoldStarsX.bodyText1);
        dateLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel eventLabel = new JLabel("Event:");
        eventLabel.setFont(ProjectGoldStarsX.bodyText1);
        eventLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel emptySpace = new JLabel();
        yearField = new JTextField("");
        yearField.setFont(ProjectGoldStarsX.bodyText2);
        monthField = new JTextField("");
        monthField.setFont(ProjectGoldStarsX.bodyText2);
        dateField = new JTextField("");
        dateField.setFont(ProjectGoldStarsX.bodyText2);
        eventField = new JTextField("");
        eventField.setFont(ProjectGoldStarsX.bodyText2);
        qeFrame.add(yearLabel);
        qeFrame.add(yearField);
        qeFrame.add(monthLabel);
        qeFrame.add(monthField);
        qeFrame.add(dateLabel);
        qeFrame.add(dateField);
        qeFrame.add(eventLabel);
        qeFrame.add(eventField);
        qeFrame.add(emptySpace);
        qeFrame.add(Components.button2("Create", new CreateCalendarEventListener()));
        qeFrame.setVisible(true);
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            qeFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(qeFrame);
        }
    }
    
    private class CreateCalendarEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String dateAndEvent = "";
        int temp;
        //Get the year of the calendar event.
        String year = yearField.getText();
        if(year == null)
        {
            return;
        }
        dateAndEvent += year;
        /*
         * Attempt to convert the user-inputted year from a String to an int.
         * Check to make sure that the int is between 1000 and 9999.
         * Display an error message if the String cannot be converted to an int or if the int is not between 1000 and 9999.
         */
        try
        {
            temp = Integer.parseInt(year);
            if(temp < 1000 || temp > 9999)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(Exception e2)
        {
            ProjectGoldStarsX.errors.add("Error: Calendar");
            JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Get the month of the calendar event.
        String month = monthField.getText();
        if(month == null)
        {
            return;
        }
        dateAndEvent += month;
        /*
         * Attempt to convert the user-inputted month from a String to an int.
         * Check to make sure that the int is between 1 and 12.
         * Display an error message if the String cannot be converted to an int or if the int is not between 1 and 12.
         */
        try
        {
            temp = Integer.parseInt(month);
            if(temp < 1 || temp > 12)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(Exception e2)
        {
            ProjectGoldStarsX.errors.add("Error: Calendar");
            JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Get the date of the calendar event.
        String day = dateField.getText();
        if(day == null)
        {
            return;
        }
        dateAndEvent += day;
        /*
         * Attempt to convert the user-inputted day from a String to an int.
         * Check to make sure that the int is between 1 and 31.
         * Display an error message if the String cannot be converted to an int or if the int is not between 1 and 31.
         */
        try
        {
            temp = Integer.parseInt(day);
            if(temp < 1 || temp > 31)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(Exception e2)
        {
            ProjectGoldStarsX.errors.add("Error: Calendar");
            JOptionPane.showMessageDialog(null, "ERROR", "Create a Calendar Event", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Get the event.
        String event = eventField.getText();
        if(event == null)
        {
            return;
        }
        dateAndEvent += event;
        //Add the calendar event String (which includes the date of the event as well as the event itself) to the ArrayList of calendar events.
        ProjectGoldStarsX.calendarEvents.add(dateAndEvent);
        //Save the calendar event (including the date of the event) to the user's Gold Stars folder.
        PrintWriter out;
        try
            {
                File file = new File(ProjectGoldStarsX.calendarFolder, "calendarEvent" + (ProjectGoldStarsX.calendarEvents.size() - 1) + ".txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.calendarEvents.get(ProjectGoldStarsX.calendarEvents.size() - 1));
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        JOptionPane.showMessageDialog(null, "Event Saved", "Create a Calendar Event", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}