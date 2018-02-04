package projectgoldstarsx;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
public class Calculator
{
    public Calculator()
    {
        calculator();
    }
    
    public static ProgramWindow calculatorFrame;
    
    private void calculator()
    {
        calculatorFrame = new ProgramWindow("Calculator");
        calculatorFrame.setSize(1150 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        calculatorFrame.setLayout(new GridLayout(4, 5));
        calculatorFrame.setJMenuBar(menuBar());
        calculatorFrame.add(Components.headerLabel("Basic Calculations:"));
        calculatorFrame.add(Components.actionLabel("Add", new ListenersCalculatorMouse.AddListener()));
        calculatorFrame.add(Components.actionLabel("Subtract", new ListenersCalculatorMouse.SubtractListener()));
        calculatorFrame.add(Components.actionLabel("Multiply", new ListenersCalculatorMouse.MultiplyListener()));
        calculatorFrame.add(Components.actionLabel("Divide", new ListenersCalculatorMouse.DivideListener()));
        calculatorFrame.add(Components.headerLabel("Complex Calculations:"));
        calculatorFrame.add(Components.actionLabel("Square & Cube Roots", new ListenersCalculatorMouse.SquareAndCubeRootsListener()));
        calculatorFrame.add(Components.actionLabel("Exponents", new ListenersCalculatorMouse.ExponentsListener()));
        calculatorFrame.add(Components.actionLabel("Logarithms", new ListenersCalculatorMouse.LogarithmsListener()));
        calculatorFrame.add(Components.actionLabel("Quadratic Equation Solver", new ListenersCalculatorMouse.QuadraticEquationListener()));
        calculatorFrame.add(Components.headerLabel("Geometry:"));
        calculatorFrame.add(Components.actionLabel("Circles", new ListenersCalculatorMouse.CirclesListener()));
        calculatorFrame.add(Components.actionLabel("Rectangles", new ListenersCalculatorMouse.RectanglesListener()));
        calculatorFrame.add(Components.actionLabel("Triangles", new ListenersCalculatorMouse.TrianglesListener()));
        calculatorFrame.add(new JLabel());
        calculatorFrame.add(Components.headerLabel("Trigonometry:"));
        calculatorFrame.add(Components.actionLabel("Sine", new ListenersCalculatorMouse.SineListener()));
        calculatorFrame.add(Components.actionLabel("Cosine", new ListenersCalculatorMouse.CosineListener()));
        calculatorFrame.add(Components.actionLabel("Tangent", new ListenersCalculatorMouse.TangentListener()));
        calculatorFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(calculatorFrame.getCloseButton());
        menuBar.add(calculatorFrame.getMaximizeButton());
        menuBar.add(calculatorFrame.getWindowMenu());
        menuBar.add(conversionsMenu());
        menuBar.add(otherCalculatorsMenu());
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu conversionsMenu()
    {
        StandardMenu conversionsMenu = new StandardMenu("Conversions");
        conversionsMenu.add(angleConversionsMenu());
        conversionsMenu.add(distanceConversionsMenu());
        conversionsMenu.add(temperatureConversionsMenu());
        return conversionsMenu.getMenu();
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
    
    private JMenu otherCalculatorsMenu()
    {
        StandardMenu otherCalculatorsMenu = new StandardMenu("Other Calculators");
        otherCalculatorsMenu.add(Components.standardMenuItem("Average Calculator", new ListenersCalculatorAction.AverageCalculatorListener()));
        otherCalculatorsMenu.add(Components.standardMenuItem("Miles Per Gallon Calculator", new ListenersCalculatorAction.MilesPerGallonCalculatorListener()));
        otherCalculatorsMenu.add(Components.standardMenuItem("Pythagorean Triple Finder", new ListenersCalculatorAction.PythagoreanTripleFinderListener()));
        return otherCalculatorsMenu.getMenu();
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Calculator", new ListenersCalculatorAction.AboutCalculatorListener()));
        return menu.getMenu();
    }
}