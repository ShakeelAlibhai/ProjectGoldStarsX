package projectgoldstarsx;
import javax.swing.JOptionPane;
public class CalcRectangleInformation
{
    public CalcRectangleInformation()
    {
        calcRectangleInformation();
    }
    
    private void calcRectangleInformation()
    {
        double length, width;
        String output, temp;
        //Ask the user to input the length of the rectangle.
        //The length of the rectangle is stored as a String.
        temp = "Please enter the length of the rectangle:";
        output = JOptionPane.showInputDialog(null, temp, "Rectangle Information Calculator", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the length of the rectangle from a String to a Double.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            length = Double.parseDouble(output);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Rectangle Information Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //If the length of the rectangle is less than or equal to 0, display an error message and exit the method.
        if(length <= 0)
        {
            output = "ERROR:\n"
                    + "The length of the rectangle is less than or equal to 0.";
            JOptionPane.showMessageDialog(null, output, "Rectangle Information Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Ask the user to input the width of the rectangle.
        //The width of the rectangle is stored as a String.
        temp = "Please enter the width of the rectangle:";
        output = JOptionPane.showInputDialog(null, temp, "Rectangle Information Calculator", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the width of the rectangle from a String to a Double.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            width = Double.parseDouble(output);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Rectangle Information Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //If the width of the rectangle is less than or equal to 0, display an error message and exit the method.
        if(width <= 0)
        {
            output = "ERROR:\n"
                    + "The width of the rectangle is less than or equal to 0.";
            JOptionPane.showMessageDialog(null, output, "Rectangle Information Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Calculate the area.
        double area = length * width;
        //Calculate the perimeter.
        double perimeter = length + length + width + width;
        //Display the area and perimeter.
        output = "Area of the Rectangle: " + area + "\n"
                + "Perimeter of the Rectangle: " + perimeter;
        JOptionPane.showMessageDialog(null, output, "Rectangle Information Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}