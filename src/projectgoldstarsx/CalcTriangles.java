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
    public static JTextField base, height;
    
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
        frame.add(aLabel());
        setupMPG1();
        frame.add(base);
        frame.add(bLabel());
        setupMPG2();
        frame.add(height);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Base:");
        aLabel.setForeground(ProjectGoldStarsX.color2);
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        base = new JTextField("0");
        base.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel bLabel()
    {
        JLabel bLabel = new JLabel("Height:");
        bLabel.setForeground(ProjectGoldStarsX.color2);
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        height = new JTextField("0");
        height.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String baseStr = base.getText();
            String heightStr = height.getText();
            double baseD, heightD;
            try
            {
                baseD = Double.parseDouble(baseStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                heightD = Double.parseDouble(heightStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(baseD <= 0)
            {
                output = "ERROR:\n"
                        + "The base of the triangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(heightD <= 0)
            {
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