package projectgoldstarsx;
import javax.swing.JOptionPane;
public class EduDivide
{
    public EduDivide()
    {
        divide();
    }
    
    private int correctAnswers;
    private int num1;
    private int num2;
    
    private void divide()
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
        JOptionPane.showMessageDialog(null, output, "Division", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean generateProblem()
    {
        get2Numbers();
        while(!(num1 % num2 == 0))
        {
            get2Numbers();
        }
        int answer = num1 / num2;
        String output = num1 + " / " + num2 + " =";
        String inputtedAnswer = JOptionPane.showInputDialog(null, output, "Division", JOptionPane.QUESTION_MESSAGE);
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
    
    private void get2Numbers()
    {
        double r1 = Math.random();
        num1 = (int)(r1 * ProjectGoldStarsX.divisionMax);
        double r2 = Math.random();
        num2 = (int)(r2 * ProjectGoldStarsX.divisionMax);
        num1++;
        num2++;
        if(num1 < num2)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
    }
}