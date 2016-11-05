package projectgoldstarsx;
import javax.swing.JOptionPane;
public class EduMultiply
{
    public EduMultiply()
    {
        multiply();
    }
    
    private int correctAnswers;
    
    private void multiply()
    {
        boolean correct = generateProblem();
        while(correct)
        {
            correct = generateProblem();
        }
        String output = "Incorrect Answer!\n"
                + "You got " + correctAnswers + " correct answer(s).";
        JOptionPane.showMessageDialog(null, output, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean generateProblem()
    {
        double r1 = Math.random();
        int num1 = (int)(r1 * (ProjectGoldStarsX.multiplicationMax + 1));
        double r2 = Math.random();
        int num2 = (int)(r2 * (ProjectGoldStarsX.multiplicationMax + 1));
        int answer = num1 * num2;
        String output = num1 + " * " + num2 + " =";
        String inputtedAnswer = JOptionPane.showInputDialog(null, output, "Multiplication", JOptionPane.QUESTION_MESSAGE);
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