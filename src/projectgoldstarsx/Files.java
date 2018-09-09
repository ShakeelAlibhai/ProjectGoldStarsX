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
public class Files
{
    public Files()
    {
        files();
    }
    
    public static ProgramWindow filesFrame;
    public static JTextField filesSearchField;
    
    private void files()
    {
        filesFrame = new ProgramWindow("Files");
        filesFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        filesFrame.setJMenuBar(menuBar());
        ArrayList<String> files = new ArrayList<String>();
        for(int i = 0; i < ProjectGoldStarsX.noteNames.size(); i++)
        {
            files.add(ProjectGoldStarsX.noteNames.get(i));
        }
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            files.add(ProjectGoldStarsX.photoNames.get(i));
        }
        JLabel[] fileLabels = new JLabel[files.size()];
        for(int i = 0; i < ProjectGoldStarsX.noteNames.size(); i++)
        {
            fileLabels[i] = new JLabel(ProjectGoldStarsX.noteNames.get(i), SwingConstants.CENTER);
            fileLabels[i].addMouseListener(new FileListener(ProjectGoldStarsX.notes.get(i), false));
        }
        for(int i = ProjectGoldStarsX.noteNames.size(); i < ProjectGoldStarsX.noteNames.size() + ProjectGoldStarsX.photoNames.size(); i++)
        {
            fileLabels[i] = new JLabel("Photo " + (i + 1 - ProjectGoldStarsX.noteNames.size()), SwingConstants.CENTER);
            fileLabels[i].addMouseListener(new FileListener(files.get(i), true));
        }
        if(fileLabels.length == 0)
        {
            filesFrame.add(Components.titleLabel("You haven't saved any files to Project GoldStars X yet!"));
        }
        else
        {
            for(int i = 0; i < fileLabels.length; i++)
            {
                filesFrame.setLayout(new GridLayout(((ProjectGoldStarsX.noteNames.size() + ProjectGoldStarsX.photoNames.size() - 1) / 3) + 1, 3));
                fileLabels[i].setFont(ProjectGoldStarsX.mediumText1);
                fileLabels[i].setForeground(ProjectGoldStarsX.secondaryColor);
                filesFrame.add(fileLabels[i]);
            }
        }
        filesFrame.makeVisible();
    }
    
    //Returns the JMenuBar that will be added to the ProgramWindow
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.mainColor);    //Set the background color of the menu bar
        menuBar.add(filesFrame.getCloseButton());   //Add a Close button to the menu bar
        menuBar.add(filesFrame.getMaximizeButton());    //Add a Maximize button to the menu bar
        menuBar.add(filesFrame.getWindowMenu());    //Add the Window menu to the menu bar
        menuBar.add(new StandardButton("Create a Note", new ListenersNotes.CreateNoteListener()));   //Add a "Create a Note" button to the menu bar
        menuBar.add(new StandardButton("Import Notes", new ListenersNotes.ImportNotesListener()));   //Add an "Import Notes" button to the menu bar
        menuBar.add(new StandardButton("Import Photos", new ListenersPhotos.ImportPhotosListener()));    //Add an "Import Photos" button to the menu bar
        setupSearchField();
        menuBar.add(filesSearchField);  //Add a search text field to the menu bar
        menuBar.add(new StandardButton("Search", new SearchFilesListener()));    //Add a Search button to the menu bar
        menuBar.add(moreMenu());    //Add the More menu to the menu bar
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Files", new AboutFilesListener()));
        return menu.getMenu();
    }
    
    private void setupSearchField()
    {
        filesSearchField = new JTextField();
        filesSearchField.setText("Search Files");
        filesSearchField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            filesSearchField.setForeground(ProjectGoldStarsX.secondaryColor);
        }
        else
        {
            filesSearchField.setForeground(ProjectGoldStarsX.mainColor);
        }
        filesSearchField.addActionListener(new SearchFilesListener());
    }
    
    public static class SearchFilesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            FilesSearch sf = new FilesSearch(filesSearchField.getText());
            filesSearchField.setText("");
        }
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
    
    public static class AboutFilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            AboutPrograms.aboutFiles();
        }
    }
}