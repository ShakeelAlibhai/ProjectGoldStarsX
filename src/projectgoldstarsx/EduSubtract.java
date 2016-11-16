package projectgoldstarsx;
import javax.swing.JOptionPane;
public class EduSubtract
{
    public EduSubtract()
    {
        subtract();
    }
    
    private int correctAnswers;
    
    private void subtract()
    {
        boolean correct = generateProblem();
        while(correct)
        {
            correct = generateProblem();
        }
        String output;
        if(correctAnswers == 1)
        {
            output = "Incorrect answer!\n"
                    + "You got " + correctAnswers + " correct answer.";
        }
        else
        {
            output = "Incorrect answer!\n"
                    + "You got " + correctAnswers + " correct answers.";
        }
        JOptionPane.showMessageDialog(null, output, "Subtraction", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean generateProblem()
    {
        double r1 = Math.random();
        int num1 = (int)(r1 * (ProjectGoldStarsX.subtractionMax + 1));
        double r2 = Math.random();
        int num2 = (int)(r2 * (ProjectGoldStarsX.subtractionMax + 1));
        if(num1 < num2)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int answer = num1 - num2;
        String output = num1 + " - " + num2 + " =";
        String inputtedAnswer = JOptionPane.showInputDialog(null, output, "Subtraction", JOptionPane.QUESTION_MESSAGE);
        int inputtedNum;
        try
        {
            inputtedNum = Integer.parseInt(inputtedAnswer);
        }
        catch(Exception e)
        {
            return false;
        }
        if(answer == inputtedNum)
        {
            correctAnswers++;
            return true;
        }
        else
        {
            return false;
        }
    }
}