package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcSquareAndCubeRoots implements ActionListener
{
    public static ProgramWindow frame;
    public static JTextField numberField, squareRootField, cubeRootField;
    
    public CalcSquareAndCubeRoots()
    {
        calcSquareAndCubeRoots();
    }
    
    private void calcSquareAndCubeRoots()
    {
        frame = new ProgramWindow("Square & Cube Roots");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        frame.setStandardMenuBar();
        frame.add(Components.standardLabel("Number:"));
        setupNumberField();
        frame.add(numberField);
        frame.add(Components.button2("Compute", new ComputeListener()));
        frame.add(Components.standardLabel("Square Root:"));
        setupSquareRootField();
        frame.add(squareRootField);
        frame.add(new JLabel());
        frame.add(Components.standardLabel("Cube Root:"));
        setupCubeRootField();
        frame.add(cubeRootField);
        frame.add(new JLabel());
        frame.makeVisible();
    }
    
    private void setupNumberField()
    {
        numberField = new JTextField("0");
        numberField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupSquareRootField()
    {
        squareRootField = new JTextField("0");
        squareRootField.setEditable(false);
        squareRootField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private void setupCubeRootField()
    {
        cubeRootField = new JTextField("0");
        cubeRootField.setEditable(false);
        cubeRootField.setFont(ProjectGoldStarsX.bodyText2);
    }
    
    private class ComputeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double input = 0.0;
            try
            {
                String temp = numberField.getText();
                input = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            squareRootField.setText("" + Math.sqrt(input));
            cubeRootField.setText("" + Math.cbrt(input));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}