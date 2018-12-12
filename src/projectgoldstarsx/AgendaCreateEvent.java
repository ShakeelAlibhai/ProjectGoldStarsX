package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AgendaCreateEvent
{
    static ProgramWindow agendaFrame;
    static JTextField yearField, monthField, dateField, eventField;
    
    public AgendaCreateEvent()
    {
        createEvent();
    }
    
    private void createEvent()
    {
        agendaFrame = new ProgramWindow("Create an Event");
        agendaFrame.setLayout(new GridLayout(5, 2));
        agendaFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        agendaFrame.setInstructionsMenuBar("Please enter the following information about the event:");
        agendaFrame.add(Components.standardLabel("Year:"));
        setupYearField();
        agendaFrame.add(yearField);
        agendaFrame.add(Components.standardLabel("Month (ex. January is 01):"));
        setupMonthField();
        agendaFrame.add(monthField);
        agendaFrame.add(Components.standardLabel("Date (ex. 01, 02, 03...31):"));
        setupDateField();
        agendaFrame.add(dateField);
        agendaFrame.add(Components.standardLabel("Event:"));
        setupEventField();
        agendaFrame.add(eventField);
        agendaFrame.add(new JLabel());
        agendaFrame.add(Components.button2("Create", new CreateCalendarEventListener()));
        agendaFrame.makeVisible();
    }
    
    private void setupYearField()
    {
        yearField = new JTextField("");
        yearField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        yearField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupMonthField()
    {
        monthField = new JTextField("");
        monthField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        monthField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupDateField()
    {
        dateField = new JTextField("");
        dateField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        dateField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupEventField()
    {
        eventField = new JTextField("");
        eventField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        eventField.setFont(ProjectGoldStarsX.bodyText2);
        eventField.addActionListener(new CreateCalendarEventListener());
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
                    JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Get the month of the calendar event.
            String month = monthField.getText();
            if(month == null)
            {
                return;
            }
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
                    JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(temp < 10 && month.length() < 2)
            {
                month = "0" + month;
            }
            dateAndEvent += month;
            //Get the date of the calendar event.
            String day = dateField.getText();
            if(day == null)
            {
                return;
            }
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
                    JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calendar");
                JOptionPane.showMessageDialog(null, "ERROR", "Create an Event", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(temp < 10 && day.length() < 2)
            {
                day = "0" + day;
            }
            dateAndEvent += day;
            //Get the event.
            String event = eventField.getText();
            if(event == null)
            {
                return;
            }
            dateAndEvent += event;
            //Add the calendar event String (which includes the date of the event as well as the event itself) to the ArrayList of calendar events.
            ProjectGoldStarsX.events.add(dateAndEvent);
            //Save the calendar event (including the date of the event) to the user's Gold Stars folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.AGENDA_FOLDER, "event" + (ProjectGoldStarsX.events.size() - 1) + ".txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.events.get(ProjectGoldStarsX.events.size() - 1));
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Event Saved", "Create an Event", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}