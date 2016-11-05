package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
public class AboutPrograms
{
    public static JInternalFrame aboutProgramsFrame;
    public static String output;
    
    public AboutPrograms()
    {
        aboutPrograms();
    }
    
    private void aboutPrograms()
    {
        aboutProgramsFrame = new JInternalFrame("About Programs");
        ProjectGoldStarsX.desktop.add(aboutProgramsFrame);
        aboutProgramsFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        aboutProgramsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        aboutProgramsFrame.setLayout(new GridLayout(4, 4));
        aboutProgramsFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        aboutProgramsFrame.setJMenuBar(menuBar());
        aboutProgramsFrame.add(addProgram("Browser", new AboutBrowser()));
        aboutProgramsFrame.add(addProgram("Calendar", new AboutCalendar()));
        aboutProgramsFrame.add(addProgram("Calculator", new AboutCalculator()));
        aboutProgramsFrame.add(addProgram("Notes", new AboutNotes()));
        aboutProgramsFrame.add(addProgram("Photos", new AboutPhotos()));
        aboutProgramsFrame.add(addProgram("Education", new AboutEducation()));
        aboutProgramsFrame.add(addProgram("Light", new AboutLight()));
        aboutProgramsFrame.add(addProgram("Talk", new AboutTalk()));
        aboutProgramsFrame.add(addProgram("Stories", new AboutStories()));
        aboutProgramsFrame.add(addProgram("Files", new AboutFiles()));
        aboutProgramsFrame.add(addProgram("Search", new AboutSearch()));
        aboutProgramsFrame.add(addProgram("Settings", new AboutSettings()));
        aboutProgramsFrame.add(addProgram("Error Log", new AboutErrorLog()));
        aboutProgramsFrame.add(addProgram("Commands", new AboutCommands()));
        aboutProgramsFrame.add(addProgram("Help", new AboutHelp()));
        aboutProgramsFrame.add(addProgram("System Information", new AboutSystemInformation()));
        aboutProgramsFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        JLabel instructionsLabel = new JLabel("Please choose a program to view information about:");
        instructionsLabel.setForeground(ProjectGoldStarsX.color2);
        instructionsLabel.setFont(ProjectGoldStarsX.mediumText1);
        menuBar.add(instructionsLabel);
        return menuBar;
    }
    
    private JLabel addProgram(String programName, MouseListener mouseListener)
    {
        JLabel program = new JLabel(programName, SwingConstants.CENTER);
        program.setForeground(ProjectGoldStarsX.color2);
        program.setFont(ProjectGoldStarsX.mediumText1);
        program.addMouseListener(mouseListener);
        return program;
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            aboutProgramsFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(aboutProgramsFrame);
        }
    }
    
    public static class AboutBrowser implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "The Browser is a web browser!";
            JOptionPane.showMessageDialog(null, output, "About Browser", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutCalendar implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "This program can display the current date in two formats.\n"
                    + "The format in which the date is displayed can be changed in Calendar Settings.\n"
                    + "You can also create calendar events.\n"
                    + "You can search the Calendar for your saved events,\n"
                    + "as well as view the events that you have today.\n"
                    + "Note: Not all of today's calendar events may show in 'View Today's Events.'\n"
                    + "You may need to adjust the size of the window to view more events.";
            JOptionPane.showMessageDialog(null, output, "About Calendar", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutCalculator implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "This program can:\n"
                    + "--Add, subtract, multiply, and divide numbers.\n"
                    + "--Find the square root of a number and the cube root of a number.\n"
                    + "--Raise a number to a power.\n"
                    + "--Solve a quadratic equation.\n"
                    + "--Find the log base 10 of a number and the natural log (log base e) of a number.\n"
                    + "--Compute using e (~" + Math.E + ").\n"
                    + "--Compute using pi (~" + Math.PI + ").\n"
                    + "--Find the sine, cosine, and tangent of a number.\n"
                    + "The Calculator also includes an Average Calculator, a Miles Per Gallon Calculator,\n"
                    + "and a Pythagorean Triple Finder, as well as several conversion options.";
            JOptionPane.showMessageDialog(null, output, "About Calculator", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutNotes implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "This program can save notes that you type.\n"
                    + "You can create, import, edit, rename, search, and view notes.\n"
                    + "In Notes Settings, you can adjust whether the Notes Search is case sensitive or not.\n"
                    + "Note: The entirety of a saved note might not show in the viewing window.\n"
                    + "You may need to adjust the size of the window to view more of the note.";
            JOptionPane.showMessageDialog(null, output, "About Notes", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutPhotos implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "In this program, you can import photos. You can then view the photos that you have imported.\n"
                    + "You can also search your photos.\n"
                    + "In Photos Settings, you can adjust whether the Photos Search is case sensitive or not.";
            JOptionPane.showMessageDialog(null, output, "About Photos", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutSettings implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "In Settings, you can:\n"
                    + "--Change the language between American English and British English.\n"
                    + "--Change the theme.\n"
                    + "--Change your username.\n"
                    + "--Set the location.\n"
                    + "--Change the format of the calendar.\n"
                    + "--Change whether the Notes Search is case sensitive.\n"
                    + "--Change whether the Photos Search is case sensitive.\n"
                    + "--Change what Talk calls you.\n"
                    + "--Change whether Search is case sensitive.\n"
                    + "--Change whether the Error Log Search is case sensitive.\n"
                    + "NOTE: In order for some changes to take place, you may have to restart Project GoldStars X.";
            JOptionPane.showMessageDialog(null, output, "About Settings", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutTalk implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            switch(ProjectGoldStarsX.language)
            {
                case "1": default:
                {
                    output = "Have a conversation with the computer by typing messages to it!\n"
                            + "You can use this for fun, or get a task done quickly!\n"
                            + "For example, you can talk to Talk about your favorite flavor of ice cream, "
                            + "or you can ask it to change your username for you!";
                    JOptionPane.showMessageDialog(null, output, "About Talk", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                case "2":
                {
                    output = "You can have a conversation with the computer by typing messages to it!\n"
                            + "This can be used for fun, or get a task done quickly!\n"
                            + "For example, you can talk to Talk about your favourite flavour of ice cream, "
                            + "or you can ask it to change your username for you!";
                    JOptionPane.showMessageDialog(null, output, "About Talk", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutStories implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "You can read many short stories in Stories!";
            JOptionPane.showMessageDialog(null, output, "About Stories", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutLight implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "Light can be used as a flashlight than can have different colors.";
            JOptionPane.showMessageDialog(null, output, "About Light", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutEducation implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "You can practice math and reading in Education!";
            JOptionPane.showMessageDialog(null, output, "About Education", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutFiles implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "In Files, you can view notes and photos that you have saved to Project GoldStars X.\n"
                    + "You can also search files (which will search the notes and photos that you have saved to Project GoldStars X).";
            JOptionPane.showMessageDialog(null, output, "About Files", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutSearch implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            output = "Entering a search term into Search will search your saved calendar events,\n"
                    + "notes, photos, and the Error Log for your search term.\n"
                    + "You can adjust the case sensitivity of Search in Search Settings.";
            JOptionPane.showMessageDialog(null, output, "About Search", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutErrorLog implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "The Error Log is a list of some or all of the errors Snow OS may have encountered since it was last started.";
            JOptionPane.showMessageDialog(null, output, "About the Error Log", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutCommands implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "Commands is similar to Talk, except without the conversation part.";
            JOptionPane.showMessageDialog(null, output, "About Commands", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutHelp implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "The Help app explains how to customize Project GoldStars X, suggests possible things to say to Talk, and more!";
            JOptionPane.showMessageDialog(null, output, "About Help", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AboutSystemInformation implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            String output = "In System Information, you can view:\n"
                    + "--The amount of memory being used by the Java Virtual Machine.\n"
                    + "--The total amount of memory available for the Java Virtual Machine.\n"
                    + "--The screen resolution of the screen.\n"
                    + "--The date and time that Project GoldStars X was last started.\n"
                    + "--The current version of Project GoldStars X.";
            JOptionPane.showMessageDialog(null, output, "About System Information", JOptionPane.INFORMATION_MESSAGE);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
}