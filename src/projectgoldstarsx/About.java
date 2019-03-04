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
        setupAboutWindow();
    }
    
    //Initialize and set up the About window
    private void setupAboutWindow()
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
    
    //Returns the JMenuBar that will be added to the Help window
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);    //Set the background color of the menu bar
        menuBar.add(aboutFrame.getCloseButton());   //Add a Close button to the menu bar
        menuBar.add(aboutFrame.getMaximizeButton());    //Add a Maximize button to the menu bar
        menuBar.add(aboutFrame.getWindowMenu());    //Add the Window menu to the menu bar
        menuBar.add(new StandardButton("About Programs", new ListenersAbout.AboutProgramsListener()));   //Add an About Programs button to the menu bar
        return menuBar;
    }
    
    //Returns a JPanel containing the user's username and the version of Project GoldStars X
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.mainColor);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(username());
        row2.add(version());
        return row2;
    }
    
    //Returns a JPanel containing a Disclaimer button and a "More Information" button
    private JPanel row3()
    {
        JPanel row3 = new JPanel();
        row3.setBackground(ProjectGoldStarsX.mainColor);
        row3.setLayout(new GridLayout(1, 2));
        row3.add(new StandardButton("Disclaimer", new ListenersAbout.DisclaimerListener()));
        row3.add(new StandardButton("More Information", new MoreInformationListener()));
        return row3;
    }
    
    //Returns a JLabel containing the version of Project GoldStars X; this JLabel is then added to the JPanel row2
    private JLabel version()
    {
        JLabel versionLabel = new JLabel(ProjectGoldStarsX.VERSION, SwingConstants.CENTER);
        versionLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        versionLabel.setFont(ProjectGoldStarsX.mediumText1);
        return versionLabel;
    }
    
    //Returns a JLabel containing the user's username; this JLabel is thena dded to the JPanel row2
    private JLabel username()
    {
        JLabel userLabel = new JLabel("User: " + ProjectGoldStarsX.username, SwingConstants.CENTER);
        userLabel.setForeground(ProjectGoldStarsX.secondaryColor);
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