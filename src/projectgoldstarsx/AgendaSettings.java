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
public class AgendaSettings
{
    public static ProgramWindow frame;
    
    public AgendaSettings()
    {
        agendaSettings();
    }
    
    private void agendaSettings()
    {
        frame = new ProgramWindow("Agenda Settings");
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setLayout(new GridLayout(3, 2));
        frame.setInstructionsMenuBar("Which format would you like the date to be displayed in?");
        frame.add(Components.headerLabel("Format 1:"));
        frame.add(Components.headerLabel("Format 2:"));
        frame.add(date1());
        frame.add(date2());
        frame.add(new StandardButton("Choose This Format", new AgendaFormat1Listener()));
        frame.add(new StandardButton("Choose This Format", new AgendaFormat2Listener()));
        frame.makeVisible();
    }
    
    private JLabel date1()
    {
        JLabel date1 = new JLabel("[Day of the Week], mm/dd/yyyy", SwingConstants.CENTER);
        date1.setForeground(ProjectGoldStarsX.secondaryColor);
        date1.setFont(ProjectGoldStarsX.mediumText1);
        return date1;
    }
    
    private JLabel date2()
    {
        JLabel date2 = new JLabel("[Day of the Week], dd/mm/yyyy", SwingConstants.CENTER);
        date2.setForeground(ProjectGoldStarsX.secondaryColor);
        date2.setFont(ProjectGoldStarsX.mediumText1);
        return date2;
    }
    
    public static class AgendaFormat1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.dateFormat = "Format 1";
            //Save the agenda format to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.AGENDA_FOLDER, "dateFormat.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.dateFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class AgendaFormat2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.dateFormat = "Format 2";
            //Save the agenda format to the Agenda folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.AGENDA_FOLDER, "dateFormat.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.dateFormat);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}