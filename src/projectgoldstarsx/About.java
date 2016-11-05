package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class About
{
    public static JInternalFrame aboutFrame;
    
    public About()
    {
        about();
    }
    
    private void about()
    {
        aboutFrame = new JInternalFrame("About");
        ProjectGoldStarsX.desktop.add(aboutFrame);
        aboutFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        aboutFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        aboutFrame.setLayout(new GridLayout(2, 1));
        aboutFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        aboutFrame.setJMenuBar(menuBar());
        aboutFrame.add(Components.titleLabel(ProjectGoldStarsX.name));
        aboutFrame.add(row2());
        aboutFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("About Programs", new ListenersAbout.AboutProgramsListener()));
        menuBar.add(Components.standardButton("Disclaimer", new ListenersAbout.DisclaimerListener()));
        menuBar.add(Components.standardButton("Help", new ListenersProgramsAction.HelpListener()));
        menuBar.add(Components.standardButton("System Information", new ListenersProgramsAction.SystemInformationListener()));
        return menuBar;
    }
    
    private JPanel row2()
    {
        JPanel row2 = new JPanel();
        row2.setBackground(ProjectGoldStarsX.color1);
        row2.setLayout(new GridLayout(1, 2));
        row2.add(username());
        row2.add(version());
        return row2;
    }
    
    private JLabel version()
    {
        JLabel versionLabel = new JLabel(ProjectGoldStarsX.version, SwingConstants.CENTER);
        versionLabel.setForeground(ProjectGoldStarsX.color2);
        versionLabel.setFont(ProjectGoldStarsX.mediumText1);
        return versionLabel;
    }
    
    private JLabel username()
    {
        JLabel userLabel = new JLabel("User: " + ProjectGoldStarsX.username, SwingConstants.CENTER);
        userLabel.setForeground(ProjectGoldStarsX.color2);
        userLabel.setFont(ProjectGoldStarsX.mediumText1);
        return userLabel;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            aboutFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(aboutFrame);
        }
    }
}