package projectgoldstarsx;
import java.net.URL;
import javax.swing.ImageIcon;
public class ProjectGoldStarsXIconMini
{
    public static ImageIcon getIcon()
    {
        URL url = ProjectGoldStarsXIconMini.class.getResource("/images/ProjectGoldStarsXIconMini.png");
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }
}