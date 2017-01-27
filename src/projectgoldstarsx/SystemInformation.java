package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
public class SystemInformation
{
    public static JInternalFrame systemInformationFrame;
    public static JLabel memoryUsageInformation;
    
    public SystemInformation()
    {
        systemInformation();
    }
    
    private void systemInformation()
    {
        systemInformationFrame = new JInternalFrame("System Information");
        ProjectGoldStarsX.desktop.add(systemInformationFrame);
        systemInformationFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        systemInformationFrame.setSize(1200 * ProjectGoldStarsX.multiplier, 650 * ProjectGoldStarsX.multiplier);
        systemInformationFrame.setLayout(new GridLayout(1, 3));
        systemInformationFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        systemInformationFrame.setJMenuBar(menuBar());
        systemInformationFrame.add(headingPanel());
        systemInformationFrame.add(informationPanel());
        systemInformationFrame.add(systemPanel());
        systemInformationFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Current Settings", new CurrentSettingsListener()));
        menuBar.add(Components.standardButton("Disclaimer", new ListenersAbout.DisclaimerListener()));
        menuBar.add(Components.standardButton("Error Log", new ListenersProgramsAction.ErrorLogListener()));
        menuBar.add(Components.standardButton("Troubleshoot Problems", new TroubleshootProblemsListener()));
        return menuBar;
    }
    
    private JPanel headingPanel()
    {
        JPanel headingPanel = new JPanel();
        headingPanel.setBackground(ProjectGoldStarsX.color1);
        headingPanel.setLayout(new GridLayout(3, 1));
        headingPanel.add(Components.headerLabel("Memory Usage:"));
        headingPanel.add(Components.headerLabel("Screen Resolution:"));
        headingPanel.add(Components.headerLabel("Time Project GoldStars X Last Started:"));
        return headingPanel;
    }
    
    private JPanel informationPanel()
    {
        JPanel informationPanel = new JPanel();
        informationPanel.setBackground(ProjectGoldStarsX.color1);
        informationPanel.setLayout(new GridLayout(3, 1));
        memoryUsageInformation = new JLabel();
        MatteBorder rightBorder = new MatteBorder(0, 0, 0, 1, ProjectGoldStarsX.color2);
        memoryUsageInformation.setBorder(rightBorder);
        memoryUsageInformation.setForeground(ProjectGoldStarsX.color2);
        memoryUsageInformation.setFont(ProjectGoldStarsX.mediumText2);
        memoryUsageInformation.setHorizontalAlignment(SwingConstants.CENTER);
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                memoryUsageInformation.setText("");
                Runtime r = Runtime.getRuntime();
                long usedMemory = (r.totalMemory() - r.freeMemory()) / 1024 / 1024;
                long totalMemory = (r.totalMemory()) / 1024 / 1024;
                memoryUsageInformation.setText(usedMemory + " MB of " + totalMemory + " MB");
            }
        }, 0, 1, TimeUnit.SECONDS);
        informationPanel.add(memoryUsageInformation);
        JLabel screenResolutionInformation = new JLabel();
        screenResolutionInformation.setBorder(rightBorder);
        screenResolutionInformation.setForeground(ProjectGoldStarsX.color2);
        screenResolutionInformation.setFont(ProjectGoldStarsX.mediumText2);
        screenResolutionInformation.setHorizontalAlignment(SwingConstants.CENTER);
        screenResolutionInformation.setText(ProjectGoldStarsX.width + "x" + ProjectGoldStarsX.height);
        informationPanel.add(screenResolutionInformation);
        JLabel lastStartDateInformation = new JLabel(ProjectGoldStarsX.startDate.toString());
        lastStartDateInformation.setBorder(rightBorder);
        lastStartDateInformation.setForeground(ProjectGoldStarsX.color2);
        lastStartDateInformation.setFont(ProjectGoldStarsX.mediumText2);
        lastStartDateInformation.setHorizontalAlignment(SwingConstants.CENTER);
        informationPanel.add(lastStartDateInformation);
        return informationPanel;
    }
    
    private JPanel systemPanel()
    {
        JPanel systemPanel = new JPanel();
        systemPanel.setBackground(ProjectGoldStarsX.color1);
        systemPanel.setLayout(new GridLayout(3, 1));
        JLabel snowOSLabel = new JLabel("Project GoldStars X", SwingConstants.CENTER);
        snowOSLabel.setForeground(ProjectGoldStarsX.color2);
        snowOSLabel.setFont(ProjectGoldStarsX.largeHeader);
        systemPanel.add(snowOSLabel);
        JLabel versionLabel = new JLabel(ProjectGoldStarsX.version, SwingConstants.CENTER);
        versionLabel.setForeground(ProjectGoldStarsX.color2);
        versionLabel.setFont(ProjectGoldStarsX.mediumText1);
        systemPanel.add(versionLabel);
        systemPanel.add(Components.standardButton("About Project GoldStars X", new ListenersProgramsAction.AboutListener()));
        return systemPanel;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            systemInformationFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(systemInformationFrame);
        }
    }
    
    public static class CurrentSettingsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            CurrentSettings cs = new CurrentSettings();
        }
    }
    
    public static class TroubleshootProblemsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new TroubleshootProblems();
        }
    }
}