package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersAbout
{
    public static class AboutProgramsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms ap = new AboutPrograms();
        }
    }
    
    public static class DisclaimerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Disclaimer d = new Disclaimer();
        }
    }
}