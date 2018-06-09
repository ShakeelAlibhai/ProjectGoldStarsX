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
    public static final String NAME = "Project GoldStars X 2.5 Update 1";
    public static final String VERSION = "Version 2.5.1";
    public static final File FOLDER = new File(System.getProperty("user.home"), "Project GoldStars X");
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
    public static final File SYSTEM_FOLDER = new File(FOLDER, "System");
    public static final File MENU_BAR_FOLDER = new File(SYSTEM_FOLDER, "Menu Bar");
    public static final File AGENDA_FOLDER = new File(FOLDER, "Agenda");
    public static final File BROWSER_FOLDER = new File(FOLDER, "Browser");
    public static final File NOTES_FOLDER = new File(FOLDER, "Notes");
    public static final File PHOTOS_FOLDER = new File(FOLDER, "Photos");
    public static final File SEARCH_FOLDER = new File(FOLDER, "Search");
    public static final File ERROR_LOG_FOLDER = new File(FOLDER, "Error Log");
    
    //Fonts
    public static Font largeHeader;
    public static Font mediumHeader;
    public static Font mediumText1;
    public static Font mediumText2;
    public static Font mediumText3;
    public static Font bodyText1;
    public static Font bodyText2;

    //Font Sizes
    public static final int LARGE_HEADER_SIZE = 22;
    public static final int MEDIUM_HEADER_SIZE = 20;
    public static final int MEDIUM_TEXT_SIZE1 = 16;
    public static final int MEDIUM_TEXT_SIZE2 = 16;
    public static final int MEDIUM_TEXT_SIZE3 = 12;
    public static final int BODY_TEXT_SIZE1 = 14;
    public static final int BODY_TEXT_SIZE2 = 14;
    
    //Agenda Variables
    public static String dateFormat;
    public static ArrayList<String> events = new ArrayList<String>();
    
    //Browser Variable
    public static String homepage;
    
    //Notes Variables
    public static ArrayList<String> notes = new ArrayList<String>();
    public static ArrayList<String> noteNames = new ArrayList<String>();
    public static boolean notesSearchCaseSensitive;
    
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