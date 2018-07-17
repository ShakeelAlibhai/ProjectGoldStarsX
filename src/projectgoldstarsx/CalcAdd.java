package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcAdd implements ActionListener
{
    public static ProgramWindow additionFrame;
    public static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    
    public CalcAdd()
    {
        add();
    }
    
    private void add()
    {
        additionFrame = new ProgramWindow("Addition");
        additionFrame.setLayout(new GridLayout(11, 2));
        additionFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        additionFrame.setJMenuBar(menuBar());
        JLabel number1 = new JLabel("Number #1:");
        number1.setForeground(ProjectGoldStarsX.secondaryColor);
        number1.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number2 = new JLabel("Number #2:");
        number2.setForeground(ProjectGoldStarsX.secondaryColor);
        number2.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number3 = new JLabel("Number #3:");
        number3.setForeground(ProjectGoldStarsX.secondaryColor);
        number3.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number4 = new JLabel("Number #4:");
        number4.setForeground(ProjectGoldStarsX.secondaryColor);
        number4.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number5 = new JLabel("Number #5:");
        number5.setForeground(ProjectGoldStarsX.secondaryColor);
        number5.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number6 = new JLabel("Number #6:");
        number6.setForeground(ProjectGoldStarsX.secondaryColor);
        number6.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number7 = new JLabel("Number #7:");
        number7.setForeground(ProjectGoldStarsX.secondaryColor);
        number7.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number8 = new JLabel("Number #8:");
        number8.setForeground(ProjectGoldStarsX.secondaryColor);
        number8.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number9 = new JLabel("Number #9:");
        number9.setForeground(ProjectGoldStarsX.secondaryColor);
        number9.setFont(ProjectGoldStarsX.bodyText1);
        JLabel number10 = new JLabel("Number #10:");
        number10.setForeground(ProjectGoldStarsX.secondaryColor);
        number10.setFont(ProjectGoldStarsX.bodyText1);
        tf1 = new JTextField("0");
        tf1.setFont(ProjectGoldStarsX.bodyText2);
        tf2 = new JTextField("0");
        tf2.setFont(ProjectGoldStarsX.bodyText2);
        tf3 = new JTextField("0");
        tf3.setFont(ProjectGoldStarsX.bodyText2);
        tf4 = new JTextField("0");
        tf4.setFont(ProjectGoldStarsX.bodyText2);
        tf5 = new JTextField("0");
        tf5.setFont(ProjectGoldStarsX.bodyText2);
        tf6 = new JTextField("0");
        tf6.setFont(ProjectGoldStarsX.bodyText2);
        tf7 = new JTextField("0");
        tf7.setFont(ProjectGoldStarsX.bodyText2);
        tf8 = new JTextField("0");
        tf8.setFont(ProjectGoldStarsX.bodyText2);
        tf9 = new JTextField("0");
        tf9.setFont(ProjectGoldStarsX.bodyText2);
        tf10 = new JTextField("0");
        tf10.setFont(ProjectGoldStarsX.bodyText2);
        additionFrame.add(number1);
        additionFrame.add(tf1);
        additionFrame.add(number2);
        additionFrame.add(tf2);
        additionFrame.add(number3);
        additionFrame.add(tf3);
        additionFrame.add(number4);
        additionFrame.add(tf4);
        additionFrame.add(number5);
        additionFrame.add(tf5);
        additionFrame.add(number6);
        additionFrame.add(tf6);
        additionFrame.add(number7);
        additionFrame.add(tf7);
        additionFrame.add(number8);
        additionFrame.add(tf8);
        additionFrame.add(number9);
        additionFrame.add(tf9);
        additionFrame.add(number10);
        additionFrame.add(tf10);
        additionFrame.add(new JLabel());
        additionFrame.add(Components.button2("Add", new AddListener()));
        additionFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(additionFrame.getCloseButton());
        menuBar.add(additionFrame.getMaximizeButton());
        menuBar.add(additionFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Add More Than 10 Numbers", new AddMoreThan10NumbersListener()));
        return menuBar;
    }
    
    private class AddListener implements ActionListener
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
            double sum = 0;
            for(int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
            }
            JOptionPane.showMessageDialog(null, sum, "Addition", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class AddMoreThan10NumbersListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            boolean continuePrompt = true;
            boolean firstPrompt = true;
            double sum = 0.0;
            double previousNumber = 0.0;
            double previousSum = 0.0;
            while(continuePrompt)
            {
                String displayText;
                if(firstPrompt)
                {
                    displayText = "Please enter the first number:";
                }
                else
                {
                    displayText = previousSum + " + " + previousNumber + " = " + sum + "\n"
                            + "Please enter the number to add to " + sum + ".";
                }
                firstPrompt = false;
                output = JOptionPane.showInputDialog(null, displayText, "Addition", JOptionPane.QUESTION_MESSAGE);
                if(output == null)
                {
                    return;
                }
                double input;
                try
                {
                    input = Double.parseDouble(output);
                }
                catch(Exception error)
                {
                    ProjectGoldStarsX.errors.add("Error: Calculator");
                    JOptionPane.showMessageDialog(null, "ERROR", "Addition", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                previousSum = sum;
                previousNumber = input;
                sum += input;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}