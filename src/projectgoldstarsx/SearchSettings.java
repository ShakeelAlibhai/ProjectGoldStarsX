package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class SearchSettings
{
    public static ProgramWindow settingsFrame;
    
    public SearchSettings()
    {
        searchSettings();
    }
    
    private void searchSettings()
    {
        settingsFrame = new ProgramWindow("Search Settings");
        settingsFrame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 1));
        settingsFrame.setStandardMenuBar();
        settingsFrame.add(Components.headerLabel("Search Case Sensitivity"));
        settingsFrame.add(Components.questionHeaderLabel("Do you want Search to be case sensitive?"));
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
            ProjectGoldStarsX.searchCaseSensitive = true;
            //Save the Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.SEARCH_FOLDER, "searchCaseSensitive.txt");
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
            ProjectGoldStarsX.searchCaseSensitive = false;
            //Save the Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.SEARCH_FOLDER, "searchCaseSensitive.txt");
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