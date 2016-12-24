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
                + "2. Calculations and conversions made in the Calculator may not be exact.\n"
                + "3. No guarantee is provided for the information contained in System Information or anywhere else in Project GoldStars X.";
        JOptionPane.showMessageDialog(null, output, "Disclaimer", JOptionPane.INFORMATION_MESSAGE);
    }
}