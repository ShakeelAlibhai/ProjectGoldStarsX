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
            new Light(Color.blue);
        }
    }
    
    public static class CyanListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.cyan);
        }
    }
    
    public static class DarkGreenListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(new Color(0x00, 0xC0, 0x00));
        }
    }
    
    public static class GrayListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.gray);
        }
    }
    
    public static class GreenListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.green);
        }
    }
    
    public static class LightGrayListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.lightGray);
        }
    }
    
    public static class LightRedListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(new Color(0xFF, 0x40, 0x40));
        }
    }
    
    public static class OrangeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.orange);
        }
    }
    
    public static class PinkListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.pink);
        }
    }
    
    public static class RedListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.red);
        }
    }
    
    public static class YellowListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.yellow);
        }
    }
    
    public static class WhiteListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Light(Color.white);
        }
    }
}