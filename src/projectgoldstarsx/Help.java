package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
public class Help
{
    public static JInternalFrame helpFrame;
    
    public Help()
    {
        help();
    }
    
    private void help()
    {
        helpFrame = new JInternalFrame("Help");
        ProjectGoldStarsX.desktop.add(helpFrame);
        helpFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        helpFrame.setSize(1300 * ProjectGoldStarsX.multiplier, 725 * ProjectGoldStarsX.multiplier);
        helpFrame.setLayout(new GridLayout(3, 4));
        helpFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        helpFrame.setJMenuBar(menuBar());
        if("1".equals(ProjectGoldStarsX.language))
        {
            helpFrame.add(Components.headerLabel("Customize Project GoldStars X:"));
        }
        else
        {
            helpFrame.add(Components.headerLabel("Customise Project GoldStars X:"));
        }
        helpFrame.add(item("Change the Language", new ListenersHelp.LanguageListener()));
        helpFrame.add(item("Change the Theme", new ListenersHelp.ThemeListener()));
        helpFrame.add(item("Set a Location", new ListenersHelp.LocationListener()));
        helpFrame.add(Components.headerLabel("Talk:"));
        helpFrame.add(item("What is Talk?", new ListenersHelp.TalkIntroListener()));
        helpFrame.add(item("What can I say to Talk?", new ListenersHelp.TalkSuggestionsListener()));
        helpFrame.add(item("Set a Nickname", new ListenersHelp.NicknameListener()));
        helpFrame.add(Components.headerLabel("Advanced Tools:"));
        helpFrame.add(item("The Error Log", new ListenersHelp.ErrorsLogListener()));
        helpFrame.add(item("Commands", new ListenersHelp.CommandsListener()));
        helpFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("About Programs", new ListenersAbout.AboutProgramsListener()));
        menuBar.add(Components.standardButton("Troubleshoot Problems", new TroubleshootProblemsListener()));
        return menuBar;
    }
    
    private JLabel item(String itemName, MouseListener mouseListener)
    {
        JLabel item = new JLabel(itemName, SwingConstants.CENTER);
        item.setForeground(ProjectGoldStarsX.color2);
        item.setFont(ProjectGoldStarsX.mediumText2);
        item.addMouseListener(mouseListener);
        return item;
    }
    
    public static class CloseListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            helpFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(helpFrame);
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