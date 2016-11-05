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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class ErrorLogSettings
{
    public static JInternalFrame settingsFrame;
    public static String output;
    
    public ErrorLogSettings()
    {
        errorLogSettings();
    }
    
    private void errorLogSettings()
    {
        settingsFrame = new JInternalFrame("Error Log Settings");
        ProjectGoldStarsX.desktop.add(settingsFrame);
        settingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        settingsFrame.setSize(850 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 1));
        settingsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        settingsFrame.setJMenuBar(menuBar);
        settingsFrame.add(Components.headerLabel("Error Log Search Case Sensitivity"));
        JLabel caseSensitivityQuestion = new JLabel("Do you want Error Log Search to be case sensitive?", SwingConstants.CENTER);
        caseSensitivityQuestion.setForeground(ProjectGoldStarsX.color2);
        caseSensitivityQuestion.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(caseSensitivityQuestion);
        JPanel caseSensitivityChoices = new JPanel();
        caseSensitivityChoices.setLayout(new GridLayout(1, 2));
        caseSensitivityChoices.add(Components.standardButton("Yes", new CaseSensitivityYesListener()));
        caseSensitivityChoices.add(Components.standardButton("No", new CaseSensitivityNoListener()));
        settingsFrame.add(caseSensitivityChoices);
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
    
    public static class CaseSensitivityYesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.errorLogSearchCaseSensitive = true;
            //Save the ErrorLog Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.errorLogFolder, "errorLogSearchCaseSensitive.txt");
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
            //Save the ErrorLog Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.errorLogFolder, "errorLogSearchCaseSensitive.txt");
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