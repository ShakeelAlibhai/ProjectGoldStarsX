package projectgoldstarsx;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Commands
{
    public static ArrayList<String> messages = new ArrayList<String>();
    public static boolean maximized = false;    //Tracks whether the Commands window is set to maximized or not
    public static JInternalFrame commandsFrame;
    public static JTextField commandsField;
    public static String temp;
    
    public Commands()
    {
        commandsField = new JTextField("");
        commandsField.setFont(ProjectGoldStarsX.bodyText2);
        commandsField.setBackground(Color.lightGray);
        commandsField.setForeground(Color.black);
        setupFrame();
        if(messages.isEmpty())
        {
            for(int i = 0; i < 10; i++)
            {
                messages.add("");
            }
        }
        if(messages.size() > 10)
        {
            int temp = messages.size() - 10;
            for(int i = 0; i < temp; i++)
            {
                messages.remove(i);
            }
        }
        commandsFrame.setLayout(new GridLayout(13, 1));
        commandsFrame.setResizable(true);
        JLabel[] messagesLabels = new JLabel[messages.size()];
        for(int i = 0; i < messages.size(); i++)
        {
            messagesLabels[i] = new JLabel(messages.get(i));
            messagesLabels[i].setFont(ProjectGoldStarsX.bodyText2);
            messagesLabels[i].setOpaque(true);
            messagesLabels[i].setBackground(Color.black);
            messagesLabels[i].setForeground(Color.white);
        }
        JLabel historyHeaderLabel = new JLabel("Recent Commands:");
        historyHeaderLabel.setFont(ProjectGoldStarsX.mediumHeader);
        historyHeaderLabel.setOpaque(true);
        historyHeaderLabel.setBackground(Color.black);
        historyHeaderLabel.setForeground(Color.white);
        commandsFrame.add(historyHeaderLabel);
        //Add the messages from the array list to the commands frame
        for(int i = 0; i < messages.size(); i++)
        {
            commandsFrame.add(messagesLabels[i]);
        }
        JLabel inputHeaderLabel = new JLabel("Your Input:");
        inputHeaderLabel.setFont(ProjectGoldStarsX.mediumText2);
        inputHeaderLabel.setOpaque(true);
        inputHeaderLabel.setBackground(Color.black);
        inputHeaderLabel.setForeground(Color.white);
        commandsFrame.add(inputHeaderLabel);
        commandsFrame.add(commandsField);
        commandsField.setText("");
        commandsField.addActionListener(new CommandsInputListener());
        commandsFrame.setVisible(true);
    }
    
    private void setupFrame()
    {
        commandsFrame = new JInternalFrame("Commands");
        ProjectGoldStarsX.desktop.add(commandsFrame);
        commandsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        commandsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 425 * ProjectGoldStarsX.multiplier);
        if(maximized)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(commandsFrame);
        }
        commandsFrame.setJMenuBar(menuBar());
    }
    
    //Returns the JMenuBar that will be added to the ProgramWindow
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Clear Command History", new ClearCommandHistoryListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Commands", new AboutCommandsListener()));
        return menu.getMenu();
    }
    
    private void processInput(String input)
    {
        input = input.toLowerCase();
        if(input.indexOf("close") >= 0)
        {

        }
        else if(input.indexOf("browser") >= 0 ||
                input.indexOf("internet") >= 0)
        {
            new Browser();
        }
        else if(input.indexOf("add") >= 0 ||
                input.indexOf("+") >= 0)
        {
            new CalcAdd();
        }
        else if(input.indexOf("subtract") >= 0)
        {
            new CalcSubtract();
        }
        else if(input.indexOf("multiply") >= 0 ||
                input.indexOf("multiplication") >= 0 ||
                input.indexOf("*") >= 0)
        {
            new CalcMultiply();
        }
        else if(input.indexOf("divide") >= 0 ||
                input.indexOf("division") >= 0)
        {
            new CalcDivide();
        }
        else if(input.indexOf("square root") >= 0 ||
                input.indexOf("cube root") >= 0)
        {
            new CalcSquareAndCubeRoots();
        }
        else if(input.indexOf("raise a number to a power") >= 0 ||
                input.indexOf("exponent") >= 0)
        {
            new CalcExponents();
        }
        else if(input.indexOf("quadratic equation") >= 0)
        {
            new CalcQuadraticEquation();
        }
        else if(input.indexOf("logarithms") >= 0 ||
                input.indexOf("log base 10") >= 0 ||
                input.indexOf("log base ten") >= 0 ||
                input.indexOf("natural log") >= 0 ||
                input.indexOf("log base e") >= 0)
        {
            new CalcLogarithms();
        }
        else if(input.indexOf("cosine") >= 0)
        {
            new CalcCosine();
        }
        else if(input.indexOf("sine") >= 0)
        {
            new CalcSine();
        }
        else if(input.indexOf("tangent") >= 0)
        {
            new CalcTangent();
        }
        else if(input.indexOf("degrees to radians") >= 0)
        {
            new CalcDegreesToRadians();
        }
        else if(input.indexOf("radians to degrees") >= 0)
        {
            new CalcRadiansToDegrees();
        }
        else if(input.indexOf("average calculator") >= 0)
        {
            new CalcAverage();
        }
        else if(input.indexOf("miles per gallon") >= 0 ||
                input.indexOf("mpg calculator") >= 0)
        {
            new CalcMilesPerGallon();
        }
        else if(input.indexOf("pythagorean triple") >= 0)
        {
            new CalcPythagoreanTripleFinder();
        }
        else if(input.indexOf("rectangle") >= 0)
        {
            new CalcRectangles();
        }
        else if(input.indexOf("circle") >= 0)
        {
            new CalcCircles();
        }
        else if(input.indexOf("triangle") >= 0)
        {
            new CalcTriangles();
        }
        else if(input.indexOf("calculator") >= 0)
        {
            new Calculator();
        }
        else if(input.indexOf("events today") >= 0)
        {
            new AgendaViewEventsToday();
        }
        else if(input.indexOf("create event") >= 0 ||
                input.indexOf("create a event") >= 0 ||
                input.indexOf("create an event") >= 0)
        {
            new AgendaCreateEvent();
        }
        else if(input.indexOf("calendar") >= 0)
        {
            new Agenda();
        }
        else if(input.indexOf("create a note") >= 0 ||
                input.indexOf("create note") >= 0 ||
                input.indexOf("new note") >= 0)
        {
            new NotesCreate();
        }
        else if(input.indexOf("edit a note") >= 0 ||
                input.indexOf("edit note") >= 0 ||
                input.indexOf("modify a note") >= 0 ||
                input.indexOf("modify note") >= 0)
        {
            new NotesEdit();
        }
        else if(input.indexOf("import note") >= 0 ||
                input.indexOf("import a note") >= 0)
        {
            new NotesImport();
        }
        else if(input.indexOf("rename note") >= 0 ||
                input.indexOf("rename a note") >= 0)
        {
            new NotesRename();
        }
        else if(input.indexOf("notes") >= 0)
        {
            new Notes();
        }
        else if(input.indexOf("import photo") >= 0 ||
                input.indexOf("import a photo") >= 0)
        {
            new PhotosImport();
        }
        else if(input.indexOf("photos") >= 0)
        {
            new Photos();
        }
        else if(input.indexOf("talk") >= 0)
        {
            double r = Math.random();
            int randomResponse = (int)(r * 2);
            if(randomResponse == 0)
            {
                new Talk("Hello, how are you?");
                ProjectGoldStarsX.howAreYouDisplayed = true;
            }
            else
            {
                new Talk("Hi, " + ProjectGoldStarsX.nickname + "!");
                ProjectGoldStarsX.howAreYouDisplayed = false;
            }
        }
        else if(input.indexOf("stories") >= 0 ||
                input.indexOf("story") >= 0)
        {
            new StoryWindow("Stories", "Stories", 0);
        }
        else if(input.indexOf("files") >= 0)
        {
            new Files();
        }
        else if(input.indexOf("education") >= 0)
        {
            new Education();
        }
        else if(input.indexOf("light") >= 0)
        {
            new Light();
        }
        else if(input.indexOf("current settings") >= 0)
        {
            new CurrentSettings();
        }
        else if(input.indexOf("change language") >= 0)
        {
            new ChangeLanguage();
        }
        else if(input.indexOf("change theme") >= 0)
        {
            new ChangeTheme();
        }
        else if(input.indexOf("change username") >= 0)
        {
            new ChangeUsername();
        }
        else if(input.indexOf("set location") >= 0)
        {
            new SetLocation();
        }
        else if(input.indexOf("menu bar settings") >= 0)
        {
            new MenuBarSettings();
        }
        else if(input.indexOf("calendar settings") >= 0)
        {
            new AgendaSettings();
        }
        else if(input.indexOf("notes settings") >= 0)
        {
            new NotesSettings();
        }
        else if(input.indexOf("photos settings") >= 0)
        {
            new PhotosSettings();
        }
        else if(input.indexOf("talk settings") >= 0)
        {
            new TalkSettings();
        }
        else if(input.indexOf("error log search case sensitive") >= 0 ||
                input.indexOf("error log settings") >= 0)
        {
            new ErrorLogSettings();
        }
        else if(input.indexOf("search case sensitive") >= 0 ||
                input.indexOf("search settings") >= 0)
        {
            new SearchSettings();
        }
        else if(input.indexOf("settings") >= 0)
        {
            new Settings();
        }
        else if(input.indexOf("notifications") >= 0)
        {
            new Notifications();
        }
        else if(input.indexOf("search error") >= 0 ||
                input.indexOf("search the error log") >= 0)
        {
            new ErrorLogSearch();
        }
        else if(input.indexOf("error") >= 0)
        {
            new ErrorLog();
        }
        else if(input.indexOf("help") >= 0)
        {
            new Help();
        }
        else if(input.indexOf("troubleshoot problems") >= 0)
        {
            new TroubleshootProblems();
        }
        else if(input.indexOf("about programs") >= 0)
        {
            new AboutPrograms();
        }
        else if(input.indexOf("about") >= 0)
        {
            new About();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Command Not Recognized", "Commands", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static class AboutCommandsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutCommands();
        }
    }
    
    public class CommandsInputListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            messages.add(commandsField.getText());
            commandsFrame.dispose();
            processInput(messages.get(messages.size() - 1));
        }
    }
    
    public static class ClearCommandHistoryListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            messages = new ArrayList<String>();
            commandsFrame.dispose();
            new Commands();
        }
    }
    
    public class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            maximized = false;
            commandsFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            maximized = true;
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(commandsFrame);
        }
    }
}