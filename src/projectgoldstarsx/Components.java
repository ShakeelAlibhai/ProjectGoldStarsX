package projectgoldstarsx;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
public class Components
{
    public static JButton inverseStandardButton(String displayText, ActionListener actionListener)
    {
        StandardButton button = new StandardButton(displayText, actionListener);
        button.setBackground(ProjectGoldStarsX.mainColor);
        button.setForeground(ProjectGoldStarsX.secondaryColor);
        return button;
    }
    
    public static JButton button2(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(ProjectGoldStarsX.secondaryColor);
        button.setForeground(ProjectGoldStarsX.mainColor);
        button.setFont(ProjectGoldStarsX.mediumText2);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton closeButton(ActionListener actionListener)
    {
        StandardButton button = new StandardButton("Close", actionListener);
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        return button;
    }
    
    public static JButton maximizeButton(ActionListener actionListener)
    {
        StandardButton button = new StandardButton("Maximize", actionListener);
        button.setBackground(new Color(0x00, 0xC0, 0x00));
        button.setForeground(Color.white);
        return button;
    }
    
    public static JButton settingsButton(String displayText, ActionListener actionListener)
    {
        StandardButton button = new StandardButton(displayText, actionListener);
        button.setBackground(Color.lightGray);
        button.setForeground(Color.darkGray);
        return button;
    }
    
    public static JLabel titleLabel(String displayText)
    {
        JLabel label = new JLabel(displayText, SwingConstants.CENTER);
        label.setForeground(ProjectGoldStarsX.secondaryColor);
        label.setFont(ProjectGoldStarsX.largeHeader);
        return label;
    }
    
    public static JLabel headerLabel(String displayText)
    {
        JLabel label = new JLabel(displayText, SwingConstants.CENTER);
        label.setForeground(ProjectGoldStarsX.secondaryColor);
        label.setFont(ProjectGoldStarsX.mediumHeader);
        return label;
    }
    
    public static JLabel actionLabel(String actionName, MouseListener mouseListener)
    {
        JLabel label = new JLabel(actionName, SwingConstants.CENTER);
        label.setForeground(ProjectGoldStarsX.secondaryColor);
        label.setFont(ProjectGoldStarsX.mediumText2);
        label.addMouseListener(mouseListener);
        return label;
    }
    
    public static JLabel questionHeaderLabel(String displayText)
    {
        JLabel label = new JLabel(displayText, SwingConstants.CENTER);
        label.setForeground(ProjectGoldStarsX.secondaryColor);
        label.setFont(ProjectGoldStarsX.mediumText1);
        return label;
    }
    
    public static JLabel standardLabel(String displayText)
    {
        JLabel label = new JLabel(displayText);
        label.setForeground(ProjectGoldStarsX.secondaryColor);
        label.setFont(ProjectGoldStarsX.bodyText1);
        return label;
    }
    
    //Deprecated in Version 2.7 -- use StandardMenuItem class instead
    public static JMenuItem standardMenuItem(String displayText, ActionListener actionListener)
    {
        StandardMenuItem menuItem = new StandardMenuItem(displayText, actionListener);
        return menuItem;
    }
}