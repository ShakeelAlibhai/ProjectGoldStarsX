package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcTriangles
{
    public static ProgramWindow frame;
    public static JTextField baseField, heightField;
    
    public CalcTriangles()
    {
        calcRectangleInformation();
    }
    
    private void calcRectangleInformation()
    {
        frame = new ProgramWindow("Triangles");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(Components.standardLabel("Base:"));
        setupBaseField();
        frame.add(baseField);
        frame.add(Components.standardLabel("Height:"));
        setupHeightField();
        frame.add(heightField);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private void setupBaseField()
    {
        baseField = new JTextField("0");
        baseField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupHeightField()
    {
        heightField = new JTextField("0");
        heightField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String baseStr = baseField.getText();
            String heightStr = heightField.getText();
            double baseD, heightD;
            try
            {
                baseD = Double.parseDouble(baseStr);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                heightD = Double.parseDouble(heightStr);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(baseD <= 0)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator\n"
                        + "Error Description: The input for the base of a triangle was less than or equal to 0.");
                output = "ERROR:\n"
                        + "The base of the triangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(heightD <= 0)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator\n"
                        + "Error Description: The input for the height of a triangle was less than or equal to 0.");
                output = "ERROR:\n"
                        + "The height of the triangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = 0.5 * baseD * heightD;
            //Display the area.
            output = "Area of the Triangle: " + area;
            JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}