package projectgoldstarsx;
import javax.swing.JOptionPane;
public class Disclaimer
{
    public Disclaimer()
    {
        disclaimer();
    }
    
    private void disclaimer()
    {
        String output = "1. Neither Project GoldStars X, nor the programmer(s) of Project GoldStars X, nor the distributor(s), of Project GoldStars X,\n"
                + "nor anyone or anything else that is involved with Project GoldStars X, are responsible for any misinformation, any inaccuracy,\n"
                + "any problems, or any harm, whether physical or otherwise, caused by Project GoldStars X or as a result of using Project GoldStars X.\n"
                + "2. Project GoldStars X is not claiming to be an actual operating system in its current state.\n"
                + "The 'OS' in the name 'Project GoldStars X' is symbolic of the direction towards more advanced programs,\n"
                + "rather than claiming that Project GoldStars X is currently an operating system.\n"
                + "3. Calculations and conversions made in the Calculator may not be exact.";
        JOptionPane.showMessageDialog(null, output, "Disclaimer", JOptionPane.INFORMATION_MESSAGE);
    }
}