package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcRectangles
{
    public static ProgramWindow frame;
    public static JTextField length, width;
    
    public CalcRectangles()
    {
        calcRectangles();
    }
    
    private void calcRectangles()
    {
        frame = new ProgramWindow("Rectangles");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(aLabel());
        setupMPG1();
        frame.add(length);
        frame.add(bLabel());
        setupMPG2();
        frame.add(width);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Length:");
        aLabel.setForeground(ProjectGoldStarsX.color2);
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        length = new JTextField("0");
        length.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel bLabel()
    {
        JLabel bLabel = new JLabel("Width:");
        bLabel.setForeground(ProjectGoldStarsX.color2);
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        width = new JTextField("0");
        width.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String lengthStr = length.getText();
            String widthStr = width.getText();
            double lengthD, widthD;
            try
            {
                lengthD = Double.parseDouble(lengthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                widthD = Double.parseDouble(widthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(lengthD <= 0)
            {
                output = "ERROR:\n"
                        + "The length of the rectangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(widthD <= 0)
            {
                output = "ERROR:\n"
                        + "The width of the rectangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = lengthD * widthD;
            //Calculate the perimeter.
            double perimeter = lengthD + lengthD + widthD + widthD;
            //Display the area and perimeter.
            output = "Area of the Rectangle: " + area + "\n"
                    + "Perimeter of the Rectangle: " + perimeter;
            JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}