package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Notes
{
    public Notes()
    {
        notes();
    }
    
    public static ProgramWindow viewNotesFrame;
    public static JTextField notesSearchField;
    
    private void notes()
    {
        viewNotesFrame = new ProgramWindow("Notes");
        viewNotesFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        
        viewNotesFrame.setJMenuBar(menuBar());
        ArrayList<String> files = new ArrayList<String>();
        for(int i = 0; i < ProjectGoldStarsX.noteNames.size(); i++)
        {
            files.add(ProjectGoldStarsX.noteNames.get(i));
        }
        JLabel[] fileLabels = new JLabel[files.size()];
        for(int i = 0; i < ProjectGoldStarsX.noteNames.size(); i++)
        {
            fileLabels[i] = new JLabel(ProjectGoldStarsX.noteNames.get(i), SwingConstants.CENTER);
            fileLabels[i].addMouseListener(new FileListener(ProjectGoldStarsX.notes.get(i), false));
        }
        //If no notes have been saved to Project GoldStars X yet
        if(fileLabels.length == 0)
        {
            viewNotesFrame.add(Components.titleLabel("You haven't saved any notes to Project GoldStars X yet!"));
        }
        else
        {
            for(int i = 0; i < fileLabels.length; i++)
            {
                viewNotesFrame.setLayout(new GridLayout(((ProjectGoldStarsX.noteNames.size() - 1) / 3) + 1, 3));
                fileLabels[i].setFont(ProjectGoldStarsX.mediumText1);
                fileLabels[i].setForeground(ProjectGoldStarsX.secondaryColor);
                viewNotesFrame.add(fileLabels[i]);
            }
        }
        viewNotesFrame.makeVisible();
    }
    
    //Returns the JMenuBar that will be added to the ProgramWindow
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);
        menuBar.add(viewNotesFrame.getCloseButton());
        menuBar.add(viewNotesFrame.getMaximizeButton());
        menuBar.add(viewNotesFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Create a Note", new ListenersNotes.CreateNoteListener()));
        menuBar.add(Components.standardButton("Edit Notes", new ListenersNotes.EditNotesListener()));
        menuBar.add(Components.standardButton("Import Notes", new ListenersNotes.ImportNotesListener()));
        menuBar.add(Components.standardButton("Rename Notes", new ListenersNotes.RenameNotesListener()));
        menuBar.add(Components.settingsButton("Notes Settings", new ListenersNotes.NotesSettingsListener()));
        setupSearchField();
        menuBar.add(notesSearchField);
        menuBar.add(Components.standardButton("Search", new SearchNotesListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Notes", new ListenersNotes.AboutNotesListener()));
        return menu.getMenu();
    }
    
    private void setupSearchField()
    {
        notesSearchField = new JTextField();
        notesSearchField.setText("Search Notes");
        notesSearchField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            notesSearchField.setForeground(ProjectGoldStarsX.secondaryColor);
        }
        else
        {
            notesSearchField.setForeground(ProjectGoldStarsX.mainColor);
        }
        notesSearchField.addActionListener(new SearchNotesListener());
    }
    
    private class FileListener implements MouseListener
    {
        String toDisplay;
        boolean picture;
        
        public FileListener(String name, boolean photo)
        {
            toDisplay = name;
            picture = photo;
        }
        
        public void mousePressed(MouseEvent e)
        {
            //If the file clicked on was not a picture
            if(!picture)
            {
                new NotesView(toDisplay);
            }
            //If the file clicked on was a picture
            else
            {
                JFrame photoFrame = new JFrame("Photos");
                photoFrame.setVisible(true);
                photoFrame.setSize(1000 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
                ImageIcon image = new ImageIcon(toDisplay);
                JLabel photo = new JLabel(image);
                photoFrame.add(photo);
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
    
    public static class SearchNotesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new NotesSearch(notesSearchField.getText());
            notesSearchField.setText("");
        }
    }
}