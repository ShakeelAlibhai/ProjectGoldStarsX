package projectgoldstarsx;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Start
{
    public static JTextField usernameTextField;
    
    public Start()
    {
        start();
    }
    
    private void start()
    {
        ProjectGoldStarsX.startDate = new Date();
        createFolders();
        widthAndHeight();
        setFonts();
        new StartSystem();
        new StartBrowser();
        new StartAgenda();
        new StartNotes();
        new StartPhotos();
        new StartSearch();
        new StartErrorLog();
        /*
         * Attempt to import the "oldVersion.txt" file from the Project GoldStars X folder.
         * If this file is found, check to see whether the version from that file is equal to the current version.
         * If they are equal to each other, this is likely not the user's first time running this version of Project GoldStars X.
         * If the version from the file is not equal to the current version, update the "oldVersion.txt" file.
         * If the "oldVersion.txt" file is not found, this is likely the user's first time running Project GoldStars X.
         * If this is the user's first time running Project GoldStars X, display a welcome message, then ask the user to enter a username and a password.
         */
        File oldVersionTemp = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "oldVersion.txt");
        try
        {
            Scanner s11 = new Scanner(oldVersionTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.oldVersion = s11.next();
            s11.close();
            if(!ProjectGoldStarsX.oldVersion.equals(ProjectGoldStarsX.VERSION))
            {
                updateOldVersionFile();
            }
            applyTheme();
            new Window();
        }
        catch(FileNotFoundException e)
        {
            applyTheme();
            JFrame frame = new JFrame("Project GoldStars X");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(frame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);
            frame.setSize(750 * ProjectGoldStarsX.multiplier, 425 * ProjectGoldStarsX.multiplier);
            frame.getContentPane().setBackground(ProjectGoldStarsX.secondaryColor);
            frame.setLayout(new GridLayout(5, 1));
            JLabel welcomeLabel = new JLabel("Welcome to Project GoldStars X!", SwingConstants.CENTER);
            welcomeLabel.setForeground(ProjectGoldStarsX.mainColor);
            welcomeLabel.setFont(ProjectGoldStarsX.largeHeader);
            frame.add(welcomeLabel);
            JLabel descriptionLabel = new JLabel("Project GoldStars X includes many exciting features. Let's get you set up!", SwingConstants.CENTER);
            descriptionLabel.setForeground(ProjectGoldStarsX.mainColor);
            descriptionLabel.setFont(ProjectGoldStarsX.mediumHeader);
            frame.add(descriptionLabel);
            JLabel instructionsLabel = new JLabel("To get started, please enter your username, and then click Continue.");
            instructionsLabel.setForeground(ProjectGoldStarsX.mainColor);
            instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
            frame.add(instructionsLabel);
            JPanel usernamePanel = new JPanel();
            usernamePanel.setBackground(ProjectGoldStarsX.secondaryColor);
            usernamePanel.setLayout(new GridLayout(1, 2));
            JLabel usernameLabel = new JLabel("Username:");
            usernameLabel.setForeground(ProjectGoldStarsX.mainColor);
            usernameLabel.setFont(ProjectGoldStarsX.bodyText1);
            usernamePanel.add(usernameLabel);
            usernameTextField = new JTextField("");
            usernameTextField.setFont(ProjectGoldStarsX.bodyText1);
            usernameTextField.addActionListener(new SubmitUsernameListener());
            usernamePanel.add(usernameTextField);
            frame.add(usernamePanel);
            frame.add(Components.inverseStandardButton("Continue", new SubmitUsernameListener()));
            frame.setVisible(true);
            //Update the "oldVersion.txt" file so that it has the current version.
            PrintWriter out2;
            try
            {
                File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "oldVersion.txt");
                out2 = new PrintWriter(file);
                out2.println(ProjectGoldStarsX.VERSION);
                out2.close();
            }
            catch(FileNotFoundException e2)
            {

            }
        }
    }
    
    private static void updateOldVersionFile()
    {
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "oldVersion.txt");
            out = new PrintWriter(file);
            out.println(ProjectGoldStarsX.VERSION);
            out.close();
        }
        catch(FileNotFoundException e2)
        {

        }
    }
    
    /*
     * Check to see if the folders in the Project GoldStars X file system exist.
     * If a folder does not exist, create it.
     */
    private static void createFolders()
    {
        //Make a Project GoldStars X folder if it does not exist yet.
        if(!ProjectGoldStarsX.FOLDER.exists())
        {
            ProjectGoldStarsX.FOLDER.mkdir();
        }
        //Make a System folder if it does not exist yet.
        if(!ProjectGoldStarsX.SYSTEM_FOLDER.exists())
        {
            ProjectGoldStarsX.SYSTEM_FOLDER.mkdir();
        }
        //Make a Menu Bar folder if it does not exist yet.
        if(!ProjectGoldStarsX.MENU_BAR_FOLDER.exists())
        {
            ProjectGoldStarsX.MENU_BAR_FOLDER.mkdir();
        }
        //Make a Browser folder if it does not exist yet.
        if(!ProjectGoldStarsX.BROWSER_FOLDER.exists())
        {
            ProjectGoldStarsX.BROWSER_FOLDER.mkdir();
        }
        //Make a Calendar folder if it does not exist yet.
        if(!ProjectGoldStarsX.AGENDA_FOLDER.exists())
        {
            ProjectGoldStarsX.AGENDA_FOLDER.mkdir();
        }
        //Make a Notes folder if it does not exist yet.
        if(!ProjectGoldStarsX.NOTES_FOLDER.exists())
        {
            ProjectGoldStarsX.NOTES_FOLDER.mkdir();
        }
        //Make a Photos folder if it does not exist yet.
        if(!ProjectGoldStarsX.PHOTOS_FOLDER.exists())
        {
            ProjectGoldStarsX.PHOTOS_FOLDER.mkdir();
        }
        //Make a Search folder if it does not exist yet.
        if(!ProjectGoldStarsX.SEARCH_FOLDER.exists())
        {
            ProjectGoldStarsX.SEARCH_FOLDER.mkdir();
        }
        //Make an Error Log folder if it does not exist yet.
        if(!ProjectGoldStarsX.ERROR_LOG_FOLDER.exists())
        {
            ProjectGoldStarsX.ERROR_LOG_FOLDER.mkdir();
        }
    }
    
    private void widthAndHeight()
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenResolution = t.getScreenSize();
        ProjectGoldStarsX.width = screenResolution.width;
        ProjectGoldStarsX.height = screenResolution.height;
        if(ProjectGoldStarsX.width >= 3840 && ProjectGoldStarsX.height >= 2160)
        {
            ProjectGoldStarsX.multiplier = 3;
        }
        else if(ProjectGoldStarsX.width > 1920 && ProjectGoldStarsX.height > 1080)
        {
            ProjectGoldStarsX.multiplier = 2;
        }
        else
        {
            ProjectGoldStarsX.multiplier = 1;
        }
    }

    private void setFonts()
    {
        ProjectGoldStarsX.largeHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsX.LARGE_HEADER_SIZE * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsX.MEDIUM_HEADER_SIZE * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText1 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsX.MEDIUM_TEXT_SIZE1 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText2 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsX.MEDIUM_TEXT_SIZE2 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText3 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsX.MEDIUM_TEXT_SIZE3 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.bodyText1 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsX.BODY_TEXT_SIZE1 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.bodyText2 = new java.awt.Font("Open Sans", Font.PLAIN, ProjectGoldStarsX.BODY_TEXT_SIZE2 * ProjectGoldStarsX.multiplier);
    }
    
    public static void applyTheme()
    {
        ProjectGoldStarsX.textBackgroundColor = Color.white;
        if("Dark".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.black;
            ProjectGoldStarsX.secondaryColor = Color.lightGray;
            ProjectGoldStarsX.textBackgroundColor = new Color(224, 224, 224);
            ProjectGoldStarsX.standardColors = false;
        }
        if("Desert".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = new Color(255, 228, 181);
            ProjectGoldStarsX.secondaryColor = new Color(255, 69, 0);
            ProjectGoldStarsX.standardColors = true;
        }
        if("Fire".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.red;
            ProjectGoldStarsX.secondaryColor = Color.yellow;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Forest".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.secondaryColor = new Color(222, 184, 135);
            ProjectGoldStarsX.standardColors = false;
        }
        if("Grass".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.green;
            ProjectGoldStarsX.secondaryColor = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.standardColors = true;
        }
        if("Mountain".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.darkGray;
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Night".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.black;
            ProjectGoldStarsX.secondaryColor = Color.lightGray;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Silver".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.lightGray;
            ProjectGoldStarsX.secondaryColor = Color.darkGray;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Sky".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.white;
            ProjectGoldStarsX.secondaryColor = Color.blue;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Snow".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.white;
            ProjectGoldStarsX.secondaryColor = Color.gray;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Water".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = new Color(64, 224, 208);
            ProjectGoldStarsX.secondaryColor = Color.blue;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Project GoldStars X".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.mainColor = Color.cyan;
            ProjectGoldStarsX.secondaryColor = Color.blue;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Solid Color".equals(ProjectGoldStarsX.theme))
        {
            applyColor();
        }
    }
    
    private static void applyColor()
    {
        ProjectGoldStarsX.secondaryColor = Color.black;
        ProjectGoldStarsX.standardColors = true;
        if("Black".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.black;
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.blue;
        }
        if("Cyan".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.cyan;
        }
        if("Dark Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(0x00, 0x00, 0xC0);
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Dark Gray".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.darkGray;
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Dark Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(0x00, 0xC0, 0x00);
        }
        if("Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.green;
        }
        if("Light Red".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(0xFF, 0x40, 0x40);
        }
        if("Magenta".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.magenta;
        }
        if("Orange".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.orange;
        }
        if("Pink".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.pink;
        }
        if("Red".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.red;
        }
        if("Turquoise".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(64, 224, 208);
        }
        if("Very Dark Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Very Dark Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = new Color(0x00, 0x00, 0x80);
            ProjectGoldStarsX.secondaryColor = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("White".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.white;
        }
        if("Yellow".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.mainColor = Color.yellow;
        }
    }
    
    public class SubmitUsernameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.username = usernameTextField.getText();
            ProjectGoldStarsX.nickname = ProjectGoldStarsX.username;
            if("".equals(ProjectGoldStarsX.username))
            {
                JOptionPane.showMessageDialog(null, "No Username Entered", "Setup", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                PrintWriter out;
                try
                {
                    File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "username.txt");
                    out = new PrintWriter(file);
                    out.println(ProjectGoldStarsX.username);
                    out.close();
                }
                catch(FileNotFoundException e2)
                {

                }
                new Window();
            }
        }
    }
}