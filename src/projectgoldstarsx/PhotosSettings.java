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
public class PhotosSettings
{
    public static JInternalFrame settingsFrame;
    public static String output;
    
    public PhotosSettings()
    {
        photosSettings();
    }
    
    private void photosSettings()
    {
        settingsFrame = new JInternalFrame("Photos Settings");
        ProjectGoldStarsX.desktop.add(settingsFrame);
        settingsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        settingsFrame.setSize(850 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        settingsFrame.setLayout(new GridLayout(3, 2));
        settingsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        settingsFrame.setJMenuBar(menuBar);
        settingsFrame.add(Components.headerLabel("Photos Search Case Sensitivity"));
        settingsFrame.add(Components.headerLabel("Password-Protected Photos"));
        JLabel caseSensitivityQuestion = new JLabel("Do you want Photos Search to be case sensitive?", SwingConstants.CENTER);
        caseSensitivityQuestion.setForeground(ProjectGoldStarsX.color2);
        caseSensitivityQuestion.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(caseSensitivityQuestion);
        JLabel passwordProtectedQuestion = new JLabel("Do you want photos to be password-protected?", SwingConstants.CENTER);
        passwordProtectedQuestion.setForeground(ProjectGoldStarsX.color2);
        passwordProtectedQuestion.setFont(ProjectGoldStarsX.mediumText1);
        settingsFrame.add(passwordProtectedQuestion);
        JPanel caseSensitivityChoices = new JPanel();
        caseSensitivityChoices.setLayout(new GridLayout(1, 2));
        caseSensitivityChoices.add(Components.standardButton("Yes", new CaseSensitivityYesListener()));
        caseSensitivityChoices.add(Components.standardButton("No", new CaseSensitivityNoListener()));
        settingsFrame.add(caseSensitivityChoices);
        JPanel passwordProtectedChoices = new JPanel();
        passwordProtectedChoices.setLayout(new GridLayout(1, 2));
        passwordProtectedChoices.add(Components.standardButton("Yes", new PasswordProtectedYesListener()));
        passwordProtectedChoices.add(Components.standardButton("No", new PasswordProtectedNoListener()));
        settingsFrame.add(passwordProtectedChoices);
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
            ProjectGoldStarsX.photosSearchCaseSensitive = true;
            //Save the Photos Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.photosFolder, "photosSearchCaseSensitive.txt");
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
            ProjectGoldStarsX.photosSearchCaseSensitive = false;
            //Save the Photos Search case sensitivity choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.photosFolder, "photosSearchCaseSensitive.txt");
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
    
    public static class PasswordProtectedYesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.passwordProtectedPhotos = true;
            //Save the Photos password-protection choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.photosFolder, "passwordProtectedPhotos.txt");
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
    
    public static class PasswordProtectedNoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.passwordProtectedPhotos = false;
            //Save the Photos password-protection choice to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.photosFolder, "passwordProtectedPhotos.txt");
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