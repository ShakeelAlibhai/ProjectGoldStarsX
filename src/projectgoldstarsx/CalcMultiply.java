package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcMultiply implements ActionListener
{
    public static JInternalFrame multiplicationFrame;
    public static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    
    public CalcMultiply()
    {
        multiply();
    }
    
    private void multiply()
    {
        multiplicationFrame = new JInternalFrame("Multiplication");
        multiplicationFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        multiplicationFrame.setLayout(new GridLayout(11, 2));
        multiplicationFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        ProjectGoldStarsX.desktop.add(multiplicationFrame);
        multiplicationFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        multiplicationFrame.setJMenuBar(menuBar());
        JLabel number1 = new JLabel("Number #1:");
        number1.setForeground(ProjectGoldStarsX.color2);
        number1.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number2 = new JLabel("Number #2:");
        number2.setForeground(ProjectGoldStarsX.color2);
        number2.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number3 = new JLabel("Number #3:");
        number3.setForeground(ProjectGoldStarsX.color2);
        number3.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number4 = new JLabel("Number #4:");
        number4.setForeground(ProjectGoldStarsX.color2);
        number4.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number5 = new JLabel("Number #5:");
        number5.setForeground(ProjectGoldStarsX.color2);
        number5.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number6 = new JLabel("Number #6:");
        number6.setForeground(ProjectGoldStarsX.color2);
        number6.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number7 = new JLabel("Number #7:");
        number7.setForeground(ProjectGoldStarsX.color2);
        number7.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number8 = new JLabel("Number #8:");
        number8.setForeground(ProjectGoldStarsX.color2);
        number8.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number9 = new JLabel("Number #9:");
        number9.setForeground(ProjectGoldStarsX.color2);
        number9.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number10 = new JLabel("Number #10:");
        number10.setForeground(ProjectGoldStarsX.color2);
        number10.setFont(ProjectGoldStarsX.bodyText1);
        JLabel emptySpace = new JLabel("");
        tf1 = new JTextField("1");
        tf1.setFont(ProjectGoldStarsX.bodyText2);
        tf2 = new JTextField("1");
        tf2.setFont(ProjectGoldStarsX.bodyText2);
        tf3 = new JTextField("1");
        tf3.setFont(ProjectGoldStarsX.bodyText2);
        tf4 = new JTextField("1");
        tf4.setFont(ProjectGoldStarsX.bodyText2);
        tf5 = new JTextField("1");
        tf5.setFont(ProjectGoldStarsX.bodyText2);
        tf6 = new JTextField("1");
        tf6.setFont(ProjectGoldStarsX.bodyText2);
        tf7 = new JTextField("1");
        tf7.setFont(ProjectGoldStarsX.bodyText2);
        tf8 = new JTextField("1");
        tf8.setFont(ProjectGoldStarsX.bodyText2);
        tf9 = new JTextField("1");
        tf9.setFont(ProjectGoldStarsX.bodyText2);
        tf10 = new JTextField("1");
        tf10.setFont(ProjectGoldStarsX.bodyText2);
        multiplicationFrame.add(number1);
        multiplicationFrame.add(tf1);
        multiplicationFrame.add(number2);
        multiplicationFrame.add(tf2);
        multiplicationFrame.add(number3);
        multiplicationFrame.add(tf3);
        multiplicationFrame.add(number4);
        multiplicationFrame.add(tf4);
        multiplicationFrame.add(number5);
        multiplicationFrame.add(tf5);
        multiplicationFrame.add(number6);
        multiplicationFrame.add(tf6);
        multiplicationFrame.add(number7);
        multiplicationFrame.add(tf7);
        multiplicationFrame.add(number8);
        multiplicationFrame.add(tf8);
        multiplicationFrame.add(number9);
        multiplicationFrame.add(tf9);
        multiplicationFrame.add(number10);
        multiplicationFrame.add(tf10);
        multiplicationFrame.add(emptySpace);
        multiplicationFrame.add(Components.button2("Multiply", new MultiplyListener()));
        multiplicationFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        return menuBar;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            multiplicationFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(multiplicationFrame);
        }
    }
    
    private class MultiplyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String[] arrayOfStrings = new String[10];
            arrayOfStrings[0] = tf1.getText();
            arrayOfStrings[1] = tf2.getText();
            arrayOfStrings[2] = tf3.getText();
            arrayOfStrings[3] = tf4.getText();
            arrayOfStrings[4] = tf5.getText();
            arrayOfStrings[5] = tf6.getText();
            arrayOfStrings[6] = tf7.getText();
            arrayOfStrings[7] = tf8.getText();
            arrayOfStrings[8] = tf9.getText();
            arrayOfStrings[9] = tf10.getText();
            Double nums[] = new Double[10];
            for(int i = 0; i < nums.length; i++)
            {
                try
                {
                    nums[i] = Double.parseDouble(arrayOfStrings[i]);
                }
                catch(Exception e2)
                {
                    ProjectGoldStarsX.errors.add("Error: Calculator");
                    JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                }
            }
            double sum = 1;
            for(int i = 0; i < nums.length; i++)
            {
                sum *= nums[i];
            }
            JOptionPane.showMessageDialog(null, sum, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}