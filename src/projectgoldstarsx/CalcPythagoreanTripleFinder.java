package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcPythagoreanTripleFinder
{
    public CalcPythagoreanTripleFinder()
    {
        pythagoreanTripleFinder();
    }
    
    private void pythagoreanTripleFinder()
    {
        String output, tempStr;
        int input1, input2;
        //Ask the user to input the first number.
        //The first number is stored as a String.
        tempStr = "Please enter the first number:";
        output = JOptionPane.showInputDialog(null, tempStr, "Pythagorean Triple Finder", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the first number from a String to an int.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            input1 = Integer.parseInt(output);
        }
        catch(Exception error)
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
        //Ask the user to input the second number.
        //The second number is stored as a String.
        tempStr = "Please enter the second number:";
        output = JOptionPane.showInputDialog(null, tempStr, "Pythagorean Triple Finder", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the second number from a String to an int.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            input2 = Integer.parseInt(output);
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
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