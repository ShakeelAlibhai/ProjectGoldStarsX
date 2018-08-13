package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
public class StandardWindow
{
    protected JInternalFrame frame;
    
    public StandardWindow(String title)
    {
        frame = new JInternalFrame(title);
        ProjectGoldStarsX.desktop.add(frame);
        frame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        frame.setResizable(true);
    }
    
    public JButton getCloseButton()
    {
        return Components.closeButton(new CloseListener());
    }
    
    public JButton getMaximizeButton()
    {
        return Components.maximizeButton(new MaximizeListener());
    }
    
    public JMenu getWindowMenu()
    {
        StandardMenu menu = new StandardMenu("Window");
        menu.add(Components.standardMenuItem("Move to Left Side of Screen", new LeftListener()));
        menu.add(Components.standardMenuItem("Move to Right Side of Screen", new RightListener()));
        menu.add(Components.standardMenuItem("Move to Top of Screen", new TopListener()));
        menu.add(Components.standardMenuItem("Move to Bottom of Screen", new BottomListener()));
        return menu.getMenu();
    }
    
    public void dispose()
    {
        frame.dispose();
    }
    
    public void makeVisible()
    {
        frame.setVisible(true);
    }
    
    public void setJMenuBar(JMenuBar menuBar)
    {
        frame.setJMenuBar(menuBar);
    }
    
    public void setStandardMenuBar()
    {
        frame.setJMenuBar(standardMenuBar());
    }
    
    public void setInstructionsMenuBar(String instructions)
    {
        frame.setJMenuBar(instructionsMenuBar(instructions));
    }
    
    public void setLayout(GridLayout g)
    {
        frame.setLayout(g);
    }
    
    public void setSize(int a, int b)
    {
        frame.setSize(a, b);
    }
    
    private JMenuBar standardMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(getCloseButton());
        menuBar.add(getMaximizeButton());
        menuBar.add(getWindowMenu());
        return menuBar;
    }
    
    private JMenuBar instructionsMenuBar(String instructions)
    {
        JMenuBar menuBar = standardMenuBar();
        menuBar.add(instructionsLabel(instructions));
        return menuBar;
    }
    
    private JLabel instructionsLabel(String instructions)
    {
        JLabel instructionsLabel = new JLabel(instructions);
        instructionsLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText2);
        return instructionsLabel;
    }
    
    private class CloseListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            frame.dispose();
        }
    }
    
    private class MaximizeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(frame);
        }
    }
    
    public class LeftListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            frame.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class RightListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            frame.setLocation(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.menuBarHeight);
            frame.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class TopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            frame.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
    
    public class BottomListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            frame.setLocation(0, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
            frame.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
}