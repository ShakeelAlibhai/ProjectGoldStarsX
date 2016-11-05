package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
public class Calculator
{
    public Calculator()
    {
        calculator();
    }
    
    public static JInternalFrame calculatorFrame;
    
    private void calculator()
    {
        calculatorFrame = new JInternalFrame("Calculator");
        ProjectGoldStarsX.desktop.add(calculatorFrame);
        calculatorFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        calculatorFrame.setSize(1150 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        calculatorFrame.setLayout(new GridLayout(4, 5));
        calculatorFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        calculatorFrame.setJMenuBar(menuBar());
        calculatorFrame.add(Components.headerLabel("Basic Calculations:"));
        calculatorFrame.add(action("Add", new ListenersCalculatorMouse.AddListener()));
        calculatorFrame.add(action("Subtract", new ListenersCalculatorMouse.SubtractListener()));
        calculatorFrame.add(action("Multiply", new ListenersCalculatorMouse.MultiplyListener()));
        calculatorFrame.add(action("Divide", new ListenersCalculatorMouse.DivideListener()));
        calculatorFrame.add(Components.headerLabel("Complex Calculations:"));
        calculatorFrame.add(action("Square Root", new ListenersCalculatorMouse.SquareRootListener()));
        calculatorFrame.add(action("Cube Root", new ListenersCalculatorMouse.CubeRootListener()));
        calculatorFrame.add(action("Exponents", new ListenersCalculatorMouse.ExponentsListener()));
        calculatorFrame.add(action("Quadratic Equation Solver", new ListenersCalculatorMouse.QuadraticEquationListener()));
        calculatorFrame.add(new JLabel());
        calculatorFrame.add(action("Log Base 10", new ListenersCalculatorMouse.LogBase10Listener()));
        calculatorFrame.add(action("Natural Log", new ListenersCalculatorMouse.NaturalLogListener()));
        calculatorFrame.add(new JLabel());
        calculatorFrame.add(new JLabel());
        calculatorFrame.add(Components.headerLabel("Trigonometry:"));
        calculatorFrame.add(action("Sine", new ListenersCalculatorMouse.SineListener()));
        calculatorFrame.add(action("Cosine", new ListenersCalculatorMouse.CosineListener()));
        calculatorFrame.add(action("Tangent", new ListenersCalculatorMouse.TangentListener()));
        calculatorFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(conversionsMenu());
        menuBar.add(otherCalculatorsMenu());
        return menuBar;
    }
    
    private JMenu conversionsMenu()
    {
        JMenu conversionsMenu = new JMenu("Conversions");
        conversionsMenu.setBackground(ProjectGoldStarsX.color1);
        conversionsMenu.setForeground(ProjectGoldStarsX.color2);
        conversionsMenu.setFont(ProjectGoldStarsX.mediumText1);
        conversionsMenu.add(angleConversionsMenu());
        conversionsMenu.add(distanceConversionsMenu());
        conversionsMenu.add(temperatureConversionsMenu());
        return conversionsMenu;
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
        JMenu otherCalculatorsMenu = new JMenu("Other Calculators");
        otherCalculatorsMenu.setBackground(ProjectGoldStarsX.color1);
        otherCalculatorsMenu.setForeground(ProjectGoldStarsX.color2);
        otherCalculatorsMenu.setFont(ProjectGoldStarsX.mediumText1);
        otherCalculatorsMenu.add(Components.standardMenuItem("Average Calculator", new ListenersCalculatorAction.AverageCalculatorListener()));
        otherCalculatorsMenu.add(Components.standardMenuItem("Miles Per Gallon Calculator", new ListenersCalculatorAction.MilesPerGallonCalculatorListener()));
        otherCalculatorsMenu.add(Components.standardMenuItem("Pythagorean Triple Finder", new ListenersCalculatorAction.PythagoreanTripleFinderListener()));
        otherCalculatorsMenu.add(Components.standardMenuItem("Rectangle Information Calculator", new ListenersCalculatorAction.RectangleInformationCalculatorListener()));
        return otherCalculatorsMenu;
    }
    
    private JLabel action(String actionName, MouseListener mouseListener)
    {
        JLabel action = new JLabel(actionName, SwingConstants.CENTER);
        action.setForeground(ProjectGoldStarsX.color2);
        action.setFont(ProjectGoldStarsX.mediumText2);
        action.addMouseListener(mouseListener);
        return action;
    }
    
    public static class CloseListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            calculatorFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(calculatorFrame);
        }
    }
}