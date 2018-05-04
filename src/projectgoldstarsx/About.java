package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class About
{
    public static ProgramWindow aboutFrame;
    
    public About()
    {
        about();
    }
    
    private void about()
    {
        aboutFrame = new ProgramWindow("About");
        aboutFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        aboutFrame.setLayout(new GridLayout(3, 1));
        aboutFrame.setJMenuBar(menuBar());
        aboutFrame.add(Components.titleLabel(ProjectGoldStarsX.NAME));
        aboutFrame.add(row2());
        aboutFrame.add(row3());
        aboutFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);    //Set the background color of the menu bar
        menuBar.add(aboutFrame.getCloseButton());   //Add a Close button to the menu bar
        menuBar.add(aboutFrame.getMaximizeButton());    //Add a Maximize button to the menu bar
        menuBar.add(aboutFrame.getWindowMenu());    //Add the Window menu to the menu bar
        menuBar.add(Components.standardButton("About Programs", new ListenersAbout.AboutProgramsListener()));   //Add an About Programs button to the menu bar
        return menuBar;
    }
    
    //Returns a JPanel containing the user's username and the version of Project GoldStars X
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.color1);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(username());
        row2.add(version());
        return row2;
    }
    
    //Returns a JPanel containing a Disclaimer button and a "More Information" button
    private JPanel row3()
    {
        JPanel row3 = new JPanel();
        row3.setBackground(ProjectGoldStarsX.color1);
        row3.setLayout(new GridLayout(1, 2));
        row3.add(Components.standardButton("Disclaimer", new ListenersAbout.DisclaimerListener()));
        row3.add(Components.standardButton("More Information", new MoreInformationListener()));
        return row3;
    }
    
    //Returns a JLabel containing the version of Project GoldStars X
    private JLabel version()
    {
        JLabel versionLabel = new JLabel(ProjectGoldStarsX.VERSION, SwingConstants.CENTER);
        versionLabel.setForeground(ProjectGoldStarsX.color2);
        versionLabel.setFont(ProjectGoldStarsX.mediumText1);
        return versionLabel;
    }
    
    //Returns a JLabel containing the user's username
    private JLabel username()
    {
        JLabel userLabel = new JLabel("User: " + ProjectGoldStarsX.username, SwingConstants.CENTER);
        userLabel.setForeground(ProjectGoldStarsX.color2);
        userLabel.setFont(ProjectGoldStarsX.mediumText1);
        return userLabel;
    }
    
    public static class MoreInformationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new MoreInformation();
        }
    }
}