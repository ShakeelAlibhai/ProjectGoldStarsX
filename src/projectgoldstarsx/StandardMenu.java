package projectgoldstarsx;
import javax.swing.JMenu;
public class StandardMenu extends JMenu
{
    public StandardMenu()
    {
        super();
        setupMenu();
    }
    
    public StandardMenu(String title)
    {
        super(title);
        setupMenu();
    }
    
    public JMenu getMenu()
    {
        return this;
    }
    
    private void setupMenu()
    {
        this.setBackground(ProjectGoldStarsX.mainColor);
        this.setForeground(ProjectGoldStarsX.secondaryColor);
        this.setFont(ProjectGoldStarsX.mediumText1);
    }
}