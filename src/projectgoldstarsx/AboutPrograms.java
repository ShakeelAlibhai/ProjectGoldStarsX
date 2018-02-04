package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class AboutPrograms
{
    public static ProgramWindow aboutProgramsFrame;
    
    public AboutPrograms()
    {
        aboutPrograms();
    }
    
    private void aboutPrograms()
    {
        aboutProgramsFrame = new ProgramWindow("About Programs");
        aboutProgramsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        aboutProgramsFrame.setLayout(new GridLayout(4, 4));
        aboutProgramsFrame.setInstructionsMenuBar("Please choose a program to view information about:");
        aboutProgramsFrame.add(Components.actionLabel("Browser", new AboutBrowser()));
        aboutProgramsFrame.add(Components.actionLabel("Calculator", new AboutCalculator()));
        aboutProgramsFrame.add(Components.actionLabel("Calendar", new AboutCalendar()));
        aboutProgramsFrame.add(Components.actionLabel("Commands", new AboutCommands()));
        aboutProgramsFrame.add(Components.actionLabel("Education", new AboutEducation()));
        aboutProgramsFrame.add(Components.actionLabel("Error Log", new AboutErrorLog()));
        aboutProgramsFrame.add(Components.actionLabel("Files", new AboutFiles()));
        aboutProgramsFrame.add(Components.actionLabel("Light", new AboutLight()));
        aboutProgramsFrame.add(Components.actionLabel("Notes", new AboutNotes()));
        aboutProgramsFrame.add(Components.actionLabel("Photos", new AboutPhotos()));
        aboutProgramsFrame.add(Components.actionLabel("Search", new AboutSearch()));
        aboutProgramsFrame.add(Components.actionLabel("Stories", new AboutStories()));
        aboutProgramsFrame.add(Components.actionLabel("Talk", new AboutTalk()));
        aboutProgramsFrame.makeVisible();
    }
    
    public static class AboutBrowser implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            aboutBrowser();
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
            aboutCalculator();
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
            aboutCalendar();
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
            aboutNotes();
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
            aboutPhotos();
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
            aboutTalk();
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
            aboutStories();
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
            aboutLight();
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
            aboutEducation();
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
            aboutFiles();
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
            aboutSearch();
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
            aboutErrorLog();
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
            aboutCommands();
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
    
    public static void aboutBrowser()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Browser");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Browser is a web browser!";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutCalculator()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Calculator");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Calculator includes many features:\n"
                + "--Basic Calculations (Add, Subtract, Multiply, and Divide)\n"
                + "--Square Roots, Cube Roots, and Exponents\n"
                + "--Log Base 10 and Natural Log\n"
                + "--Quadratic Equation Solver\n"
                + "--Area and Circumference of a Circle\n"
                + "--Area and Perimeter of a Rectangle\n"
                + "--Area of a Triangle\n"
                + "--Sine, Cosine, and Tangent\n"
                + "--Average Calculator\n"
                + "--Miles Per Gallon Calculator\n"
                + "--Pythagorean Triple Finder\n"
                + "--Conversions";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutCalendar()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Calendar");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "This program can display the current date in two formats. It also displays the time.\n"
                + "The format in which the date is displayed can be changed in Calendar Settings.\n"
                + "You can also create calendar events.\n"
                + "You can search the Calendar for your saved events, as well as view the events that you have\n"
                + "today and tomorrow.\n"
                + "Note: Not all of today's calendar events may show in \"View Today's Events;\" similarly,\n"
                + "not all of tomorrow's calendar events may show in \"View Tomorrow's Events.\"\n"
                + "You may need to adjust the size of the window to view more events.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutCommands()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Commands");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "Commands is similar to Talk, except without the conversation part and with a different interface.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutEducation()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Education");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can practice math and reading in Education!";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutErrorLog()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About the Error Log");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "The Error Log is a list of some or all of the errors Project GoldStars X\n"
                + "may have encountered since it was last started.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutFiles()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Education");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "In Files, you can view notes and photos that you have saved to Project GoldStars X.\n"
                + "You can also search files (which will search the notes and photos that you have saved to Project GoldStars X).";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutLight()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Light");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output;
        switch(ProjectGoldStarsX.language)
        {
            case "1": default:
            {
                output = "Light can be used as a flashlight than can have different colors.";
                break;
            }
            case "2":
            {
                output = "Light can be used as a flashlight than can have different colours.";
                break;
            }
        }
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutNotes()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Notes");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "This program can save notes.\n"
                + "You can create, import, edit, rename, search, and view notes.\n"
                + "In Notes Settings, you can adjust whether the Notes Search is case sensitive or not.\n"
                + "Note: The entirety of a saved note might not show in the viewing window.\n"
                + "You may need to adjust the size of the window to view more of the note.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutPhotos()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Photos");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "In this program, you can import photos. You can then view the photos that you have imported.\n"
                + "You can also search your photos.\n"
                + "In Photos Settings, you can adjust whether the Photos Search is case sensitive or not.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutSearch()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Search");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can enter a search term into the search box to search for programs and actions,\n"
                + "saved calendar events, notes, photos, and the Error Log.\n"
                + "If a program or action is found for your search term, then a window or dialog box will be opened\n"
                + "that corresponds to that program or action.\n"
                + "If no program or action is found, then saved calendar events, notes, photos, and the Error Log\n"
                + "will be searched.\n"
                + "You can adjust the case sensitivity of Search in Search Settings.\n"
                + "Note 1: Not all programs and actions are necessarily accessible by Search.\n"
                + "Note 2: Search case sensitivity does not affect Search when searching for programs and/or actions.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutStories()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Stories");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output = "You can read many short stories in Stories!\n"
                + "Note: The stories shown are meant to be fiction.";
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
    
    public static void aboutTalk()
    {
        InformationWindow currentSettingsFrame = new InformationWindow("About Talk");
        currentSettingsFrame.setLayout(new GridLayout(1, 1));
        currentSettingsFrame.setSize(750 * ProjectGoldStarsX.multiplier, 400 * ProjectGoldStarsX.multiplier);
        String output;
        switch(ProjectGoldStarsX.language)
        {
            case "1": default:
            {
                output = "Have a conversation with the computer by typing messages to it!\n"
                        + "You can use this for fun, or get a task done quickly!\n"
                        + "For example, you can talk to Talk about your favorite flavor of ice cream,\n"
                        + "or you can ask it to change your username for you!";
                break;
            }
            case "2":
            {
                output = "You can have a conversation with the computer by typing messages to it!\n"
                        + "This can be used for fun, or get a task done quickly!\n"
                        + "For example, you can talk to Talk about your favourite flavour of ice cream,\n"
                        + "or you can ask it to change your username for you!";
                break;
            }
        }
        currentSettingsFrame.addText(ProjectGoldStarsX.bodyText1, output);
        currentSettingsFrame.makeVisible();
    }
}