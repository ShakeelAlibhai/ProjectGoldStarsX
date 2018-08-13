package projectgoldstarsx;
import javax.swing.JMenu;
import javax.swing.JSeparator;
public class ActionsMenu extends SubMenu
{
    public ActionsMenu()
    {
        super("Actions");
        this.setFont(ProjectGoldStarsX.mediumText3);
        this.add(quickAccessActions());
        this.add(new JSeparator());
        this.add(agendaActions());
        this.add(calculatorActions());
        this.add(notesActions());
        this.add(photosActions());
        this.add(filesActions());
        this.add(educationActions());
    }
    
    private JMenu quickAccessActions()
    {
        JMenu quickAccessActions = new JMenu("Quick Access Actions");
        quickAccessActions.setFont(ProjectGoldStarsX.mediumText3);
        quickAccessActions.add(Components.standardMenuItem("Create a Agenda Event", new ListenersAgenda.CreateEventListener()));
        quickAccessActions.add(Components.standardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        if("Dark".equals(ProjectGoldStarsX.theme))
        {
            quickAccessActions.add(Components.standardMenuItem("Switch to Project GoldStars X Theme", new ListenersThemes.ProjectGoldStarsXThemeListener()));
        }
        else
        {
            quickAccessActions.add(Components.standardMenuItem("Switch to Dark Theme", new ListenersThemes.DarkThemeListener()));
        }
        quickAccessActions.add(Components.standardMenuItem("View Current Settings", new ListenersSettings.CurrentSettingsListener()));
        return quickAccessActions;
    }
    
    private JMenu calculatorActions()
    {
        JMenu calculatorActions = new JMenu("Calculator Actions");
        calculatorActions.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActions.add(calculatorActionsBasicCalculations());
        calculatorActions.add(calculatorActionsComplexCalculations());
        calculatorActions.add(calculatorActionsGeometry());
        calculatorActions.add(calculatorActionsTrigonometry());
        calculatorActions.add(calculatorActionsConversions());
        calculatorActions.add(calculatorActionsOtherCalculators());
        calculatorActions.add(new JSeparator());
        calculatorActions.add(Components.standardMenuItem("Open Calculator", new ListenersProgramsAction.CalculatorListener()));
        return calculatorActions;
    }
    
    private JMenu calculatorActionsBasicCalculations()
    {
        JMenu calculatorActionsBasicCalculations = new JMenu("Basic Calculations");
        calculatorActionsBasicCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Add", new ListenersCalculatorAction.AddListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Subtract", new ListenersCalculatorAction.SubtractListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Multiply", new ListenersCalculatorAction.MultiplyListener()));
        calculatorActionsBasicCalculations.add(Components.standardMenuItem("Divide", new ListenersCalculatorAction.DivideListener()));
        return calculatorActionsBasicCalculations;
    }
    
    private JMenu calculatorActionsComplexCalculations()
    {
        JMenu calculatorActionsComplexCalculations = new JMenu("Complex Calculations");
        calculatorActionsComplexCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Square & Cube Roots", new ListenersCalculatorAction.SquareAndCubeRootsListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Exponents", new ListenersCalculatorAction.ExponentsListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Logarithms", new ListenersCalculatorAction.LogarithmsListener()));
        calculatorActionsComplexCalculations.add(Components.standardMenuItem("Quadratic Equation Solver", new ListenersCalculatorAction.QuadraticEquationListener()));
        return calculatorActionsComplexCalculations;
    }
    
    private JMenu calculatorActionsGeometry()
    {
        JMenu calculatorActionsGeometry = new JMenu("Geometry");
        calculatorActionsGeometry.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsGeometry.add(Components.standardMenuItem("Circles", new ListenersCalculatorAction.CirclesListener()));
        calculatorActionsGeometry.add(Components.standardMenuItem("Rectangles", new ListenersCalculatorAction.RectanglesListener()));
        calculatorActionsGeometry.add(Components.standardMenuItem("Triangles", new ListenersCalculatorAction.TrianglesListener()));
        return calculatorActionsGeometry;
    }
    
    private JMenu calculatorActionsTrigonometry()
    {
        JMenu calculatorActionsTrigonometry = new JMenu("Trigonometry");
        calculatorActionsTrigonometry.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Sine", new ListenersCalculatorAction.SineListener()));
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Cosine", new ListenersCalculatorAction.CosineListener()));
        calculatorActionsTrigonometry.add(Components.standardMenuItem("Tangent", new ListenersCalculatorAction.TangentListener()));
        return calculatorActionsTrigonometry;
    }
    
    private JMenu calculatorActionsConversions()
    {
        JMenu calculatorActionsConversions = new JMenu("Conversions");
        calculatorActionsConversions.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsConversions.add(angleConversionsMenu());
        calculatorActionsConversions.add(distanceConversionsMenu());
        calculatorActionsConversions.add(temperatureConversionsMenu());
        return calculatorActionsConversions;
    }
    
    private JMenu angleConversionsMenu()
    {
        JMenu angleConversionsMenu = new JMenu("Angle Conversions");
        angleConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        angleConversionsMenu.add(Components.standardMenuItem("Degrees to Radians", new ListenersCalculatorAction.DegreesToRadiansListener()));
        angleConversionsMenu.add(Components.standardMenuItem("Radians to Degrees", new ListenersCalculatorAction.RadiansToDegreesListener()));
        return angleConversionsMenu;
    }
    
    private JMenu distanceConversionsMenu()
    {
        JMenu distanceConversionsMenu = new JMenu("Distance Conversions");
        distanceConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        distanceConversionsMenu.add(fromCentimetersMenu());
        distanceConversionsMenu.add(fromFeetMenu());
        distanceConversionsMenu.add(fromInchesMenu());
        distanceConversionsMenu.add(fromMetersMenu());
        return distanceConversionsMenu;
    }
    
    private JMenu fromCentimetersMenu()
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
    
    private JMenu fromFeetMenu()
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
    
    private JMenu fromInchesMenu()
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
    
    private JMenu fromMetersMenu()
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
    
    private JMenu temperatureConversionsMenu()
    {
        JMenu temperatureConversionsMenu = new JMenu("Temperature Conversions");
        temperatureConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        temperatureConversionsMenu.add(Components.standardMenuItem("Celsius to Fahrenheit", new ListenersCalculatorAction.CelsiusToFahrenheitListener()));
        temperatureConversionsMenu.add(Components.standardMenuItem("Fahrenheit to Celsius", new ListenersCalculatorAction.FahrenheitToCelsiusListener()));
        return temperatureConversionsMenu;
    }
    
    private JMenu calculatorActionsOtherCalculators()
    {
        JMenu calculatorActionsOtherCalculators = new JMenu("Other Calculators");
        calculatorActionsOtherCalculators.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Average Calculator", new ListenersCalculatorAction.AverageCalculatorListener()));
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Miles Per Gallon Calculator", new ListenersCalculatorAction.MilesPerGallonCalculatorListener()));
        calculatorActionsOtherCalculators.add(Components.standardMenuItem("Pythagorean Triple Finder", new ListenersCalculatorAction.PythagoreanTripleFinderListener()));
        return calculatorActionsOtherCalculators;
    }
    
    private JMenu agendaActions()
    {
        JMenu agendaActions = new JMenu("Agenda Actions");
        agendaActions.setFont(ProjectGoldStarsX.mediumText3);
        agendaActions.add(Components.standardMenuItem("Create an Event", new ListenersAgenda.CreateEventListener()));
        agendaActions.add(Components.standardMenuItem("View Events Today", new ListenersAgenda.ViewEventsTodayListener()));
        agendaActions.add(Components.standardMenuItem("View Events Tomorrow", new ListenersAgenda.ViewEventsTomorrowListener()));
        agendaActions.add(new JSeparator());
        agendaActions.add(Components.standardMenuItem("Open Agenda", new ListenersProgramsAction.AgendaListener()));
        return agendaActions;
    }
    
    private JMenu notesActions()
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
    
    private JMenu photosActions()
    {
        JMenu notesActions = new JMenu("Photos Actions");
        notesActions.setFont(ProjectGoldStarsX.mediumText3);
        notesActions.add(Components.standardMenuItem("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        notesActions.add(new JSeparator());
        notesActions.add(Components.standardMenuItem("Open Photos", new ListenersProgramsAction.PhotosListener()));
        return notesActions;
    }
    
    private JMenu filesActions()
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
    
    private JMenu educationActions()
    {
        JMenu educationActions = new JMenu("Education Actions");
        educationActions.setFont(ProjectGoldStarsX.mediumText3);
        educationActions.add(educationActionsMath());
        educationActions.add(educationActionsReading());
        educationActions.add(new JSeparator());
        educationActions.add(Components.standardMenuItem("Open Education", new ListenersProgramsAction.EducationListener()));
        return educationActions;
    }
    
    private JMenu educationActionsMath()
    {
        JMenu educationActionsMath = new JMenu("Math");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(Components.standardMenuItem("Practice Addition", new ListenersEducationAction.PracticeAdditionListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Subtraction", new ListenersEducationAction.PracticeSubtractionListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Multiplication", new ListenersEducationAction.PracticeMultiplicationListener()));
        educationActionsMath.add(Components.standardMenuItem("Practice Division", new ListenersEducationAction.PracticeDivisionListener()));
        return educationActionsMath;
    }
    
    private JMenu educationActionsReading()
    {
        JMenu educationActionsMath = new JMenu("Reading");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(Components.standardMenuItem("3-Sentence Story", new ListenersEducationAction.Reading3SentencesListener()));
        educationActionsMath.add(Components.standardMenuItem("4-Sentence Story", new ListenersEducationAction.Reading4SentencesListener()));
        return educationActionsMath;
    }
}