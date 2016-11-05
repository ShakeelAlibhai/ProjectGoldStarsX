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
import javax.swing.SwingConstants;
public class CalendarSettings
{
    public static JInternalFrame settingsFrame;
    private static String output;
    
    public CalendarSettings()
    {
        calendarSettings();
    }
    
    private void calendarSettings()
    {
        settingsFrame = new JInternalFrame("Calendar Settings");
        ProjectGoldStarsX.desktop.add(settingsFrame);
        settingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        settingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 2));
        settingsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        JLabel instructionsLabel = new JLabel("Which format would you like the calendar to be displayed in?");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        menuBar.add(instructionsLabel);
        settingsFrame.setJMenuBar(menuBar);
        settingsFrame.add(Components.headerLabel("Format 1:"));
        settingsFrame.add(Components.headerLabel("Format 2:"));
        JLabel date1 = new JLabel("[Day of the Week], mm/dd/yyyy", SwingConstants.CENTER);
        date1.setForeground(ProjectGoldStarsX.color2);
        date1.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(date1);
        JLabel date2 = new JLabel("[Day of the Week], dd/mm/yyyy", SwingConstants.CENTER);
        date2.setForeground(ProjectGoldStarsX.color2);
        date2.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(date2);
        settingsFrame.add(Components.standardButton("Choose This Format", new CalendarFormat1Listener()));
        settingsFrame.add(Components.standardButton("Choose This Format", new CalendarFormat2Listener()));
        settingsFrame.setVisible(true);
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            settingsFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(settingsFrame);
        }
    }
    
    public static class CalendarFormat1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.calendarFormat = "Format 1";
            output = "Calendar format updated.";
            JOptionPane.showMessageDialog(null, output, "Change Calendar Format", JOptionPane.INFORMATION_MESSAGE);
            File calendarFormatTemp = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
            //Save the calendar format to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                out = new PrintWriter(calendarFormatTemp);
                out.append(ProjectGoldStarsX.calendarFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
        }
    }
    
    public static class CalendarFormat2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.calendarFormat = "Format 2";
            output = "Calendar format updated.";
            JOptionPane.showMessageDialog(null, output, "Change Calendar Format", JOptionPane.INFORMATION_MESSAGE);
            File calendarFormatTemp = new File(ProjectGoldStarsX.calendarFolder, "calendarFormat.txt");
            //Save the calendar format to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                out = new PrintWriter(calendarFormatTemp);
                out.append(ProjectGoldStarsX.calendarFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
        }
    }
}