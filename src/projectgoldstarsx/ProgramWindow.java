package projectgoldstarsx;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ProgramWindow extends StandardWindow
{
    public ProgramWindow(String title)
    {
        super(title);
        frame.getContentPane().setBackground(ProjectGoldStarsX.color1);
    }
    
    public void add(JButton button)
    {
        frame.add(button);
    }
    
    public void add(JLabel label)
    {
        frame.add(label);
    }
    
    public void add(JPanel panel)
    {
        frame.add(panel);
    }
    
    public void add(JTextField textField)
    {
        frame.add(textField);
    }
    
    public void close()
    {
        frame.dispose();
    }
}