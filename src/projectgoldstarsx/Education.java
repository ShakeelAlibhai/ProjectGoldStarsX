package projectgoldstarsx;
import java.awt.GridLayout;
import javax.swing.JLabel;
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
        educationFrame.setLayout(new GridLayout(3, 3));
        educationFrame.setStandardMenuBar();
        educationFrame.add(Components.headerLabel("Math:"));
        educationFrame.add(Components.actionLabel("Practice Addition", new ListenersEducationMouse.PracticeAdditionListener()));
        educationFrame.add(Components.actionLabel("Practice Subtraction", new ListenersEducationMouse.PracticeSubtractionListener()));
        educationFrame.add(new JLabel());
        educationFrame.add(Components.actionLabel("Practice Multiplication", new ListenersEducationMouse.PracticeMultiplicationListener()));
        educationFrame.add(Components.actionLabel("Practice Division", new ListenersEducationMouse.PracticeDivisionListener()));
        educationFrame.add(Components.headerLabel("Reading:"));
        educationFrame.add(Components.actionLabel("3-Sentence Story", new ListenersEducationMouse.Reading3SentencesListener()));
        educationFrame.add(Components.actionLabel("4-Sentence Story", new ListenersEducationMouse.Reading4SentencesListener()));
        educationFrame.makeVisible();
    }
}