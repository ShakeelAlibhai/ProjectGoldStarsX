package projectgoldstarsx;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
public class Window extends JFrame implements ActionListener, ItemListener
{
    private static JTextField searchTextField;
    private static JLabel timeLabel;
    
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
        URL url = getClass().getResource("/images/ProjectGoldStarsXIcon.png");
        Image im = Toolkit.getDefaultToolkit().getImage(url);
        frame.setIconImage(im);
        frame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        frame.setJMenuBar(menuBar());
        ProjectGoldStarsX.desktop = new JDesktopPane();
        background();
        frame.add(ProjectGoldStarsX.desktop);
        frame.setVisible(true);
    }
    
    private void background()
    {
        ProjectGoldStarsX.desktop.setBackground(ProjectGoldStarsX.color1);
        if(ProjectGoldStarsX.theme.equals("Snow"))
        {
            //1280x800 wallpaper
            if(ProjectGoldStarsX.width <= 1280 && ProjectGoldStarsX.height <= 800)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_1280x800.PNG"));
            }
            //1366x768 wallpaper
            else if(ProjectGoldStarsX.width <= 1366 && ProjectGoldStarsX.height <= 768)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_1366x768.PNG"));
            }
            //1440x900 wallpaper
            else if(ProjectGoldStarsX.width <= 1440 && ProjectGoldStarsX.height <= 900)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_1440x900.PNG"));
            }
            //1920x1080 wallpaper
            else if(ProjectGoldStarsX.width <= 1920 && ProjectGoldStarsX.height <= 1080)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_1920x1080.PNG"));
            }
            //2560x1440 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1440)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_2560x1440.PNG"));
            }
            //2560x1600 wallpaper
            else if(ProjectGoldStarsX.width <= 2560 && ProjectGoldStarsX.height <= 1600)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_2560x1600.PNG"));
            }
            //3840x2160 wallpaper
            else if(ProjectGoldStarsX.width <= 3840 && ProjectGoldStarsX.height <= 2160)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_3840x2160.PNG"));
            }
            //4096x2304 wallpaper
            else if(ProjectGoldStarsX.width <= 4096 && ProjectGoldStarsX.height <= 2304)
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_4096x2304.PNG"));
            }
            //5120x2880 wallpaper
            else
            {
                applyWallpaper(getClass().getResource("/wallpaper/Snow_5120x2880.PNG"));
            }
        }
        if(ProjectGoldStarsX.theme.equals("Grass"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Grass.jpg"));
        }
        if(ProjectGoldStarsX.theme.equals("Water"))
        {
            applyWallpaper(getClass().getResource("/wallpaper/Water.jpg"));
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
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Menu.menu());
        menuBar.add(Components.standardButton("Browser", new ListenersProgramsAction.BrowserListener()));
        menuBar.add(Components.standardButton("Calendar", new ListenersProgramsAction.CalendarListener()));
        menuBar.add(Components.standardButton("Calculator", new ListenersProgramsAction.CalculatorListener()));
        menuBar.add(Components.standardButton("Notes", new ListenersProgramsAction.NotesListener()));
        menuBar.add(Components.standardButton("Photos", new ListenersProgramsAction.PhotosListener()));
        menuBar.add(Components.standardButton("Talk", new ListenersProgramsAction.TalkListener()));
        menuBar.add(Components.standardButton("Stories", new ListenersProgramsAction.StoriesListener()));
        menuBar.add(Components.standardButton("Files", new ListenersProgramsAction.FilesListener()));
        menuBar.add(Components.standardButton("About", new ListenersProgramsAction.AboutListener()));
        setupSearchField();
        menuBar.add(searchTextField);
        menuBar.add(Components.standardButton("Search", new SearchListener()));
        setupTimeLabel();
        menuBar.add(timeLabel);
        return menuBar;
    }
    
    private void setupSearchField()
    {
        searchTextField = new JTextField();
        searchTextField.setText("Search Project GoldStars X");
        searchTextField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            searchTextField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            searchTextField.setForeground(ProjectGoldStarsX.color1);
        }
        searchTextField.addActionListener(new SearchListener());
    }
    
    private void setupTimeLabel()
    {
        timeLabel = new JLabel();
        timeLabel.setForeground(ProjectGoldStarsX.color2);
        timeLabel.setFont(ProjectGoldStarsX.mediumText1);
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable()
        {
            @Override
            public void run()
            {
                Date time = new Date();
                timeLabel.setText(" " + DateFormat.getTimeInstance(DateFormat.SHORT).format(time) + " ");
            }
        }, 0, 1, TimeUnit.SECONDS);
        timeLabel.addMouseListener(new ListenersProgramsMouse.CalendarListener());
    }
    
    public static class SearchListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Search s = new Search(searchTextField.getText());
            searchTextField.setText("");
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