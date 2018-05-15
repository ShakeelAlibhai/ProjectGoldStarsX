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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Photos
{
    public Photos()
    {
        photos();
    }
    
    public static ProgramWindow viewPhotosFrame;
    public static JTextField photosSearchField;
    
    private void photos()
    {
        viewPhotosFrame = new ProgramWindow("Photos");
        viewPhotosFrame.setSize(1100 * ProjectGoldStarsX.multiplier, 600 * ProjectGoldStarsX.multiplier);
        viewPhotosFrame.setJMenuBar(menuBar());
        ArrayList<String> files = new ArrayList<String>();
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            files.add(ProjectGoldStarsX.photoNames.get(i));
        }
        JLabel[] fileLabels = new JLabel[files.size()];
        for(int i = 0; i < ProjectGoldStarsX.photoNames.size(); i++)
        {
            fileLabels[i] = new JLabel("Photo " + (i + 1), SwingConstants.CENTER);
            fileLabels[i].addMouseListener(new FileListener(files.get(i), true));
        }
        //If no photos have been saved to Project GoldStars X yet
        if(fileLabels.length == 0)
        {
            viewPhotosFrame.add(Components.titleLabel("You haven't saved any photos to Project GoldStars X yet!"));
        }
        else
        {
            for(int i = 0; i < fileLabels.length; i++)
            {
                viewPhotosFrame.setLayout(new GridLayout(((ProjectGoldStarsX.photoNames.size() - 1) / 3) + 1, 3));
                fileLabels[i].setFont(ProjectGoldStarsX.mediumText1);
                fileLabels[i].setForeground(ProjectGoldStarsX.color2);
                viewPhotosFrame.add(fileLabels[i]);
            }
        }
        viewPhotosFrame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsX.color1);
        menuBar.add(viewPhotosFrame.getCloseButton());
        menuBar.add(viewPhotosFrame.getMaximizeButton());
        menuBar.add(viewPhotosFrame.getWindowMenu());
        menuBar.add(Components.standardButton("Import Photos", new ListenersPhotos.ImportPhotosListener()));
        menuBar.add(Components.settingsButton("Photos Settings", new ListenersPhotos.PhotosSettingsListener()));
        setupSearchField();
        menuBar.add(photosSearchField);
        menuBar.add(Components.standardButton("Search", new SearchPhotosListener()));
        menuBar.add(moreMenu());
        return menuBar;
    }
    
    private JMenu moreMenu()
    {
        StandardMenu menu = new StandardMenu("More");
        menu.add(Components.standardMenuItem("About Photos", new ListenersPhotos.AboutPhotosListener()));
        return menu.getMenu();
    }
    
    private void setupSearchField()
    {
        photosSearchField = new JTextField();
        photosSearchField.setText("Search Photos");
        photosSearchField.setFont(ProjectGoldStarsX.bodyText2);
        if(ProjectGoldStarsX.standardColors)
        {
            photosSearchField.setForeground(ProjectGoldStarsX.color2);
        }
        else
        {
            photosSearchField.setForeground(ProjectGoldStarsX.color1);
        }
        photosSearchField.addActionListener(new SearchPhotosListener());
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
                JFrame viewNoteFrame = new JFrame("Notes");
                viewNoteFrame.setSize(750, 400);
                JTextArea viewNoteTextArea = new JTextArea(toDisplay);
                viewNoteTextArea.setEditable(false);
                viewNoteTextArea.setFont(ProjectGoldStarsX.bodyText2);
                viewNoteFrame.add(viewNoteTextArea);
                viewNoteFrame.setVisible(true);
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
    
    public static class SearchPhotosListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new PhotosSearch(photosSearchField.getText());
            photosSearchField.setText("");
        }
    }
}