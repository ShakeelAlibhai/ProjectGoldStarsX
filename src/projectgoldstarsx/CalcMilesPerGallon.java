package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcMilesPerGallon
{
    public static JInternalFrame mpgFrame;
    public static JTextField mpg1, mpg2, mpg3;
    
    public CalcMilesPerGallon()
    {
        calcMilesPerGallon();
    }
    
    private void calcMilesPerGallon()
    {
        mpgFrame = new JInternalFrame("Miles Per Gallon Calculator");
        mpgFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        mpgFrame.setLayout(new GridLayout(4, 2));
        mpgFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.desktop.add(mpgFrame);
        mpgFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        mpgFrame.setJMenuBar(menuBar());
        mpgFrame.add(aLabel());
        setupMPG1();
        mpgFrame.add(mpg1);
        mpgFrame.add(bLabel());
        setupMPG2();
        mpgFrame.add(mpg2);
        mpgFrame.add(cLabel());
        setupMPG3();
        mpgFrame.add(mpg3);
        mpgFrame.add(new JLabel());
        mpgFrame.add(Components.button2("Calculate", new CalculateMilesPerGallonListener()));
        mpgFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(instructionsLabel());
        return menuBar;
    }
    
    private JLabel instructionsLabel()
    {
        JLabel instructionsLabel = new JLabel("Please enter the following information:");
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        return instructionsLabel;
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Beginning Odometer Reading:");
        aLabel.setForeground(ProjectGoldStarsX.color2);
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        mpg1 = new JTextField("0");
        mpg1.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel bLabel()
    {
        JLabel bLabel = new JLabel("Ending Odometer Reading");
        bLabel.setForeground(ProjectGoldStarsX.color2);
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        mpg2 = new JTextField("0");
        mpg2.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private JLabel cLabel()
    {
        JLabel cLabel = new JLabel("Gallons of Gas Used:");
        cLabel.setForeground(ProjectGoldStarsX.color2);
        cLabel.setFont(ProjectGoldStarsX.bodyText1);
        return cLabel;
    }
    
    private void setupMPG3()
    {
        mpg3 = new JTextField("0");
        mpg3.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            mpgFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(mpgFrame);
        }
    }
    
    private static class CalculateMilesPerGallonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String mpgs1 = mpg1.getText();
            String mpgs2 = mpg2.getText();
            String mpgs3 = mpg3.getText();
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