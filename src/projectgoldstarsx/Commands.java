package projectgoldstarsx;
import javax.swing.JOptionPane;
public class Commands
{
    public Commands()
    {
        commands();
    }
    
    private void commands()
    {
        boolean continueCommands = true;
        String input = new String();
        try
        {
            while(continueCommands)
            {
                input = JOptionPane.showInputDialog(null, "Please enter your command: ", "Commands", JOptionPane.QUESTION_MESSAGE);
                if(input == null)
                {
                    break;
                }
                input = input.toLowerCase();
                if(input.indexOf("close") >= 0)
                {
                    continueCommands = false;
                }
                else if(input.indexOf("browser") >= 0 ||
                        input.indexOf("internet") >= 0)
                {
                    Browser b = new Browser();
                }
                else if(input.indexOf("calendar") >= 0)
                {
                    new CalendarHome();
                }
                else if(input.indexOf("add") >= 0 ||
                        input.indexOf("+") >= 0)
                {
                    CalcAdd ca = new CalcAdd();
                }
                else if(input.indexOf("subtract") >= 0)
                {
                    CalcSubtract cs = new CalcSubtract();
                }
                else if(input.indexOf("multiply") >= 0 ||
                        input.indexOf("multiplication") >= 0 ||
                        input.indexOf("*") >= 0)
                {
                    CalcMultiply cm = new CalcMultiply();
                }
                else if(input.indexOf("divide") >= 0 ||
                        input.indexOf("division") >= 0)
                {
                    CalcDivide cd = new CalcDivide();
                }
                else if(input.indexOf("square root") >= 0)
                {
                    CalcSquareRoot csr = new CalcSquareRoot();
                }
                else if(input.indexOf("cube root") >= 0)
                {
                    CalcCubeRoot ccr = new CalcCubeRoot();
                }
                else if(input.indexOf("raise a number to a power") >= 0 ||
                        input.indexOf("exponent") >= 0)
                {
                    CalcExponents ce = new CalcExponents();
                }
                else if(input.indexOf("quadratic equation") >= 0)
                {
                    CalcQuadraticEquation cqe = new CalcQuadraticEquation();
                }
                else if(input.indexOf("log base 10") >= 0 ||
                        input.indexOf("log base ten") >= 0)
                {
                    CalcLogBase10 clb10 = new CalcLogBase10();
                }
                else if(input.indexOf("natural log") >= 0 ||
                        input.indexOf("log base e") >= 0)
                {
                    CalcNaturalLog cnl = new CalcNaturalLog();
                }
                else if(input.indexOf("cosine") >= 0)
                {
                    CalcCosine cc = new CalcCosine();
                }
                else if(input.indexOf("sine") >= 0)
                {
                    CalcSine cs = new CalcSine();
                }
                else if(input.indexOf("tangent") >= 0)
                {
                    CalcTangent ct = new CalcTangent();
                }
                else if(input.indexOf("degrees to radians") >= 0)
                {
                    CalcDegreesToRadians cdtr = new CalcDegreesToRadians();
                }
                else if(input.indexOf("radians to degrees") >= 0)
                {
                    CalcRadiansToDegrees crtd = new CalcRadiansToDegrees();
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
                else if(input.indexOf("rectangle information") >= 0)
                {
                    new CalcRectangleInformation();
                }
                else if(input.indexOf("calculator") >= 0)
                {
                    new Calculator();
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
                    }
                    else
                    {
                        new Talk("Hi, " + ProjectGoldStarsX.nickname + "!");
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
                    CalendarSettings cs = new CalendarSettings();
                }
                else if(input.indexOf("notes settings") >= 0)
                {
                    NotesSettings ns = new NotesSettings();
                }
                else if(input.indexOf("photos settings") >= 0)
                {
                    PhotosSettings ps = new PhotosSettings();
                }
                else if(input.indexOf("talk settings") >= 0)
                {
                    TalkSettings ts = new TalkSettings();
                }
                else if(input.indexOf("error log search case sensitive") >= 0 ||
                        input.indexOf("error log settings") >= 0)
                {
                    ErrorLogSettings sts = new ErrorLogSettings();
                }
                else if(input.indexOf("search case sensitive") >= 0 ||
                        input.indexOf("search settings") >= 0)
                {
                    SearchSettings ss = new SearchSettings();
                }
                else if(input.indexOf("settings") >= 0)
                {
                    new Settings();
                }
                else if(input.indexOf("notifications") >= 0)
                {
                    Notifications n = new Notifications();
                }
                else if(input.indexOf("search error") >= 0 ||
                        input.indexOf("search the error log") >= 0)
                {
                    ErrorLogSearch els = new ErrorLogSearch();
                }
                else if(input.indexOf("error") >= 0)
                {
                    ErrorLog el = new ErrorLog();
                }
                else if(input.indexOf("help") >= 0)
                {
                    Help h = new Help();
                }
                else if(input.indexOf("troubleshoot problems") >= 0)
                {
                    TroubleshootProblems tp = new TroubleshootProblems();
                }
                else if(input.indexOf("system information") >= 0)
                {
                    SystemInformation si = new SystemInformation();
                }
                else if(input.indexOf("about programs") >= 0)
                {
                    AboutPrograms ap = new AboutPrograms();
                }
                else if(input.indexOf("about") >= 0)
                {
                    About a = new About();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Command Not Recognized", "Commands", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception error)
        {
            return;
        }
    }
}