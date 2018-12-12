package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcMilesPerGallon
{
    public static ProgramWindow frame;
    public static JTextField beginningField, endingField, gallonsField;
    
    public CalcMilesPerGallon()
    {
        calcMilesPerGallon();
    }
    
    private void calcMilesPerGallon()
    {
        frame = new ProgramWindow("Miles Per Gallon Calculator");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(aLabel());
        setupMPG1();
        frame.add(beginningField);
        frame.add(bLabel());
        setupMPG2();
        frame.add(endingField);
        frame.add(cLabel());
        setupMPG3();
        frame.add(gallonsField);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateMilesPerGallonListener()));
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Beginning Odometer Reading:");
        aLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        beginningField = new JTextField("0");
        beginningField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel bLabel()
    {
        JLabel bLabel = new JLabel("Ending Odometer Reading");
        bLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        endingField = new JTextField("0");
        endingField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel cLabel()
    {
        JLabel cLabel = new JLabel("Gallons of Gas Used:");
        cLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        cLabel.setFont(ProjectGoldStarsX.bodyText1);
        return cLabel;
    }
    
    private void setupMPG3()
    {
        gallonsField = new JTextField("0");
        gallonsField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private static class CalculateMilesPerGallonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String mpgs1 = beginningField.getText();
            String mpgs2 = endingField.getText();
            String mpgs3 = gallonsField.getText();
            double input1, input2, input3;
            try
            {
                input1 = Double.parseDouble(mpgs1);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                input2 = Double.parseDouble(mpgs2);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                input3 = Double.parseDouble(mpgs3);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input1 > input2)
            {
                ProjectGoldStarsX.errors.add("Error: Miles Per Gallon Calculator -\n"
                        + "Beginning Odometer Reading Larger than Ending Odometer Reading");
                output = "ERROR:\n"
                        + "The beginning odometer reading is larger than the ending odometer reading.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input1 == input2)
            {
                output = "ERROR:\n"
                        + "The beginning odometer reading is the same as the ending odometer reading.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input3 <= 0)
            {
                output = "ERROR:\n"
                        + "The number of gallons used is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            output = "The travel distance was " + (input2 - input1) + " miles.";
            output += "\nThe average miles per gallon was " + ((input2 - input1) / input3) + ".";
            JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}