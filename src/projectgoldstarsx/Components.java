package projectgoldstarsx;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
public class Components
{
    public static JButton standardButton(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(ProjectGoldStarsX.color2);
        button.setForeground(ProjectGoldStarsX.color1);
        button.setFont(ProjectGoldStarsX.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton button2(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(ProjectGoldStarsX.color2);
        button.setForeground(ProjectGoldStarsX.color1);
        button.setFont(ProjectGoldStarsX.mediumText2);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton closeButton(ActionListener actionListener)
    {
        JButton button = new JButton("Close");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setFont(ProjectGoldStarsX.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton maximizeButton(ActionListener actionListener)
    {
        JButton button = new JButton("Maximize");
        button.setBackground(new Color(0x00, 0xC0, 0x00));
        button.setForeground(Color.white);
        button.setFont(ProjectGoldStarsX.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton settingsButton(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(Color.lightGray);
        button.setForeground(Color.darkGray);
        button.setFont(ProjectGoldStarsX.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JLabel titleLabel(String displayText)
    {
        JLabel titleLabel = new JLabel(displayText, SwingConstants.CENTER);
        titleLabel.setForeground(ProjectGoldStarsX.color2);
        titleLabel.setFont(ProjectGoldStarsX.largeHeader);
        return titleLabel;
    }
    
    public static JLabel headerLabel(String displayText)
    {
        JLabel titleLabel = new JLabel(displayText, SwingConstants.CENTER);
        titleLabel.setForeground(ProjectGoldStarsX.color2);
        titleLabel.setFont(ProjectGoldStarsX.mediumHeader);
        return titleLabel;
    }
    
    public static JMenuItem standardMenuItem(String displayText, ActionListener actionListener)
    {
        JMenuItem menuItem = new JMenuItem(displayText);
        menuItem.setFont(ProjectGoldStarsX.mediumText3);
        menuItem.addActionListener(actionListener);
        return menuItem;
    }
}