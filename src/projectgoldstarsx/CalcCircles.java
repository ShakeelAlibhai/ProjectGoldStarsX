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
    public static JTextField radius;
    
    public CalcCircles()
    {
        calcCircles();
    }
    
    private void calcCircles()
    {
        frame = new ProgramWindow("Circles");
        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(aLabel());
        setupMPG1();
        frame.add(radius);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Radius:");
        aLabel.setForeground(ProjectGoldStarsX.color2);
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        radius = new JTextField("0");
        radius.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String radiusStr = radius.getText();
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
            output = "Area of the Circle: " + area + "\n"
                    + "Circumference of the Circle: " + circumference;
            JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}