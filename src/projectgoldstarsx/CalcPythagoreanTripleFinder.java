package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcPythagoreanTripleFinder
{
    public static ProgramWindow frame;
    public static JTextField length, width;
    
    public CalcPythagoreanTripleFinder()
    {
        calcPythagoreanTripleFinder();
    }
    
    private void calcPythagoreanTripleFinder()
    {
        frame = new ProgramWindow("Pythagorean Triple Finder");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(825 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter 2 numbers, then press Calculate to find a Pythagorean Triple:");
        frame.add(aLabel());
        setupMPG1();
        frame.add(length);
        frame.add(bLabel());
        setupMPG2();
        frame.add(width);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateRectangleInformationListener()));
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("First Number:");
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
        JLabel bLabel = new JLabel("Second Number:");
        bLabel.setForeground(ProjectGoldStarsX.color2);
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        width = new JTextField("0");
        width.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    public static class CalculateRectangleInformationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String lengthStr = length.getText();
            String widthStr = width.getText();
            int input1, input2;
            //Attempt to convert the first number from a String to an int.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                input1 = Integer.parseInt(lengthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Attempt to convert the second number from a String to an int.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                input2 = Integer.parseInt(widthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //If the first number is less than 1, display an error message and exit the method.
            if(input1 < 1)
            {
                output = "ERROR:\n"
                        + "Number must be greater than or equal to 1.";
                JOptionPane.showMessageDialog(null, output, "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //If the second number number is less than 1, display an error message and exit the method.
            if(input2 < 1)
            {
                output = "ERROR:\n"
                        + "Number must be greater than or equal to 1.";
                JOptionPane.showMessageDialog(null, output, "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input2 > input1)
            {
                int temp;
                temp = input1;
                input1 = input2;
                input2 = temp;
            }
            int a, b, c;
            a = (int)(Math.pow(input1, 2) - Math.pow(input2, 2));
            b = 2 * input1 * input2;
            c = (int)(Math.pow(input1, 2) + Math.pow(input2, 2));
            output = "a = " + a;
            output += "\nb = " + b;
            output += "\nc = " + c;
            JOptionPane.showMessageDialog(null, output, "Pythagorean Triple Finder", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}