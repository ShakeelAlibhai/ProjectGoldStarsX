package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcCircles
{
    public static ProgramWindow frame;
    public static JTextField radiusField, areaField, circumferenceField;
    
    public CalcCircles()
    {
        calcCircles();
    }
    
    private void calcCircles()
    {
        frame = new ProgramWindow("Circles");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(990 * ProjectGoldStarsX.multiplier, 525 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the radius of the circle, and then press Calculate to find its area and circumference:");
        frame.add(Components.standardLabel("Radius:"));
        setupRadiusField();
        frame.add(radiusField);
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.add(Components.standardLabel("Area:"));
        setupAreaField();
        frame.add(areaField);
        frame.add(new JLabel());
        frame.add(Components.standardLabel("Circumference:"));
        setupCircumferenceField();
        frame.add(circumferenceField);
        frame.add(Components.disclaimerLabel("Note: Values may not be exact."));
        frame.makeVisible();
    }
    
    private void setupRadiusField()
    {
        radiusField = new JTextField("0");
        radiusField.setFont(ProjectGoldStarsX.bodyText2);
        radiusField.addActionListener(new CalculateListener());
    }
    
    private void setupAreaField()
    {
        areaField = new JTextField("0");
        areaField.setEditable(false);
        areaField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupCircumferenceField()
    {
        circumferenceField = new JTextField("0");
        circumferenceField.setEditable(false);
        circumferenceField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String radiusStr = radiusField.getText();
            double radiusD;
            try
            {
                radiusD = Double.parseDouble(radiusStr);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(radiusD <= 0)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator\n"
                        + "Error Description: The input for the radius of a circle was less than or equal to 0.");
                output = "ERROR:\n"
                        + "The radius of the circle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = Math.PI * radiusD * radiusD;
            //Calculate the circumference.
            double circumference = 2 * Math.PI * radiusD;
            //Display the area and circumference.
            areaField.setText("" + area);
            circumferenceField.setText("" + circumference);
        }
    }
}