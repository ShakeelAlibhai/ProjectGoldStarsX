package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ErrorLogSettings
{
    public static ProgramWindow settingsFrame;
    
    public ErrorLogSettings()
    {
        errorLogSettings();
    }
    
    private void errorLogSettings()
    {
        settingsFrame = new ProgramWindow("Error Log Settings");
        settingsFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 1));
        settingsFrame.setStandardMenuBar();
        settingsFrame.add(Components.headerLabel("Error Log Search Case Sensitivity"));
        settingsFrame.add(Components.questionHeaderLabel("Do you want Error Log Search to be case sensitive?"));
        settingsFrame.add(caseSensitivityChoices());
        settingsFrame.makeVisible();
    }
    
    private JPanel caseSensitivityChoices()
    {
        JPanel caseSensitivityChoices = new JPanel();
        caseSensitivityChoices.setLayout(new GridLayout(1, 2));
        caseSensitivityChoices.add(new StandardButton("Yes", new CaseSensitivityYesListener()));
        caseSensitivityChoices.add(new StandardButton("No", new CaseSensitivityNoListener()));
        return caseSensitivityChoices;
    }
    
    public static class CaseSensitivityYesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.errorLogSearchCaseSensitive = true;
            //Save the Error Log Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.ERROR_LOG_FOLDER, "errorLogSearchCaseSensitive.txt");
                out = new PrintWriter(file);
                out.append("1");
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class CaseSensitivityNoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.errorLogSearchCaseSensitive = false;
            //Save the Error Log Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.ERROR_LOG_FOLDER, "errorLogSearchCaseSensitive.txt");
                out = new PrintWriter(file);
                out.append("0");
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            JOptionPane.showMessageDialog(null, "Choice Saved", "Settings", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}