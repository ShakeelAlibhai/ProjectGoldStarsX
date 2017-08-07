package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class StoryWindow
{
    public static boolean maximized = false;
    public static int storyType;
    public static int xCoordinate = 0;
    public static int yCoordinate = 0;
    public static JInternalFrame storyWindow;
    public static String title;
    public static String col1;
    
    /*
    Constructor
    Parameters: String "title," which is the title of the JInternalFrame;
        String "col1," which is the text in the first column of the JInternalFrame; and
        int "storyType," which is 0 for a random story, 3 for a 3-sentence story, or 4 for a 4-sentence story.
    */
    public StoryWindow(String title, String col1, int storyType)
    {
        this.title = title;
        this.col1 = col1;
        this.storyType = storyType;
        setupWindow();
    }
    
    private void setupWindow()
    {
        storyWindow = new JInternalFrame(title);
        ProjectGoldStarsX.desktop.add(storyWindow);
        storyWindow.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        storyWindow.setSize(900 * ProjectGoldStarsX.multiplier, 475 * ProjectGoldStarsX.multiplier);
        if(maximized)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(storyWindow);
        }
        storyWindow.setLayout(new GridLayout(1, 2));
        storyWindow.getContentPane().setBackground(ProjectGoldStarsX.color1);
        storyWindow.setJMenuBar(menuBar());
        storyWindow.setLocation(xCoordinate, yCoordinate);
        storyWindow.setResizable(true);
        storyWindow.add(Components.titleLabel(col1));
        storyWindow.add(col2());
        storyWindow.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Stories", new AboutStoriesListener()));
        return menu.getMenu();
    }
    
    private JPanel col2()
    {
        JPanel col2 = new JPanel();
        col2.setBackground(ProjectGoldStarsX.color1);
        col2.setLayout(new GridLayout(2, 1));
        col2.add(story());
        col2.add(newStory());
        return col2;
    }
    
    private JTextArea story()
    {
        JTextArea storyArea = new JTextArea();
        storyArea.setEditable(false);
        storyArea.setFont(ProjectGoldStarsX.bodyText1);
        Story s = new Story(storyType);
        storyArea.setText(s.getStory());
        return storyArea;
    }
    
    private JButton newStory()
    {
        return Components.standardButton("New Story", new NewStoryListener());
    }
    
    public static class NewStoryListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            xCoordinate = storyWindow.getX();
            yCoordinate = storyWindow.getY();
            storyWindow.dispose();
            new StoryWindow(title, col1, storyType);
        }
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            xCoordinate = 0;
            yCoordinate = 0;
            maximized = false;
            storyWindow.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            maximized = true;
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(storyWindow);
        }
    }
    
    public static class AboutStoriesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutStories();
        }
    }
}