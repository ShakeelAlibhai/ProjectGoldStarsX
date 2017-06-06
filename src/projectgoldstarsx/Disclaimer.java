package projectgoldstarsx;
import java.awt.GridLayout;
public class Disclaimer
{
    public Disclaimer()
    {
        disclaimer();
    }
    
    private void disclaimer()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("Disclaimer");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(900 * ProjectGoldStarsX.multiplier, 500 * ProjectGoldStarsX.multiplier);
        String output = "1. Neither Project GoldStars X, nor the programmer(s) of Project GoldStars X, nor the distributor(s) of Project GoldStars X,\n"
                + "nor anyone or anything else that is involved with Project GoldStars X, are responsible for any misinformation, any inaccuracy,\n"
                + "any problems, or any harm, whether physical or otherwise, caused by Project GoldStars X or as a result of using Project GoldStars X.\n"
                + "2. Calculations and conversions made in Project GoldStars X may not be exact.\n"
                + "3. No guarantee is provided for the information contained in System Information or anywhere else in Project GoldStars X.\n"
                + "4. The \"Troubleshoot Problems\" section of Project GoldStars X is not guaranteed to solve or give guidance on how to solve\n"
                + "any or all problem(s) relating to Project GoldStars X or anything else.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}