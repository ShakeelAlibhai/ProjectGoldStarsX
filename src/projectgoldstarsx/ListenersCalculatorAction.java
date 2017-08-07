package projectgoldstarsx;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenersCalculatorAction
{
    public static class AddListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcAdd();
        }
    }
    
    public static class SubtractListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcSubtract();
        }
    }
    
    public static class MultiplyListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMultiply();
        }
    }
    
    public static class DivideListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcDivide();
        }
    }
    
    public static class SquareRootListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcSquareRoot csr = new CalcSquareRoot();
        }
    }
    
    public static class CubeRootListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcCubeRoot ccr = new CalcCubeRoot();
        }
    }
    
    public static class ExponentsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcExponents ce = new CalcExponents();
        }
    }
    
    public static class QuadraticEquationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcQuadraticEquation cqe = new CalcQuadraticEquation();
        }
    }
    
    public static class LogBase10Listener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcLogBase10 clb10 = new CalcLogBase10();
        }
    }
    
    public static class NaturalLogListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcNaturalLog cnl = new CalcNaturalLog();
        }
    }
    
    public static class CirclesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCircles();
        }
    }
    
    public static class RectanglesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcRectangles();
        }
    }
    
    public static class SineListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcSine cs = new CalcSine();
        }
    }
    
    public static class CosineListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcCosine cc = new CalcCosine();
        }
    }
    
    public static class TangentListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            CalcTangent ct = new CalcTangent();
        }
    }
    
    public static class DegreesToRadiansListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcDegreesToRadians();
        }
    }
    
    public static class RadiansToDegreesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcRadiansToDegrees();
        }
    }
    
    public static class CentimetersToFeetListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToFeet();
        }
    }
    
    public static class CentimetersToInchesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToInches();
        }
    }
    
    public static class CentimetersToKilometersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToKilometers();
        }
    }
    
    public static class CentimetersToMetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToMeters();
        }
    }
    
    public static class CentimetersToMilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToMiles();
        }
    }
    
    public static class CentimetersToMillimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToMillimeters();
        }
    }
    
    public static class CentimetersToYardsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCentimetersToYards();
        }
    }
    
    public static class FeetToCentimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToCentimeters();
        }
    }
    
    public static class FeetToInchesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToInches();
        }
    }
    
    public static class FeetToKilometersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToKilometers();
        }
    }
    
    public static class FeetToMetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToMeters();
        }
    }
    
    public static class FeetToMilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToMiles();
        }
    }
    
    public static class FeetToMillimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToMillimeters();
        }
    }
    
    public static class FeetToYardsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFeetToYards();
        }
    }
    
    public static class InchesToCentimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToCentimeters();
        }
    }
    
    public static class InchesToFeetListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToFeet();
        }
    }
    
    public static class InchesToKilometersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToKilometers();
        }
    }
    
    public static class InchesToMetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToMeters();
        }
    }
    
    public static class InchesToMilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToMiles();
        }
    }
    
    public static class InchesToMillimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToMillimeters();
        }
    }
    
    public static class InchesToYardsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcInchesToYards();
        }
    }
    
    public static class MetersToCentimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToCentimeters();
        }
    }
    
    public static class MetersToFeetListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToFeet();
        }
    }
    
    public static class MetersToInchesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToInches();
        }
    }
    
    public static class MetersToKilometersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToKilometers();
        }
    }
    
    public static class MetersToMilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToMiles();
        }
    }
    
    public static class MetersToMillimetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToMillimeters();
        }
    }
    
    public static class MetersToYardsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMetersToYards();
        }
    }
    
    public static class CelsiusToFahrenheitListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcCelsiusToFahrenheit();
        }
    }
    
    public static class FahrenheitToCelsiusListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcFahrenheitToCelsius();
        }
    }
    
    public static class AverageCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcAverage();
        }
    }
    
    public static class MilesPerGallonCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMilesPerGallon();
        }
    }
    
    public static class PythagoreanTripleFinderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcPythagoreanTripleFinder();
        }
    }
    
    public static class AboutCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutCalculator();
        }
    }
}