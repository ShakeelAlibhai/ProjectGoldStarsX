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
    public static JTextField lengthField, widthField;
    
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
        frame.add(Components.standardLabel("Length:"));
        setupLengthField();
        frame.add(lengthField);
        frame.add(Components.standardLabel("Width:"));
        setupWidthField();
        frame.add(widthField);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private void setupLengthField()
    {
        lengthField = new JTextField("0");
        lengthField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupWidthField()
    {
        widthField = new JTextField("0");
        widthField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String lengthStr = lengthField.getText();
            String widthStr = widthField.getText();
            double lengthD, widthD;
            try
            {
                lengthD = Double.parseDouble(lengthStr);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                widthD = Double.parseDouble(widthStr);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(lengthD <= 0)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator\n"
                        + "Error Description: The input for the length of a rectangle was less than or equal to 0.");
                output = "ERROR:\n"
                        + "The length of the rectangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(widthD <= 0)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator\n"
                        + "Error Description: The input for the width of a rectangle was less than or equal to 0.");
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