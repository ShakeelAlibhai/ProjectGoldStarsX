package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcQuadraticEquation implements ActionListener
{
    public static ProgramWindow frame;
    public static JTextField aField, bField, cField;
    
    public CalcQuadraticEquation()
    {
        quadraticEquation();
    }
    
    private void quadraticEquation()
    {
        frame = new ProgramWindow("Quadratic Equation Solver");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(800 * ProjectGoldStarsX.multiplier, 450 * ProjectGoldStarsX.multiplier);
        frame.setInstructionsMenuBar("Please enter the quadratic equation in the form ax^2 + bx + c = 0.");
        JLabel aLabel = new JLabel("a:");
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        aLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        JLabel bLabel = new JLabel("b:");
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        bLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        JLabel cLabel = new JLabel("c:");
        cLabel.setFont(ProjectGoldStarsX.bodyText1);
        cLabel.setForeground(ProjectGoldStarsX.secondaryColor);
        aField = new JTextField("0");
        aField.setFont(ProjectGoldStarsX.bodyText2);
        bField = new JTextField("0");
        bField.setFont(ProjectGoldStarsX.bodyText2);
        cField = new JTextField("0");
        cField.setFont(ProjectGoldStarsX.bodyText2);
        frame.add(aLabel);
        frame.add(aField);
        frame.add(bLabel);
        frame.add(bField);
        frame.add(cLabel);
        frame.add(cField);
        frame.add(new JLabel());
        frame.add(Components.button2("Solve", new SolveQuadraticEquationListener()));
        frame.makeVisible();
    }
    
    public static class SolveQuadraticEquationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String a, b, c, output;
            a = aField.getText();
            b = bField.getText();
            c = cField.getText();
            Double aNum, bNum, cNum;
            try
            {
                aNum = Double.parseDouble(a);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                bNum = Double.parseDouble(b);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                cNum = Double.parseDouble(c);
            }
            catch(Exception e2)
            {
                ProjectGoldStarsX.errors.add("Error: Calculator");
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double x1, x2, quadSqrt;
            quadSqrt = bNum * bNum;
            quadSqrt = quadSqrt - (4 * aNum * cNum);
            quadSqrt = Math.sqrt(quadSqrt);
            x1 = (-1) * bNum;
            x2 = (-1) * bNum;
            x1 = x1 + quadSqrt;
            x2 = x2 - quadSqrt;
            x1 = x1 / (2 * aNum);
            x2 = x2 / (2 * aNum);
            if(x1 == x2)
            {
                output = "Solving the quadratic equation " + a + "x^2 + " + b + "x + " + c + " = 0...\n"
                        + "There is 1 possible solution: " + x1;
                JOptionPane.showMessageDialog(null, output, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                output = "Solving the quadratic equation " + a + "x^2 + " + b + "x + " + c + " = 0...\n"
                        + "There are 2 possible solutions: " + x1 + " and " + x2;
                JOptionPane.showMessageDialog(null, output, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}