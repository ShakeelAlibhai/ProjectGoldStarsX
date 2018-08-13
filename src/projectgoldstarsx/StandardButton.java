package projectgoldstarsx;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class StandardButton extends JButton
{
    public StandardButton(String displayText, ActionListener actionListener)
    {
        super(displayText);
        this.setBackground(ProjectGoldStarsX.secondaryColor);
        this.setForeground(ProjectGoldStarsX.mainColor);
        this.setFont(ProjectGoldStarsX.mediumText1);
        this.addActionListener(actionListener);
    }
}