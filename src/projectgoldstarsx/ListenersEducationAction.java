package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersEducationAction
{
    public static class PracticeAdditionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new EduAdd();
        }
    }
    
    public static class PracticeSubtractionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new EduSubtract();
        }
    }
    
    public static class PracticeMultiplicationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new EduMultiply();
        }
    }
    
    public static class PracticeDivisionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new EduDivide();
        }
    }
    
    public static class Reading3SentencesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new StoryWindow("3-Sentence Story", "Education", 3);
        }
    }
    
    public static class Reading4SentencesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new StoryWindow("4-Sentence Story", "Education", 4);
        }
    }
}