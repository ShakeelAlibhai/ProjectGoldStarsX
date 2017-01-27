package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JSeparator;
public class Menu
{
    public static JMenu menu()
    {
        JMenu menu = new JMenu("Menu");
        menu.setBackground(ProjectGoldStarsX.color1);
        menu.setForeground(ProjectGoldStarsX.color2);
        menu.setFont(ProjectGoldStarsX.mediumText1);
        menu.add(menuWelcome());
        menu.add(new JSeparator());
        menu.add(actionsMenu());
        menu.add(allProgramsMenu());
        menu.add(Components.standardMenuItem("Files", new ListenersProgramsAction.FilesListener()));
        menu.add(Components.standardMenuItem("Notifications", new ListenersProgramsAction.NotificationsListener()));
        menu.add(Components.standardMenuItem("Settings", new ListenersProgramsAction.SettingsListener()));
        menu.add(new JSeparator());
        menu.add(Components.standardMenuItem("About", new ListenersProgramsAction.AboutListener()));
        menu.add(Components.standardMenuItem("Exit Project GoldStars X", new ExitListener()));
        return menu;
    }
    
    private static JLabel menuWelcome()
    {
        JLabel welcomeLabel = new JLabel("Welcome, " + ProjectGoldStarsX.username + "!");
        welcomeLabel.setFont(ProjectGoldStarsX.mediumText3);
        return welcomeLabel;
    }
    
    private static JMenu actionsMenu()
    {
        JMenu actionsMenu = new JMenu("Actions");
        actionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        actionsMenu.add(quickAccessActions());
        actionsMenu.add(new JSeparator());
        actionsMenu.add(calendarActions());
        actionsMenu.add(calculatorActions());
        actionsMenu.add(notesActions());
        actionsMenu.add(photosActions());
        actionsMenu.add(filesActions());
        actionsMenu.add(educationActions());
        return actionsMenu;
    }
    
    private static JMenu quickAccessActions()
    {
        JMenu quickAccessActions = new JMenu("Quick Access Actions");
        quickAccessActions.setFont(ProjectGoldStarsX.mediumText3);
        quickAccessActions.add(Components.standardMenuItem("Create a Calendar Event", new ListenersCalendar.CreateCalendarEventListener()));
        quickAccessActions.add(Components.standardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        if("Dark".equals(ProjectGoldStarsX.theme))
        {
            quickAccessActions.add(Components.standardMenuItem("Switch to Project GoldStars X Theme", new ListenersThemes.ProjectGoldStarsXThemeListener()));
        }
        else
        {
            quickAccessActions.add(Components.standardMenuItem("Switch to Dark Theme", new ListenersThemes.DarkThemeListener()));
        }
        return quickAccessActions;
    }
    
    private static JMenu calendarActions()
    {
        JMenu calendarActions = new JMenu("Calendar Actions");
        calendarActions.setFont(ProjectGoldStarsX.mediumText3);
        calendarActions.add(Components.standardMenuItem("Create a Calendar Event", new ListenersCalendar.CreateCalendarEventListener()));
        calendarActions.add(Components.standardMenuItem("View Calendar Events Today", new ListenersCalendar.ViewCalendarEventsTodayListener()));
        calendarActions.add(new JSeparator());
        calendarActions.add(Components.standardMenuItem("Open Calendar", new ListenersProgramsAction.CalendarListener()));
        return calendarActions;
    }
    
    private static JMenu calculatorActions()
    {
        JMenu calculatorActions = new JMenu("Calculator Actions");
        calculatorActions.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActions.add(calculatorActionsBasicCalculations());
        calculatorActions.add(calculatorActionsComplexCalculations());
        calculatorActions.add(calculatorActionsTrigonometry());
        calculatorActions.add(calculatorActionsConversions());
        calculatorActions.add(calculatorActionsOtherCalculators());
        calculatorActions.add(new JSeparator());
        calculatorActions.add(Components.standardMenuItem("Open Calculator", new ListenersProgramsAction.CalculatorListener()));
        return calculatorActions;
    }
    
    private static JMenu calculatorActionsBasicCalculations()
    {
        JMenu calculatorActionsBasicCalculations = new JMenu("Basic Calculations");
        calculatorActionsBasicCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Add", new ListenersCalculatorAction.AddListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Subtract", new ListenersCalculatorAction.SubtractListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Multiply", new ListenersCalculatorAction.MultiplyListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Divide", new ListenersCalculatorAction.DivideListener()));
        return calculatorActionsBasicCalculations;
    }
    
    private static JMenu calculatorActionsComplexCalculations()
    {
        JMenu calculatorActionsComplexCalculations = new JMenu("Complex Calculations");
        calculatorActionsComplexCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Square Root", new ListenersCalculatorAction.SquareRootListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Cube Root", new ListenersCalculatorAction.CubeRootListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Exponents", new ListenersCalculatorAction.ExponentsListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Quadratic Equation Solver", new ListenersCalculatorAction.QuadraticEquationListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Log Base 10", new ListenersCalculatorAction.LogBase10Listener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Natural Log", new ListenersCalculatorAction.NaturalLogListener()));
        return calculatorActionsComplexCalculations;
    }
    
    private static JMenu calculatorActionsTrigonometry()
    {
        JMenu calculatorActionsTrigonometry = new JMenu("Trigonometry");
        calculatorActionsTrigonometry.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Sine", new ListenersCalculatorAction.SineListener()));
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Cosine", new ListenersCalculatorAction.CosineListener()));
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Tangent", new ListenersCalculatorAction.TangentListener()));
        return calculatorActionsTrigonometry;
    }
    
    private static JMenu calculatorActionsConversions()
    {
        JMenu calculatorActionsConversions = new JMenu("Conversions");
        calculatorActionsConversions.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsConversions.add(angleConversionsMenu());
        calculatorActionsConversions.add(distanceConversionsMenu());
        calculatorActionsConversions.add(temperatureConversionsMenu());
        return calculatorActionsConversions;
    }
    
    private static JMenu angleConversionsMenu()
    {
        JMenu angleConversionsMenu = new JMenu("Angle Conversions");
        angleConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        angleConversionsMenu.add(Components.standardMenuItem("Degrees to Radians", new ListenersCalculatorAction.DegreesToRadiansListener()));
        angleConversionsMenu.add(Components.standardMenuItem("Radians to Degrees", new ListenersCalculatorAction.RadiansToDegreesListener()));
        return angleConversionsMenu;
    }
    
    private static JMenu distanceConversionsMenu()
    {
        JMenu distanceConversionsMenu = new JMenu("Distance Conversions");
        distanceConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        distanceConversionsMenu.add(fromCentimetersMenu());
        distanceConversionsMenu.add(fromFeetMenu());
        distanceConversionsMenu.add(fromInchesMenu());
        distanceConversionsMenu.add(fromMetersMenu());
        return distanceConversionsMenu;
    }
    
    private static JMenu fromCentimetersMenu()
    {
        JMenu fromCentimetersMenu = new JMenu("From Centimeters");
        fromCentimetersMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromCentimetersMenu.add(Components.standardMenuItem("To Feet", new ListenersCalculatorAction.CentimetersToFeetListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Inches", new ListenersCalculatorAction.CentimetersToInchesListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Kilometers", new ListenersCalculatorAction.CentimetersToKilometersListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Meters", new ListenersCalculatorAction.CentimetersToMetersListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Miles", new ListenersCalculatorAction.CentimetersToMilesListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Millimeters", new ListenersCalculatorAction.CentimetersToMillimetersListener()));
        fromCentimetersMenu.add(Components.standardMenuItem("To Yards", new ListenersCalculatorAction.CentimetersToYardsListener()));
        return fromCentimetersMenu;
    }
    
    private static JMenu fromFeetMenu()
    {
        JMenu fromFeetMenu = new JMenu("From Feet");
        fromFeetMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromFeetMenu.add(Components.standardMenuItem("To Centimeters", new ListenersCalculatorAction.FeetToCentimetersListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Inches", new ListenersCalculatorAction.FeetToInchesListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Kilometers", new ListenersCalculatorAction.FeetToKilometersListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Meters", new ListenersCalculatorAction.FeetToMetersListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Miles", new ListenersCalculatorAction.FeetToMilesListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Millimeters", new ListenersCalculatorAction.FeetToMillimetersListener()));
        fromFeetMenu.add(Components.standardMenuItem("To Yards", new ListenersCalculatorAction.FeetToYardsListener()));
        return fromFeetMenu;
    }
    
    private static JMenu fromInchesMenu()
    {
        JMenu fromInchesMenu = new JMenu("From Inches");
        fromInchesMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromInchesMenu.add(Components.standardMenuItem("To Centimeters", new ListenersCalculatorAction.InchesToCentimetersListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Feet", new ListenersCalculatorAction.InchesToFeetListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Kilometers", new ListenersCalculatorAction.InchesToKilometersListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Meters", new ListenersCalculatorAction.InchesToMetersListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Miles", new ListenersCalculatorAction.InchesToMilesListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Millimeters", new ListenersCalculatorAction.InchesToMillimetersListener()));
        fromInchesMenu.add(Components.standardMenuItem("To Yards", new ListenersCalculatorAction.InchesToYardsListener()));
        return fromInchesMenu;
    }
    
    private static JMenu fromMetersMenu()
    {
        JMenu fromMetersMenu = new JMenu("From Meters");
        fromMetersMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromMetersMenu.add(Components.standardMenuItem("To Centimeters", new ListenersCalculatorAction.MetersToCentimetersListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Feet", new ListenersCalculatorAction.MetersToFeetListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Inches", new ListenersCalculatorAction.MetersToInchesListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Kilometers", new ListenersCalculatorAction.MetersToKilometersListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Miles", new ListenersCalculatorAction.MetersToMilesListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Millimeters", new ListenersCalculatorAction.MetersToMillimetersListener()));
        fromMetersMenu.add(Components.standardMenuItem("To Yards", new ListenersCalculatorAction.MetersToYardsListener()));
        return fromMetersMenu;
    }
    
    private static JMenu temperatureConversionsMenu()
    {
        JMenu temperatureConversionsMenu = new JMenu("Temperature Conversions");
        temperatureConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        temperatureConversionsMenu.add(Components.standardMenuItem("Celsius to Fahrenheit", new ListenersCalculatorAction.CelsiusToFahrenheitListener()));
        temperatureConversionsMenu.add(Components.standardMenuItem("Fahrenheit to Celsius", new ListenersCalculatorAction.FahrenheitToCelsiusListener()));
        return temperatureConversionsMenu;
    }
    
    private static JMenu calculatorActionsOtherCalculators()
    {
        JMenu calculatorActionsOtherCalculators = new JMenu("Other Calculators");
        calculatorActionsOtherCalculators.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Average Calculator", new ListenersCalculatorAction.AverageCalculatorListener()));
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Miles Per Gallon Calculator", new ListenersCalculatorAction.MilesPerGallonCalculatorListener()));
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Pythagorean Triple Finder", new ListenersCalculatorAction.PythagoreanTripleFinderListener()));
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Rectangle Information Calculator", new ListenersCalculatorAction.RectangleInformationCalculatorListener()));
        return calculatorActionsOtherCalculators;
    }
    
    private static JMenu notesActions()
    {
        JMenu notesActions = new JMenu("Notes Actions");
        notesActions.setFont(ProjectGoldStarsX.mediumText3);
        notesActions.add(Components.standardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        notesActions.add(Components.standardMenuItem("Edit Notes", new ListenersNotes.EditNotesListener()));
        notesActions.add(Components.standardMenuItem("Import Notes", new ListenersNotes.ImportNotesListener()));
        notesActions.add(Components.standardMenuItem("Rename Notes", new ListenersNotes.RenameNotesListener()));
        notesActions.add(new JSeparator());
        notesActions.add(Components.standardMenuItem("Open Notes", new ListenersProgramsAction.NotesListener()));
        return notesActions;
    }
    
    private static JMenu photosActions()
    {
        JMenu notesActions = new JMenu("Photos Actions");
        notesActions.setFont(ProjectGoldStarsX.mediumText3);
        notesActions.add(Components.standardMenuItem("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        notesActions.add(new JSeparator());
        notesActions.add(Components.standardMenuItem("Open Photos", new ListenersProgramsAction.PhotosListener()));
        return notesActions;
    }
    
    private static JMenu filesActions()
    {
        JMenu filesActions = new JMenu("Files Actions");
        filesActions.setFont(ProjectGoldStarsX.mediumText3);
        filesActions.add(Components.standardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        filesActions.add(Components.standardMenuItem("Import Notes", new ListenersNotes.ImportNotesListener()));
        filesActions.add(Components.standardMenuItem("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        filesActions.add(new JSeparator());
        filesActions.add(Components.standardMenuItem("Open Files", new ListenersProgramsAction.FilesListener()));
        return filesActions;
    }
    
    private static JMenu educationActions()
    {
        JMenu educationActions = new JMenu("Education Actions");
        educationActions.setFont(ProjectGoldStarsX.mediumText3);
        educationActions.add(educationActionsMath());
        educationActions.add(educationActionsReading());
        educationActions.add(new JSeparator());
        educationActions.add(Components.standardMenuItem("Open Education", new ListenersProgramsAction.EducationListener()));
        return educationActions;
    }
    
    private static JMenu educationActionsMath()
    {
        JMenu educationActionsMath = new JMenu("Math");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(Components.standardMenuItem("Practice Addition", new ListenersEducationAction.PracticeAdditionListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Subtraction", new ListenersEducationAction.PracticeSubtractionListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Multiplication", new ListenersEducationAction.PracticeMultiplicationListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Division", new ListenersEducationAction.PracticeDivisionListener()));
        return educationActionsMath;
    }
    
    private static JMenu educationActionsReading()
    {
        JMenu educationActionsMath = new JMenu("Reading");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(Components.standardMenuItem("3-Sentence Story", new ListenersEducationAction.Reading3SentencesListener()));
        educationActionsMath.add(Components.standardMenuItem("4-Sentence Story", new ListenersEducationAction.Reading4SentencesListener()));
        return educationActionsMath;
    }
    
    private static JMenu allProgramsMenu()
    {
        JMenu allProgramsMenu = new JMenu("All Programs");
        allProgramsMenu.setFont(ProjectGoldStarsX.mediumText3);
        allProgramsMenu.add(Components.standardMenuItem("About", new ListenersProgramsAction.AboutListener()));
        allProgramsMenu.add(Components.standardMenuItem("Browser", new ListenersProgramsAction.BrowserListener()));
        allProgramsMenu.add(Components.standardMenuItem("Calculator", new ListenersProgramsAction.CalculatorListener()));
        allProgramsMenu.add(Components.standardMenuItem("Calendar", new ListenersProgramsAction.CalendarListener()));
        allProgramsMenu.add(Components.standardMenuItem("Commands", new ListenersProgramsAction.CommandsListener()));
        allProgramsMenu.add(Components.standardMenuItem("Education", new ListenersProgramsAction.EducationListener()));
        allProgramsMenu.add(Components.standardMenuItem("Error Log", new ListenersProgramsAction.ErrorLogListener()));
        allProgramsMenu.add(Components.standardMenuItem("Error Log Search", new ListenersProgramsAction.ErrorLogSearchListener()));
        allProgramsMenu.add(Components.standardMenuItem("Files", new ListenersProgramsAction.FilesListener()));
        allProgramsMenu.add(Components.standardMenuItem("Help", new ListenersProgramsAction.HelpListener()));
        allProgramsMenu.add(Components.standardMenuItem("Light", new ListenersProgramsAction.LightListener()));
        allProgramsMenu.add(Components.standardMenuItem("Notes", new ListenersProgramsAction.NotesListener()));
        allProgramsMenu.add(Components.standardMenuItem("Photos", new ListenersProgramsAction.PhotosListener()));
        allProgramsMenu.add(Components.standardMenuItem("Settings", new ListenersProgramsAction.SettingsListener()));
        allProgramsMenu.add(Components.standardMenuItem("Stories", new ListenersProgramsAction.StoriesListener()));
        allProgramsMenu.add(Components.standardMenuItem("System Information", new ListenersProgramsAction.SystemInformationListener()));
        allProgramsMenu.add(Components.standardMenuItem("Talk", new ListenersProgramsAction.TalkListener()));
        return allProgramsMenu;
    }
    
    public static class ExitListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}