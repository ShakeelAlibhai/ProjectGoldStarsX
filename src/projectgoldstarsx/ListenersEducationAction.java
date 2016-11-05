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
            EduAdd ea = new EduAdd();
        }
    }
    
    public static class PracticeSubtractionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            EduSubtract es = new EduSubtract();
        }
    }
    
    public static class PracticeMultiplicationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            EduMultiply em = new EduMultiply();
        }
    }
    
    public static class PracticeDivisionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            EduDivide ed = new EduDivide();
        }
    }
    
    public static class Reading3SentencesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Stories s = new Stories(3);
        }
    }
    
    public static class Reading4SentencesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Stories s = new Stories(4);
        }
    }
}