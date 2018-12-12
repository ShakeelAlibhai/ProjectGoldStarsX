package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class ChangeUsername
{
    static ProgramWindow settingsFrame;
    static JTextField newUsernameField;
    
    public ChangeUsername()
    {
        changeUsername();
    }
    
    private void changeUsername()
    {
        settingsFrame = new ProgramWindow("Change Username");
        settingsFrame.setLayout(new GridLayout(2, 2));
        settingsFrame.setSize(725 * ProjectGoldStarsX.multiplier, 375 * ProjectGoldStarsX.multiplier);
        settingsFrame.setInstructionsMenuBar("Please enter your new username and then click Save:");
        newUsernameField = new JTextField("");
        newUsernameField.setFont(ProjectGoldStarsX.bodyText2);
        newUsernameField.addActionListener(new SaveUsernameListener());
        settingsFrame.add(Components.standardLabel("New Username:"));
        settingsFrame.add(newUsernameField);
        settingsFrame.add(new JLabel());
        settingsFrame.add(Components.button2("Save", new SaveUsernameListener()));
        settingsFrame.makeVisible();
    }
    
    private class SaveUsernameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String oldUsername = ProjectGoldStarsX.username;
            //Get the new username.
            String newUsername = newUsernameField.getText();
            if(newUsername == null)
            {
                return;
            }
            if(newUsername.equals(""))
            {
                output = "No username entered!";
                JOptionPane.showMessageDialog(null, output, "Change Username", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            ProjectGoldStarsX.username = newUsername;
            output = "Congratulations! You have successfully changed your username from " + oldUsername + " to " + ProjectGoldStarsX.username + ".";
            JOptionPane.showMessageDialog(null, output, "Change Username", JOptionPane.INFORMATION_MESSAGE);
            //Save the username to the user's Project GoldStars X folder.
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsX.SYSTEM_FOLDER, "username.txt");
                out = new PrintWriter(file);
                out.append(ProjectGoldStarsX.username);
                out.close();
            }
            catch(FileNotFoundException e2)
            {

            }
        }
    }
}