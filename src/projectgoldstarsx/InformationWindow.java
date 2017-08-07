package projectgoldstarsx;
import java.awt.Font;
import javax.swing.JTextArea;
public class InformationWindow extends StandardWindow
{
    public InformationWindow(String title)
    {
        super(title);
        super.setStandardMenuBar();
    }
    
    public void addText(Font f, String s)
    {
        JTextArea textArea = new JTextArea(s);
        textArea.setEditable(false);
        textArea.setFont(f);
        frame.add(textArea);
    }
}