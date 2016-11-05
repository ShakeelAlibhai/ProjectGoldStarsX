package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcQuadraticEquation implements ActionListener
{
    public static JInternalFrame qeFrame;
    public static JTextField af, bf, cf;
    
    public CalcQuadraticEquation()
    {
        quadraticEquation();
    }
    
    private void quadraticEquation()
    {
        qeFrame = new JInternalFrame("Quadratic Equation Solver");
        ProjectGoldStarsX.desktop.add(qeFrame);
        qeFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        qeFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        qeFrame.setLayout(new GridLayout(4, 2));
        qeFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        JLabel instructionsLabel = new JLabel("Please enter the quadratic equation in the following form: ax^2 + bx + c");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        menuBar.add(instructionsLabel);
        qeFrame.setJMenuBar(menuBar);
        JLabel aLabel = new JLabel("a:");
        aLabel.setFont(ProjectGoldStarsX.bodyText1);
        aLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel bLabel = new JLabel("b:");
        bLabel.setFont(ProjectGoldStarsX.bodyText1);
        bLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel cLabel = new JLabel("c:");
        cLabel.setFont(ProjectGoldStarsX.bodyText1);
        cLabel.setForeground(ProjectGoldStarsX.color2);
        JLabel emptySpace = new JLabel("");
        af = new JTextField("0");
        af.setFont(ProjectGoldStarsX.bodyText2);
        bf = new JTextField("0");
        bf.setFont(ProjectGoldStarsX.bodyText2);
        cf = new JTextField("0");
        cf.setFont(ProjectGoldStarsX.bodyText2);
        qeFrame.add(aLabel);
        qeFrame.add(af);
        qeFrame.add(bLabel);
        qeFrame.add(bf);
        qeFrame.add(cLabel);
        qeFrame.add(cf);
        qeFrame.add(emptySpace);
        qeFrame.add(Components.button2("Solve", new SolveQuadraticEquationListener()));
        qeFrame.setVisible(true);
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            qeFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(qeFrame);
        }
    }
    
    public static class SolveQuadraticEquationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String a, b, c, output;
            a = af.getText();
            b = bf.getText();
            c = cf.getText();
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