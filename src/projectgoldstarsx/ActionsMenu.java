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
        quickAccessActions.add(new StandardMenuItem("Create an Agenda Event", new ListenersAgenda.CreateEventListener()));
        quickAccessActions.add(new StandardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        if("Dark".equals(ProjectGoldStarsX.theme))
        {
            quickAccessActions.add(new StandardMenuItem("Switch to Project GoldStars X Theme", new ListenersThemes.ProjectGoldStarsXThemeListener()));
        }
        else
        {
            quickAccessActions.add(new StandardMenuItem("Switch to Dark Theme", new ListenersThemes.DarkThemeListener()));
        }
        quickAccessActions.add(new StandardMenuItem("View Current Settings", new ListenersSettings.CurrentSettingsListener()));
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
        calculatorActions.add(new StandardMenuItem("Open Calculator", new ListenersProgramsAction.CalculatorListener()));
        return calculatorActions;
    }
    
    private JMenu calculatorActionsBasicCalculations()
    {
        JMenu calculatorActionsBasicCalculations = new JMenu("Basic Calculations");
        calculatorActionsBasicCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsBasicCalculations.add(new StandardMenuItem("Add", new ListenersCalculatorAction.AddListener()));
        calculatorActionsBasicCalculations.add(new StandardMenuItem("Subtract", new ListenersCalculatorAction.SubtractListener()));
        calculatorActionsBasicCalculations.add(new StandardMenuItem("Multiply", new ListenersCalculatorAction.MultiplyListener()));
        calculatorActionsBasicCalculations.add(new StandardMenuItem("Divide", new ListenersCalculatorAction.DivideListener()));
        return calculatorActionsBasicCalculations;
    }
    
    private JMenu calculatorActionsComplexCalculations()
    {
        JMenu calculatorActionsComplexCalculations = new JMenu("Complex Calculations");
        calculatorActionsComplexCalculations.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsComplexCalculations.add(new StandardMenuItem("Square & Cube Roots", new ListenersCalculatorAction.SquareAndCubeRootsListener()));
        calculatorActionsComplexCalculations.add(new StandardMenuItem("Exponents", new ListenersCalculatorAction.ExponentsListener()));
        calculatorActionsComplexCalculations.add(new StandardMenuItem("Logarithms", new ListenersCalculatorAction.LogarithmsListener()));
        calculatorActionsComplexCalculations.add(new StandardMenuItem("Quadratic Equation Solver", new ListenersCalculatorAction.QuadraticEquationListener()));
        return calculatorActionsComplexCalculations;
    }
    
    private JMenu calculatorActionsGeometry()
    {
        JMenu calculatorActionsGeometry = new JMenu("Geometry");
        calculatorActionsGeometry.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsGeometry.add(new StandardMenuItem("Circles", new ListenersCalculatorAction.CirclesListener()));
        calculatorActionsGeometry.add(new StandardMenuItem("Rectangles", new ListenersCalculatorAction.RectanglesListener()));
        calculatorActionsGeometry.add(new StandardMenuItem("Triangles", new ListenersCalculatorAction.TrianglesListener()));
        return calculatorActionsGeometry;
    }
    
    private JMenu calculatorActionsTrigonometry()
    {
        JMenu calculatorActionsTrigonometry = new JMenu("Trigonometry");
        calculatorActionsTrigonometry.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsTrigonometry.add(new StandardMenuItem("Sine", new ListenersCalculatorAction.SineListener()));
        calculatorActionsTrigonometry.add(new StandardMenuItem("Cosine", new ListenersCalculatorAction.CosineListener()));
        calculatorActionsTrigonometry.add(new StandardMenuItem("Tangent", new ListenersCalculatorAction.TangentListener()));
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
        angleConversionsMenu.add(new StandardMenuItem("Degrees to Radians", new ListenersCalculatorAction.DegreesToRadiansListener()));
        angleConversionsMenu.add(new StandardMenuItem("Radians to Degrees", new ListenersCalculatorAction.RadiansToDegreesListener()));
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
        fromCentimetersMenu.add(new StandardMenuItem("To Feet", new ListenersCalculatorAction.CentimetersToFeetListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Inches", new ListenersCalculatorAction.CentimetersToInchesListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Kilometers", new ListenersCalculatorAction.CentimetersToKilometersListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Meters", new ListenersCalculatorAction.CentimetersToMetersListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Miles", new ListenersCalculatorAction.CentimetersToMilesListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Millimeters", new ListenersCalculatorAction.CentimetersToMillimetersListener()));
        fromCentimetersMenu.add(new StandardMenuItem("To Yards", new ListenersCalculatorAction.CentimetersToYardsListener()));
        return fromCentimetersMenu;
    }
    
    private JMenu fromFeetMenu()
    {
        JMenu fromFeetMenu = new JMenu("From Feet");
        fromFeetMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromFeetMenu.add(new StandardMenuItem("To Centimeters", new ListenersCalculatorAction.FeetToCentimetersListener()));
        fromFeetMenu.add(new StandardMenuItem("To Inches", new ListenersCalculatorAction.FeetToInchesListener()));
        fromFeetMenu.add(new StandardMenuItem("To Kilometers", new ListenersCalculatorAction.FeetToKilometersListener()));
        fromFeetMenu.add(new StandardMenuItem("To Meters", new ListenersCalculatorAction.FeetToMetersListener()));
        fromFeetMenu.add(new StandardMenuItem("To Miles", new ListenersCalculatorAction.FeetToMilesListener()));
        fromFeetMenu.add(new StandardMenuItem("To Millimeters", new ListenersCalculatorAction.FeetToMillimetersListener()));
        fromFeetMenu.add(new StandardMenuItem("To Yards", new ListenersCalculatorAction.FeetToYardsListener()));
        return fromFeetMenu;
    }
    
    private JMenu fromInchesMenu()
    {
        JMenu fromInchesMenu = new JMenu("From Inches");
        fromInchesMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromInchesMenu.add(new StandardMenuItem("To Centimeters", new ListenersCalculatorAction.InchesToCentimetersListener()));
        fromInchesMenu.add(new StandardMenuItem("To Feet", new ListenersCalculatorAction.InchesToFeetListener()));
        fromInchesMenu.add(new StandardMenuItem("To Kilometers", new ListenersCalculatorAction.InchesToKilometersListener()));
        fromInchesMenu.add(new StandardMenuItem("To Meters", new ListenersCalculatorAction.InchesToMetersListener()));
        fromInchesMenu.add(new StandardMenuItem("To Miles", new ListenersCalculatorAction.InchesToMilesListener()));
        fromInchesMenu.add(new StandardMenuItem("To Millimeters", new ListenersCalculatorAction.InchesToMillimetersListener()));
        fromInchesMenu.add(new StandardMenuItem("To Yards", new ListenersCalculatorAction.InchesToYardsListener()));
        return fromInchesMenu;
    }
    
    private JMenu fromMetersMenu()
    {
        JMenu fromMetersMenu = new JMenu("From Meters");
        fromMetersMenu.setFont(ProjectGoldStarsX.mediumText3);
        fromMetersMenu.add(new StandardMenuItem("To Centimeters", new ListenersCalculatorAction.MetersToCentimetersListener()));
        fromMetersMenu.add(new StandardMenuItem("To Feet", new ListenersCalculatorAction.MetersToFeetListener()));
        fromMetersMenu.add(new StandardMenuItem("To Inches", new ListenersCalculatorAction.MetersToInchesListener()));
        fromMetersMenu.add(new StandardMenuItem("To Kilometers", new ListenersCalculatorAction.MetersToKilometersListener()));
        fromMetersMenu.add(new StandardMenuItem("To Miles", new ListenersCalculatorAction.MetersToMilesListener()));
        fromMetersMenu.add(new StandardMenuItem("To Millimeters", new ListenersCalculatorAction.MetersToMillimetersListener()));
        fromMetersMenu.add(new StandardMenuItem("To Yards", new ListenersCalculatorAction.MetersToYardsListener()));
        return fromMetersMenu;
    }
    
    private JMenu temperatureConversionsMenu()
    {
        JMenu temperatureConversionsMenu = new JMenu("Temperature Conversions");
        temperatureConversionsMenu.setFont(ProjectGoldStarsX.mediumText3);
        temperatureConversionsMenu.add(new StandardMenuItem("Celsius to Fahrenheit", new ListenersCalculatorAction.CelsiusToFahrenheitListener()));
        temperatureConversionsMenu.add(new StandardMenuItem("Fahrenheit to Celsius", new ListenersCalculatorAction.FahrenheitToCelsiusListener()));
        return temperatureConversionsMenu;
    }
    
    private JMenu calculatorActionsOtherCalculators()
    {
        JMenu calculatorActionsOtherCalculators = new JMenu("Other Calculators");
        calculatorActionsOtherCalculators.setFont(ProjectGoldStarsX.mediumText3);
        calculatorActionsOtherCalculators.add(new StandardMenuItem("Average Calculator", new ListenersCalculatorAction.AverageCalculatorListener()));
        calculatorActionsOtherCalculators.add(new StandardMenuItem("Miles Per Gallon Calculator", new ListenersCalculatorAction.MilesPerGallonCalculatorListener()));
        calculatorActionsOtherCalculators.add(new StandardMenuItem("Pythagorean Triple Finder", new ListenersCalculatorAction.PythagoreanTripleFinderListener()));
        return calculatorActionsOtherCalculators;
    }
    
    private JMenu agendaActions()
    {
        JMenu agendaActions = new JMenu("Agenda Actions");
        agendaActions.setFont(ProjectGoldStarsX.mediumText3);
        agendaActions.add(new StandardMenuItem("Create an Event", new ListenersAgenda.CreateEventListener()));
        agendaActions.add(new StandardMenuItem("View Events Today", new ListenersAgenda.ViewEventsTodayListener()));
        agendaActions.add(new StandardMenuItem("View Events Tomorrow", new ListenersAgenda.ViewEventsTomorrowListener()));
        agendaActions.add(new JSeparator());
        agendaActions.add(new StandardMenuItem("Open Agenda", new ListenersProgramsAction.AgendaListener()));
        return agendaActions;
    }
    
    private JMenu notesActions()
    {
        JMenu notesActions = new JMenu("Notes Actions");
        notesActions.setFont(ProjectGoldStarsX.mediumText3);
        notesActions.add(new StandardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        notesActions.add(new StandardMenuItem("Edit Notes", new ListenersNotes.EditNotesListener()));
        notesActions.add(new StandardMenuItem("Import Notes", new ListenersNotes.ImportNotesListener()));
        notesActions.add(new StandardMenuItem("Rename Notes", new ListenersNotes.RenameNotesListener()));
        notesActions.add(new JSeparator());
        notesActions.add(new StandardMenuItem("Open Notes", new ListenersProgramsAction.NotesListener()));
        return notesActions;
    }
    
    private JMenu photosActions()
    {
        JMenu notesActions = new JMenu("Photos Actions");
        notesActions.setFont(ProjectGoldStarsX.mediumText3);
        notesActions.add(new StandardMenuItem("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        notesActions.add(new JSeparator());
        notesActions.add(new StandardMenuItem("Open Photos", new ListenersProgramsAction.PhotosListener()));
        return notesActions;
    }
    
    private JMenu filesActions()
    {
        JMenu filesActions = new JMenu("Files Actions");
        filesActions.setFont(ProjectGoldStarsX.mediumText3);
        filesActions.add(new StandardMenuItem("Create a Note", new ListenersNotes.CreateNoteListener()));
        filesActions.add(new StandardMenuItem("Import Notes", new ListenersNotes.ImportNotesListener()));
        filesActions.add(new StandardMenuItem("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        filesActions.add(new JSeparator());
        filesActions.add(new StandardMenuItem("Open Files", new ListenersProgramsAction.FilesListener()));
        return filesActions;
    }
    
    private JMenu educationActions()
    {
        JMenu educationActions = new JMenu("Education Actions");
        educationActions.setFont(ProjectGoldStarsX.mediumText3);
        educationActions.add(educationActionsMath());
        educationActions.add(educationActionsReading());
        educationActions.add(new JSeparator());
        educationActions.add(new StandardMenuItem("Open Education", new ListenersProgramsAction.EducationListener()));
        return educationActions;
    }
    
    private JMenu educationActionsMath()
    {
        JMenu educationActionsMath = new JMenu("Math");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(new StandardMenuItem("Practice Addition", new ListenersEducationAction.PracticeAdditionListener()));
        educationActionsMath.add(new StandardMenuItem("Practice Subtraction", new ListenersEducationAction.PracticeSubtractionListener()));
        educationActionsMath.add(new StandardMenuItem("Practice Multiplication", new ListenersEducationAction.PracticeMultiplicationListener()));
        educationActionsMath.add(new StandardMenuItem("Practice Division", new ListenersEducationAction.PracticeDivisionListener()));
        educationActionsMath.add(new StandardMenuItem("Practice Square Roots", new ListenersEducationAction.PracticeSquareRootsListener()));
        return educationActionsMath;
    }
    
    private JMenu educationActionsReading()
    {
        JMenu educationActionsMath = new JMenu("Reading");
        educationActionsMath.setFont(ProjectGoldStarsX.mediumText3);
        educationActionsMath.add(new StandardMenuItem("3-Sentence Story", new ListenersEducationAction.Reading3SentencesListener()));
        educationActionsMath.add(new StandardMenuItem("4-Sentence Story", new ListenersEducationAction.Reading4SentencesListener()));
        return educationActionsMath;
    }
}