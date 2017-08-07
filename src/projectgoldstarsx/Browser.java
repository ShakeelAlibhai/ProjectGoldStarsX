package projectgoldstarsx;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private final JFXPanel jfxPanel = new JFXPanel();
    private final JPanel panel = new JPanel(new BorderLayout());
    private static JTextField urlField = new JTextField();
    private static WebEngine engine;
    
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
        panel.add(jfxPanel, BorderLayout.CENTER);
        getContentPane().add(panel);
        ProjectGoldStarsX.desktop.add(Browser.this);
        setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        setPreferredSize(new Dimension(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier));
        setResizable(true);
        setTitle("Browser");
        pack();
        loadURL("http://google.com");
        setVisible(true);
    }
    
    private void setupURLField()
    {
        urlField.addActionListener(new GoListener());
        urlField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(urlField);
        menuBar.add(Components.standardButton("Go", new GoListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Browser", new AboutBrowserListener()));
        return menu.getMenu();
    }
    
    private void setupWindow()
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                WebView view = new WebView();
                engine = view.getEngine();
                engine.titleProperty().addListener(new ChangeListener<String>()
                {
                    public void changed(ObservableValue<? extends String> observableValue, String oldValue, final String newValue)
                    {
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                Browser.this.setTitle("Browser - " + newValue);
                            }
                        });
                    }
                });
                engine.locationProperty().addListener(new ChangeListener<String>()
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
                engine.getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>()
                {
                    public void changed(ObservableValue<? extends Throwable> observableValue, Throwable old, final Throwable value)
                    {
                        if(engine.getLoadWorker().getState() == FAILED)
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
                jfxPanel.setScene(new Scene(view));
            }
        });
    }
    
    public static void loadURL(final String url)
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
                engine.load(temp);
            }
        });
    }
    
    private static String toURL(String temp)
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
    
    public static class GoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            loadURL(urlField.getText());
        }
    }
    
    public static class AboutBrowserListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutBrowser();
        }
    }
}