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
public class Files
{
    public Files()
    {
        files();
    }
    
    public static JInternalFrame filesFrame;
    public static JTextField filesSearchTextField;
    
    private void files()
    {
        filesFrame = new JInternalFrame("Files");
        ProjectGoldStarsX.desktop.add(filesFrame);
        filesFrame.setFrameIcon(ProjectGoldStarsXIconMini.getIcon());
        filesFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        filesFrame.getContentPane().setBackground(ProjectGoldStarsX.color1);
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
                fileLabels[i].setForeground(ProjectGoldStarsX.color2);
                filesFrame.add(fileLabels[i]);
            }
        }
        filesFrame.setVisible(true);
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(Components.closeButton(new CloseListener()));
        menuBar.add(Components.maximizeButton(new MaximizeListener()));
        menuBar.add(Components.standardButton("Create a Note", new ListenersNotes.CreateNoteListener()));
        menuBar.add(Components.standardButton("Import Notes", new ListenersNotes.ImportNotesListener()));
        menuBar.add(Components.standardButton("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        setupSearchField();
        menuBar.add(filesSearchTextField);
        menuBar.add(Components.standardButton("Search", new SearchFilesListener()));
        return menuBar;
    }
    
    private void setupSearchField()
    {
        filesSearchTextField = new JTextField();
        filesSearchTextField.setText("Search Files");
        filesSearchTextField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            filesSearchTextField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            filesSearchTextField.setForeground(ProjectGoldStarsX.color1);
        }
        filesSearchTextField.addActionListener(new SearchFilesListener());
    }
    
    public static class CloseListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            filesFrame.dispose();
        }
    }
    
    public static class MaximizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ProjectGoldStarsX.desktop.getDesktopManager().maximizeFrame(filesFrame);
        }
    }
    
    public static class SearchFilesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            FilesSearch sf = new FilesSearch(filesSearchTextField.getText());
            filesSearchTextField.setText("");
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
}