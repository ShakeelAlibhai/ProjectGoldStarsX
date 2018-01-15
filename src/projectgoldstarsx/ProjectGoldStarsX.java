package projectgoldstarsx;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
public class ProjectGoldStarsX
{
    public static final String name = "Project GoldStars X 2.2 Update 2";
    public static final String version = "Version 2.2.2";
    public static final File projectGoldStarsXFolder = new File(System.getProperty("user.home"), "Project GoldStars X");
    public static Color color1;
    public static Color color2;
    public static boolean standardColors;
    public static boolean settingsButtonMainMenuBar;
    public static Date startDate;
    public static int height;
    public static int width;
    public static int menuBarHeight;
    public static int multiplier;
    public static JDesktopPane desktop;
    public static String color;
    public static String language;
    public static String oldVersion;
    public static String theme;
    public static String username;
    
    //Folders
    public static final File systemFolder = new File(projectGoldStarsXFolder, "System");
    public static final File menuBarFolder = new File(systemFolder, "Menu Bar");
    public static final File calendarFolder = new File(projectGoldStarsXFolder, "Calendar");
    public static final File notesFolder = new File(projectGoldStarsXFolder, "Notes");
    public static final File photosFolder = new File(projectGoldStarsXFolder, "Photos");
    public static final File searchFolder = new File(projectGoldStarsXFolder, "Search");
    public static final File errorLogFolder = new File(projectGoldStarsXFolder, "Error Log");
    
    //Fonts
    public static Font largeHeader;
    public static Font mediumHeader;
    public static Font mediumText1;
    public static Font mediumText2;
    public static Font mediumText3;
    public static Font bodyText1;
    public static Font bodyText2;

    //Font Sizes
    public static final int largeHeaderSize = 22;
    public static final int mediumHeaderSize = 20;
    public static final int mediumText1Size = 16;
    public static final int mediumText2Size = 16;
    public static final int mediumText3Size = 12;
    public static final int bodyText1Size = 14;
    public static final int bodyText2Size = 14;
        
    //Calendar Variables
    public static String calendarFormat;
    public static ArrayList<String> calendarEvents = new ArrayList<String>();
    
    //Notes Variables
    public static ArrayList<String> notes = new ArrayList<String>();
    public static ArrayList<String> noteNames = new ArrayList<String>();
    public static boolean notesSearchCaseSensitive;
    public static int notesTemp;
    
    //Photos Variables
    public static boolean photosSearchCaseSensitive;
    public static ArrayList<String> photoNames = new ArrayList<String>();
    
    //Education Variables
    public static int additionMax = 10;
    public static int subtractionMax = 10;
    public static int multiplicationMax = 10;
    public static int divisionMax = 10;
    
    //Talk Variables
    public static boolean homework = false;
    public static boolean homework2 = false;
    public static boolean howAreYouDisplayed = false;
    public static boolean howAreYouTyped = false;
    public static boolean likeIceCream = false;
    public static boolean iceCreamFlavor = false;
    public static boolean likeCookies = false;
    public static boolean typeOfCookies = false;
    public static String nickname;
    public static String occupation;
    public static String location;
    
    //Error Log Variables
    public static ArrayList<String> errors = new ArrayList<String>();
    public static boolean errorLogSearchCaseSensitive;
    
    //Search Variables
    public static boolean searchCaseSensitive;
    public static JTextField searchTextField = new JTextField(20);
    
    public static void main(String[] args)
    {
        new Start();
    }
}