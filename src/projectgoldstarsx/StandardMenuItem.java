package projectgoldstarsx;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
public class StandardMenuItem extends JMenuItem
{
    public StandardMenuItem(String displayText, ActionListener actionListener)
    {
        super(displayText);
        this.setFont(ProjectGoldStarsX.mediumText3);
        this.addActionListener(actionListener);
    }
}