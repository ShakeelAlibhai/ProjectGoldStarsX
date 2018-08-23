package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
public class Education
{
    public static ProgramWindow educationFrame;
    
    public Education()
    {
        education();
    }
    
    private void education()
    {
        educationFrame = new ProgramWindow("Education");
        educationFrame.setSize(900 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        educationFrame.setLayout(new GridLayout(3, 4));
        educationFrame.setJMenuBar(menuBar());
        educationFrame.add(Components.headerLabel("Math:"));
        educationFrame.add(Components.actionLabel("Practice Addition", new ListenersEducationMouse.PracticeAdditionListener()));
        educationFrame.add(Components.actionLabel("Practice Subtraction", new ListenersEducationMouse.PracticeSubtractionListener()));
        educationFrame.add(Components.actionLabel("Practice Multiplication", new ListenersEducationMouse.PracticeMultiplicationListener()));
        educationFrame.add(new JLabel());
        educationFrame.add(Components.actionLabel("Practice Division", new ListenersEducationMouse.PracticeDivisionListener()));
        educationFrame.add(Components.actionLabel("Practice Square Roots", new ListenersEducationMouse.PracticeSquareRootsListener()));
        educationFrame.add(new JLabel());
        educationFrame.add(Components.headerLabel("Reading:"));
        educationFrame.add(Components.actionLabel("3-Sentence Story", new ListenersEducationMouse.Reading3SentencesListener()));
        educationFrame.add(Components.actionLabel("4-Sentence Story", new ListenersEducationMouse.Reading4SentencesListener()));
        educationFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(educationFrame.getCloseButton());
        menuBar.add(educationFrame.getMaximizeButton());
        menuBar.add(educationFrame.getWindowMenu());
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Education", new AboutEducationListener()));
        return menu.getMenu();
    }
    
    public static class AboutEducationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutEducation();
        }
    }
}