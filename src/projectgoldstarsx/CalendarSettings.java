package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
public class CalendarSettings
{
    public static ProgramWindow settingsFrame;
    
    public CalendarSettings()
    {
        calendarSettings();
    }
    
    private void calendarSettings()
    {
        settingsFrame = new ProgramWindow("Calendar Settings");
        settingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 2));
        settingsFrame.setInstructionsMenuBar("Which format would you like the calendar to be displayed in?");
        settingsFrame.add(Components.headerLabel("Format 1:"));
        settingsFrame.add(Components.headerLabel("Format 2:"));
        settingsFrame.add(date1());
        settingsFrame.add(date2());
        settingsFrame.add(Components.standardButton("Choose This Format", new CalendarFormat1Listener()));
        settingsFrame.add(Components.standardButton("Choose This Format", new CalendarFormat2Listener()));
        settingsFrame.makeVisible();
    }
    
    private JLabel date1()
    {
        JLabel date1 = new JLabel("[Day of the Week], mm/dd/yyyy", SwingConstants.CENTER);
        date1.setForeground(ProjectGoldStarsX.color2);
        date1.setFont(ProjectGoldStarsX.mediumText1);
        return date1;
    }
    
    private JLabel date2()
    {
        JLabel date2 = new JLabel("[Day of the Week], dd/mm/yyyy", SwingConstants.CENTER);
        date2.setForeground(ProjectGoldStarsX.color2);
        date2.setFont(ProjectGoldStarsX.mediumText1);
        return date2;
    }
    
    public static class CalendarFormat1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.calendarFormat = "Format 1";
            //Save the calendar format to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.calendarFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class CalendarFormat2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.calendarFormat = "Format 2";
            //Save the calendar format to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.calendarFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}