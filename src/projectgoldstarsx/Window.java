package projectgoldstarsx;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
public class Window extends JFrame implements ActionListener, ItemListener
{
    private static JTextField searchField;
    
    public Window()
    {
        buildWindow();
    }
    
    private void buildWindow()
    {
        JFrame frame = new JFrame("Project GoldStars X");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100 * ProjectGoldStarsX.multiplier, 575 * ProjectGoldStarsX.multiplier);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());
        frame.setUndecorated(true);
        frame.setIconImage(getImage());
        frame.getContentPane().setBackground(ProjectGoldStarsX.mainColor);
        frame.setJMenuBar(menuBar());
        ProjectGoldStarsX.desktop = new JDesktopPane();
        background();
        frame.add(ProjectGoldStarsX.desktop);
        frame.setVisible(true);
    }
    
    private Image getImage()
    {
        URL url = getClass().getResource("/images/ProjectGoldStarsXIcon.png");
        Image im = Toolkit.getDefaultToolkit().getImage(url);
        return im;
    }
    
    private void background()
    {
        ProjectGoldStarsX.desktop.setBackground(ProjectGoldStarsX.mainColor);
        if(ProjectGoldStarsX.theme.equals("Fire"))
        {
            //1280x800 wallpaper
            if(ProjectGoldStarsX.width <= 1280 && ProjectGoldStarsX.height <= 800)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_1280x800.PNG"));
            }
            //1366x768 wallpaper
            else if(ProjectGoldStarsX.width <= 1366 && ProjectGoldStarsX.height <= 768)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_1366x768.PNG"));
            }
            //1440x900 wallpaper
            else if(ProjectGoldStarsX.width <= 1440 && ProjectGoldStarsX.height <= 900)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_1440x900.PNG"));
            }
            //1920x1080 wallpaper
            else if(ProjectGoldStarsX.width <= 1920 && ProjectGoldStarsX.height <= 1080)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_1920x1080.PNG"));
            }
            //2560x1440 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1440)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_2560x1440.PNG"));
            }
            //2560x1600 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1600)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_2560x1600.PNG"));
            }
            //3840x2160 wallpaper
            else if(ProjectGoldStarsX.width <= 3840 && ProjectGoldStarsX.height <= 2160)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_3840x2160.PNG"));
            }
            //5120x2880 wallpaper
            else
            {
                applyWallpaper(getClass().getResource("/wallpaper/Fire_5120x2880.PNG"));
            }
        }
        if(ProjectGoldStarsX.theme.equals("Forest"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Forest.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Mountain"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Mountain.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Grass"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Grass.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Snow"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Snow.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Water"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Water.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Project GoldStars X"))
        {
            //1280x800 wallpaper
            if(ProjectGoldStarsX.width <= 1280 && ProjectGoldStarsX.height <= 800)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_1280x800.PNG"));
            }
            //1366x768 wallpaper
            else if(ProjectGoldStarsX.width <= 1366 && ProjectGoldStarsX.height <= 768)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_1366x768.PNG"));
            }
            //1440x900 wallpaper
            else if(ProjectGoldStarsX.width <= 1440 && ProjectGoldStarsX.height <= 900)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_1440x900.PNG"));
            }
            //1920x1080 wallpaper
            else if(ProjectGoldStarsX.width <= 1920 && ProjectGoldStarsX.height <= 1080)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_1920x1080.PNG"));
            }
            //2560x1440 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1440)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_2560x1440.PNG"));
            }
            //2560x1600 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1600)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_2560x1600.PNG"));
            }
            //3840x2160 wallpaper
            else if(ProjectGoldStarsX.width <= 3840 && ProjectGoldStarsX.height <= 2160)
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_3840x2160.PNG"));
            }
            //5120x2880 wallpaper
            else
            {
                applyWallpaper(getClass().getResource("/wallpaper/ProjectGoldStarsX_5120x2880.PNG"));
            }
        }
    }
    
    private void applyWallpaper(URL url)
    {
        ImageIcon image = new ImageIcon(url);
        JLabel wallpaper = new JLabel(image);
        wallpaper.setBounds(0, 0, ProjectGoldStarsX.width, ProjectGoldStarsX.height);
        wallpaper.setSize(ProjectGoldStarsX.width, ProjectGoldStarsX.height);
        ProjectGoldStarsX.desktop.add(wallpaper);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(Menu.menu());
        menuBar.add(Components.standardButton("Agenda", new ListenersProgramsAction.AgendaListener()));
        menuBar.add(Components.standardButton("Browser", new ListenersProgramsAction.BrowserListener()));
        menuBar.add(Components.standardButton("Calculator", new ListenersProgramsAction.CalculatorListener()));
        menuBar.add(Components.standardButton("Files", new ListenersProgramsAction.FilesListener()));
        menuBar.add(Components.standardButton("Notes", new ListenersProgramsAction.NotesListener()));
        menuBar.add(Components.standardButton("Photos", new ListenersProgramsAction.PhotosListener()));
        menuBar.add(Components.standardButton("Stories", new ListenersProgramsAction.StoriesListener()));
        menuBar.add(Components.standardButton("Talk", new ListenersProgramsAction.TalkListener()));
        if(ProjectGoldStarsX.settingsButtonMainMenuBar)
        {
            menuBar.add(Components.settingsButton("Settings", new ListenersProgramsAction.SettingsListener()));
        }
        setupSearchField();
        menuBar.add(searchField);
        menuBar.add(Components.standardButton("Search", new SearchListener()));
        menuBar.add(ClockMenu.clockMenu());
        ProjectGoldStarsX.menuBarHeight = menuBar.getHeight();
        return menuBar;
    }
    
    private void setupSearchField()
    {
        searchField = new JTextField();
        searchField.setText("Search Project GoldStars X");
        searchField.setFont(ProjectGoldStarsX.bodyText2);
        searchField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        if(ProjectGoldStarsX.standardColors)
        {
            searchField.setForeground(ProjectGoldStarsX.secondaryColor);
        }
        else
        {
            searchField.setForeground(ProjectGoldStarsX.mainColor);
        }
        searchField.addActionListener(new SearchListener());
    }
    
    public static class SearchListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new Search(searchField.getText());
            searchField.setText("");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}