package projectgoldstarsx;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class ListenersEducationMouse
{
    public static class PracticeAdditionListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            EduAdd ea = new EduAdd();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class PracticeSubtractionListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            EduSubtract es = new EduSubtract();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class PracticeMultiplicationListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            EduMultiply em = new EduMultiply();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class PracticeDivisionListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            EduDivide ed = new EduDivide();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class Reading3SentencesListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            Stories s = new Stories(3);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class Reading4SentencesListener implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            Stories s = new Stories(4);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
}