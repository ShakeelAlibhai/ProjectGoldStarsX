package projectgoldstarsx;
import javax.swing.JOptionPane;
public class EduSquareRoot
{
    public EduSquareRoot()
    {
        squareRoot();
    }
    
    private int correctAnswers;
    
    private void squareRoot()
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
        JOptionPane.showMessageDialog(null, output, "Square Roots", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean generateProblem()
    {
        double r1 = Math.random();
        int num1 = (int)(r1 * (ProjectGoldStarsX.squareRootsMax + 1));
        int answer = num1;
        String output = "The square root of " + (num1 * num1) + " =";
        String inputtedAnswer = JOptionPane.showInputDialog(null, output, "Square Roots", JOptionPane.QUESTION_MESSAGE);
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