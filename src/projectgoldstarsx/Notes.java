package projectgoldstarsx;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Notes
{
    public Notes()
    {
        notes();
    }
    
    public static JInternalFrame viewNotesFrame;
    public static JTextField notesSearchTextField;
    
    private void notes()
    {
        viewNotesFrame = new JInternalFrame("Notes");
        ProjectGoldStarsX.desktop.add(viewNotesFrame);
        viewNotesFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        viewNotesFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        viewNotesFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
        
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
                fileLabels[i].setForeground(ProjectGoldStarsX.color2);
                viewNotesFrame.add(fileLabels[i]);
            }
        }
        viewNotesFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Create a Note", new ListenersNotes.CreateNoteListener()));
        menuBar.add(Components.standardButton("Edit Notes", new ListenersNotes.EditNotesListener()));
        menuBar.add(Components.standardButton("Import Notes", new ListenersNotes.ImportNotesListener()));
        menuBar.add(Components.standardButton("Rename Notes", new ListenersNotes.RenameNotesListener()));
        menuBar.add(Components.settingsButton("Notes Settings", new ListenersNotes.NotesSettingsListener()));
        setupSearchField();
        menuBar.add(notesSearchTextField);
        menuBar.add(Components.standardButton("Search", new SearchNotesListener()));
        return menuBar;
    }
    
    private void setupSearchField()
    {
        notesSearchTextField = new JTextField();
        notesSearchTextField.setText("Search Notes");
        notesSearchTextField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            notesSearchTextField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            notesSearchTextField.setForeground(ProjectGoldStarsX.color1);
        }
        notesSearchTextField.addActionListener(new SearchNotesListener());
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
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            viewNotesFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(viewNotesFrame);
        }
    }
    
    public static class SearchNotesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NotesSearch sn = new NotesSearch(notesSearchTextField.getText());
            notesSearchTextField.setText("");
        }
    }
}