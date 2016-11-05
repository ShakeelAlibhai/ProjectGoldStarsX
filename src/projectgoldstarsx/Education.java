package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
public class Education
{
    public static JInternalFrame educationFrame;
    
    public Education()
    {
        education();
    }
    
    private void education()
    {
        educationFrame = new JInternalFrame("Education");
        ProjectGoldStarsX.desktop.add(educationFrame);
        educationFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        educationFrame.setSize(900 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        educationFrame.setLayout(new GridLayout(3, 3));
        educationFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        educationFrame.setJMenuBar(menuBar());
        educationFrame.add(Components.headerLabel("Math:"));
        educationFrame.add(action("Practice Addition", new ListenersEducationMouse.PracticeAdditionListener()));
        educationFrame.add(action("Practice Subtraction", new ListenersEducationMouse.PracticeSubtractionListener()));
        educationFrame.add(new JLabel());
        educationFrame.add(action("Practice Multiplication", new ListenersEducationMouse.PracticeMultiplicationListener()));
        educationFrame.add(action("Practice Division", new ListenersEducationMouse.PracticeDivisionListener()));
        educationFrame.add(Components.headerLabel("Reading:"));
        educationFrame.add(action("3-Sentence Story", new ListenersEducationMouse.Reading3SentencesListener()));
        educationFrame.add(action("4-Sentence Story", new ListenersEducationMouse.Reading4SentencesListener()));
        educationFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        return menuBar;
    }
    
    private JLabel action(String actionName, MouseListener mouseListener)
    {
        JLabel action = new JLabel(actionName, SwingConstants.CENTER);
        action.setForeground(ProjectGoldStarsX.color2);
        action.setFont(ProjectGoldStarsX.mediumText2);
        action.addMouseListener(mouseListener);
        return action;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            educationFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(educationFrame);
        }
    }
}