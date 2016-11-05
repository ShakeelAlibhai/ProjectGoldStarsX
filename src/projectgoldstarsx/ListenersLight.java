package projectgoldstarsx;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersLight
{
    public static class BlueListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.blue);
        }
    }
    
    public static class CyanListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.cyan);
        }
    }
    
    public static class GreenListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.green);
        }
    }
    
    public static class RedListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.red);
        }
    }
    
    public static class YellowListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.yellow);
        }
    }
    
    public static class WhiteListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Light l = new Light(Color.white);
        }
    }
}