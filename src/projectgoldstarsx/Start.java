package projectgoldstarsx;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
public class Start
{
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
        new StartCalendar();
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
        File oldVersionTemp = new File(ProjectGoldStarsX.systemFolder, "oldVersion.txt");
        try
        {
            Scanner s11 = new Scanner(oldVersionTemp).useDelimiter("\\Z");
            ProjectGoldStarsX.oldVersion = s11.next();
            s11.close();
            if(!ProjectGoldStarsX.oldVersion.equals(ProjectGoldStarsX.version))
            {
                updateOldVersionFile();
            }
            applyTheme();
            new Window();
        }
        catch(FileNotFoundException e)
        {
            JFrame frame = new JFrame("Project GoldStars X");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 575);
            frame.setExtendedState(frame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);
            frame.getContentPane().setBackground(Color.cyan);
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBackground(Color.cyan);
            JLabel welcomeLabel = new JLabel("Setting up " + ProjectGoldStarsX.name + "...");
            welcomeLabel.setForeground(Color.blue);
            welcomeLabel.setFont(ProjectGoldStarsX.mediumText1);
            menuBar.add(welcomeLabel);
            frame.setJMenuBar(menuBar);
            frame.setVisible(true);
            String output = "Hi, and welcome to Project GoldStars X!\n"
                    + "Project GoldStars X includes many exciting and useful features.\n"
                    + "However, before you can use it for the first time, we need to collect some information.\n"
                    + "During this setup process, some files will be saved in a Project GoldStars X folder in your home folder.\n"
                    + "Click OK to continue!";
            JOptionPane.showMessageDialog(null, output, "Welcome to Project GoldStars X!", JOptionPane.INFORMATION_MESSAGE);
            ProjectGoldStarsX.username = JOptionPane.showInputDialog(null, "USERNAME\n"
                    + "Please enter your username:", "Setting up Project GoldStars X", JOptionPane.QUESTION_MESSAGE);
            while("".equals(ProjectGoldStarsX.username))
            {
                ProjectGoldStarsX.username = JOptionPane.showInputDialog(null, "ERROR:\n"
                        + "No Username Entered", "Setting up Project GoldStars X", JOptionPane.QUESTION_MESSAGE);
                ProjectGoldStarsX.errors.add("Error: No Username Entered");
            }
            if(ProjectGoldStarsX.username == null)
            {
                System.exit(0);
            }
            ProjectGoldStarsX.nickname = ProjectGoldStarsX.username;
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "username.txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsX.username);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
            //Update the "oldVersion.txt" file so that it has the current version.
            PrintWriter out2;
            try
            {
                File file = new File(ProjectGoldStarsX.systemFolder, "oldVersion.txt");
                out2 = new PrintWriter(file);
                out2.println(ProjectGoldStarsX.version);
                out2.close();
            }
            catch(FileNotFoundException e2)
            {

            }
            applyTheme();
            new Window();
        }
    }
    
    private static void updateOldVersionFile()
    {
        PrintWriter out;
        try
        {
            File file = new File(ProjectGoldStarsX.systemFolder, "oldVersion.txt");
            out = new PrintWriter(file);
            out.println(ProjectGoldStarsX.version);
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
        if(!ProjectGoldStarsX.projectGoldStarsXFolder.exists())
        {
            ProjectGoldStarsX.projectGoldStarsXFolder.mkdir();
        }
        //Make a System folder if it does not exist yet.
        if(!ProjectGoldStarsX.systemFolder.exists())
        {
            ProjectGoldStarsX.systemFolder.mkdir();
        }
        //Make a Menu Bar folder if it does not exist yet.
        if(!ProjectGoldStarsX.menuBarFolder.exists())
        {
            ProjectGoldStarsX.menuBarFolder.mkdir();
        }
        //Make a Calendar folder if it does not exist yet.
        if(!ProjectGoldStarsX.calendarFolder.exists())
        {
            ProjectGoldStarsX.calendarFolder.mkdir();
        }
        //Make a Notes folder if it does not exist yet.
        if(!ProjectGoldStarsX.notesFolder.exists())
        {
            ProjectGoldStarsX.notesFolder.mkdir();
        }
        //Make a Photos folder if it does not exist yet.
        if(!ProjectGoldStarsX.photosFolder.exists())
        {
            ProjectGoldStarsX.photosFolder.mkdir();
        }
        //Make a Search folder if it does not exist yet.
        if(!ProjectGoldStarsX.searchFolder.exists())
        {
            ProjectGoldStarsX.searchFolder.mkdir();
        }
        //Make an Error Log folder if it does not exist yet.
        if(!ProjectGoldStarsX.errorLogFolder.exists())
        {
            ProjectGoldStarsX.errorLogFolder.mkdir();
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
        ProjectGoldStarsX.largeHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsX.largeHeaderSize * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsX.mediumHeaderSize * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText1 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsX.mediumText1Size * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText2 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsX.mediumText2Size * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.mediumText3 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsX.mediumText3Size * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.bodyText1 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsX.bodyText1Size * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.bodyText2 = new java.awt.Font("Open Sans", Font.PLAIN, ProjectGoldStarsX.bodyText2Size * ProjectGoldStarsX.multiplier);
    }
    
    public static void applyTheme()
    {
        if("Dark".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.black;
            ProjectGoldStarsX.color2 = Color.lightGray;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Desert".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = new Color(255, 228, 181);
            ProjectGoldStarsX.color2 = new Color(255, 69, 0);
            ProjectGoldStarsX.standardColors = true;
        }
        if("Fire".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.red;
            ProjectGoldStarsX.color2 = Color.yellow;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Forest".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.color2 = new Color(222, 184, 135);
            ProjectGoldStarsX.standardColors = false;
        }
        if("Grass".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.green;
            ProjectGoldStarsX.color2 = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.standardColors = true;
        }
        if("Mountain".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.darkGray;
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Night".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.black;
            ProjectGoldStarsX.color2 = Color.lightGray;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Silver".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.lightGray;
            ProjectGoldStarsX.color2 = Color.darkGray;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Sky".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.white;
            ProjectGoldStarsX.color2 = Color.blue;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Snow".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.white;
            ProjectGoldStarsX.color2 = Color.gray;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Water".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = new Color(64, 224, 208);
            ProjectGoldStarsX.color2 = Color.blue;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Project GoldStars X".equals(ProjectGoldStarsX.theme))
        {
            ProjectGoldStarsX.color1 = Color.cyan;
            ProjectGoldStarsX.color2 = Color.blue;
            ProjectGoldStarsX.standardColors = true;
        }
        if("Solid Color".equals(ProjectGoldStarsX.theme))
        {
            applyColor();
        }
    }
    
    private static void applyColor()
    {
        ProjectGoldStarsX.color2 = Color.black;
        ProjectGoldStarsX.standardColors = true;
        if("Black".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.black;
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.blue;
        }
        if("Cyan".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.cyan;
        }
        if("Dark Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(0x00, 0x00, 0xC0);
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Dark Gray".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.darkGray;
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Dark Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(0x00, 0xC0, 0x00);
        }
        if("Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.green;
        }
        if("Light Red".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(0xFF, 0x40, 0x40);
        }
        if("Magenta".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.magenta;
        }
        if("Orange".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.orange;
        }
        if("Pink".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.pink;
        }
        if("Red".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.red;
        }
        if("Turquoise".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(64, 224, 208);
        }
        if("Very Dark Green".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("Very Dark Blue".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = new Color(0x00, 0x00, 0x80);
            ProjectGoldStarsX.color2 = Color.white;
            ProjectGoldStarsX.standardColors = false;
        }
        if("White".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.white;
        }
        if("Yellow".equals(ProjectGoldStarsX.color))
        {
            ProjectGoldStarsX.color1 = Color.yellow;
        }
    }
}