package projectgoldstarsx;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import static javafx.concurrent.Worker.State.FAILED;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class Browser extends JInternalFrame
{
    private final JFXPanel JFX_PANEL = new JFXPanel();
    private final JPanel PANEL = new JPanel(new BorderLayout());
    private JTextField urlField = new JTextField();
    private WebEngine browserEngine;
    
    public Browser()
    {
        super();
        browser();
    }
    
    private void browser()
    {
        setupWindow();
        setupURLField();
        Browser.this.setJMenuBar(menuBar());
        PANEL.add(JFX_PANEL, BorderLayout.CENTER);
        getContentPane().add(PANEL);
        ProjectGoldStarsX.desktop.add(Browser.this);
        setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        setPreferredSize(new Dimension(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier));
        setResizable(true);
        setTitle("Browser");
        pack();
        loadURL(ProjectGoldStarsX.homepage);
        setVisible(true);
    }
    
    private void setupURLField()
    {
        urlField.addActionListener(new GoListener());
        urlField.setFont(ProjectGoldStarsX.bodyText2);
        urlField.setBackground(ProjectGoldStarsX.textBackgroundColor);
        if(ProjectGoldStarsX.standardColors)
        {
            urlField.setForeground(ProjectGoldStarsX.secondaryColor);
        }
        else
        {
            urlField.setForeground(ProjectGoldStarsX.mainColor);
        }
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);    //Set the background color of the menu bar
        menuBar.add(Components.closeButton(new CloseListener()));   //Add a Close button to the menu bar
        menuBar.add(Components.maximizeButton(new MaximizeListener())); //Add a Maximize button to the menu bar
        menuBar.add(getWindowMenu());   //Add the Window menu to the menu bar
        menuBar.add(urlField);  //Add the URL field to the menu bar
        menuBar.add(new StandardButton("Go", new GoListener())); //Add a Go button to the menu bar
        menuBar.add(moreMenu());    //Add the More menu to the menu bar
        return menuBar;
    }
    
    //Returns the Window menu
    public JMenu getWindowMenu()
    {
        StandardMenu menu = new StandardMenu("Window");
        menu.add(Components.standardMenuItem("Move to Left Side of Screen", new LeftListener()));
        menu.add(Components.standardMenuItem("Move to Right Side of Screen", new RightListener()));
        menu.add(Components.standardMenuItem("Move to Top of Screen", new TopListener()));
        menu.add(Components.standardMenuItem("Move to Bottom of Screen", new BottomListener()));
        return menu.getMenu();
    }
    
    //Returns the More menu
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Browser", new AboutBrowserListener()));
        menu.add(Components.standardMenuItem("Change Homepage", new ChangeHomepageListener()));
        return menu.getMenu();
    }
    
    private void setupWindow()
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                WebView view = new WebView();
                browserEngine = view.getEngine();
                browserEngine.titleProperty().addListener(new ChangeListener<String>()
                {
                    public void changed(ObservableValue<? extends String> observableValue, String oldValue, final String newValue)
                    {
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                Browser.this.setTitle("Browser - " + newValue); //Set the title of the Browser window
                            }
                        });
                    }
                });
                browserEngine.locationProperty().addListener(new ChangeListener<String>()
                {
                    public void changed(ObservableValue<? extends String> observableValue, String oldValue, final String newValue)
                    {
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                urlField.setText(newValue);
                            }
                        });
                    }
                });
                browserEngine.getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>()
                {
                    public void changed(ObservableValue<? extends Throwable> observableValue, Throwable old, final Throwable value)
                    {
                        if(browserEngine.getLoadWorker().getState() == FAILED)
                        {
                            SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(null, "ERROR", "Browser", JOptionPane.ERROR_MESSAGE);
                                    ProjectGoldStarsX.errors.add("Error: Browser");
                                }
                            });
                        }
                    }
                });
                JFX_PANEL.setScene(new Scene(view));
            }
        });
    }
    
    public void loadURL(final String url)
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                String temp = toURL(url);
                if(temp == null)
                {
                    temp = toURL("http://" + url);
                }
                browserEngine.load(temp);
            }
        });
    }
    
    private String toURL(String temp)
    {
        try
        {
            return new URL(temp).toExternalForm();
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    public class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Browser.this.setVisible(false);
        }
    }
    
    public class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(Browser.this);
        }
    }
    
    public class LeftListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Browser.this.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class RightListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Browser.this.setLocation(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.menuBarHeight);
            Browser.this.setSize(ProjectGoldStarsX.width / 2, ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight);
        }
    }
    
    public class TopListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Browser.this.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
    
    public class BottomListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Browser.this.setLocation(0, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
            Browser.this.setSize(ProjectGoldStarsX.width, (ProjectGoldStarsX.height - ProjectGoldStarsX.menuBarHeight) / 2);
        }
    }
    
    public class GoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            loadURL(urlField.getText());
        }
    }
    
    public class AboutBrowserListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutBrowser();
        }
    }
    
    public class ChangeHomepageListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String tempHomepage = JOptionPane.showInputDialog(null, "Please enter your homepage:", "Change Homepage", JOptionPane.QUESTION_MESSAGE);
            if(tempHomepage == null)
            {
                return;
            }
            else
            {
                ProjectGoldStarsX.homepage = tempHomepage;
                //Save the homepage to the user's Project GoldStars X folder.
                PrintWriter out;
                try
                {
                    File file = new File(ProjectGoldStarsX.BROWSER_FOLDER, "homepage.txt");
                    out = new PrintWriter(file);
                    out.append(ProjectGoldStarsX.homepage);
                    out.close();
                }
                catch(FileNotFoundException e2)
                {

                }
            }
            String output = "Homepage saved!";
            JOptionPane.showMessageDialog(null, output, "Change Homepage", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}