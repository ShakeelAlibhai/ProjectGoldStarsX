package projectgoldstarsx;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
public class StandardMenu
{
    protected JMenu menu;
    
    public StandardMenu()
    {
        menu = new JMenu();
        setupMenu();
    }
    
    public StandardMenu(String title)
    {
        menu = new JMenu(title);
        setupMenu();
    }
    
    public JMenu getMenu()
    {
        return menu;
    }
    
    public void add(JLabel label)
    {
        menu.add(label);
    }
    
    public void add(JMenu menu)
    {
        this.menu.add(menu);
    }
    
    public void add(JMenuItem menuItem)
    {
        menu.add(menuItem);
    }
    
    public void add(JSeparator separator)
    {
        menu.add(separator);
    }
    
    public void setText(String text)
    {
        menu.setText(text);
    }
    
    private void setupMenu()
    {
        menu.setBackground(ProjectGoldStarsX.mainColor);
        menu.setForeground(ProjectGoldStarsX.secondaryColor);
        menu.setFont(ProjectGoldStarsX.mediumText1);
    }
}