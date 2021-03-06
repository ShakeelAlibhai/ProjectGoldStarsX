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
        setupWindow();
    }
    
    //Create and set up the main Project GoldStars X window
    private void setupWindow()
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
    
    //Set the background color and, if using a theme that supports it, the wallpaper of the JDesktopPane
    private void background()
    {
        ProjectGoldStarsX.desktop.setBackground(ProjectGoldStarsX.mainColor);
        //Apply the Fire theme wallpaper
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
        //Apply the Forest theme wallpaper
        if(ProjectGoldStarsX.theme.equals("Forest"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Forest.jpg"));
        }
        //Apply the Mountain theme wallpaper
        if(ProjectGoldStarsX.theme.equals("Mountain"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Mountain.jpg"));
        }
        //Apply the Grass theme wallpaper
        if(ProjectGoldStarsX.theme.equals("Grass"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Grass.jpg"));
        }
        //Apply the Snow theme wallpaper
        if(ProjectGoldStarsX.theme.equals("Snow"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Snow.jpg"));
        }
        //Apply the Water theme wallpaper
        if(ProjectGoldStarsX.theme.equals("Water"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Water.jpg"));
        }
        //Apply the default wallpaper
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
    
    //Returns the JMenuBar that will be added to the main Project GoldStars X window
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(new Menu());
        menuBar.add(new StandardButton("Agenda", new ListenersProgramsAction.AgendaListener()));
        menuBar.add(new StandardButton("Browser", new ListenersProgramsAction.BrowserListener()));
        menuBar.add(new StandardButton("Calculator", new ListenersProgramsAction.CalculatorListener()));
        menuBar.add(new StandardButton("Files", new ListenersProgramsAction.FilesListener()));
        menuBar.add(new StandardButton("Notes", new ListenersProgramsAction.NotesListener()));
        menuBar.add(new StandardButton("Photos", new ListenersProgramsAction.PhotosListener()));
        menuBar.add(new StandardButton("Stories", new ListenersProgramsAction.StoriesListener()));
        menuBar.add(new StandardButton("Talk", new ListenersProgramsAction.TalkListener()));
        if(ProjectGoldStarsX.settingsButtonMainMenuBar)
        {
            menuBar.add(Components.settingsButton("Settings", new ListenersProgramsAction.SettingsListener()));
        }
        setupSearchField();
        menuBar.add(searchField);
        menuBar.add(new StandardButton("Search", new SearchListener()));
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
            searchField.setText("");    //Clear the text in the search text field
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